package com.chandu.ResumeEmailSender.schedulars;

import com.chandu.ResumeEmailSender.model.HrDetails;
import com.chandu.ResumeEmailSender.service.EmailService;
import com.chandu.ResumeEmailSender.service.ExcelReaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class EmailSchedulerService {
    private static final Logger logger = LoggerFactory.getLogger(EmailSchedulerService.class);

    @Autowired
    private ExcelReaderService excelReaderService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${resume.file.path}")
    private String resumePath;

    private List<HrDetails> hrDetailsList;
    private AtomicInteger currentIndex = new AtomicInteger(0);
    private boolean initialized = false;

    // Initialize the HR details list before starting the schedule
    public void initialize() {
        if (!initialized) {
            hrDetailsList = excelReaderService.readHrDetails();
            logger.info("Initialized with {} HR contacts", hrDetailsList.size());
            initialized = true;
        }
    }

 // Schedule to run every 5 minutes
    @Scheduled(fixedDelayString = "${email.send.interval:300000}")
    public void sendNextBatchOfEmails() {
        if (!initialized) {
            initialize();
        }
        if (hrDetailsList == null || hrDetailsList.isEmpty()) {
            logger.warn("No HR details found. Stopping scheduler.");
            shutdownApplication();
            return;
        }

        int index = currentIndex.getAndIncrement();

        if (index >= hrDetailsList.size()) {
            logger.info("All emails have been sent. Shutting down application...");
            shutdownApplication();
            return;
        }

        HrDetails hrDetails = hrDetailsList.get(index);
        sendEmailToHr(hrDetails);

        logger.info("Progress: {}/{} emails sent", index + 1, hrDetailsList.size());
    }

    private void sendEmailToHr(HrDetails hrDetails) {
        String hrEmail = hrDetails.getHrEmail();

        // Validate email
        if (hrEmail == null || hrEmail.trim().isEmpty() || !hrEmail.contains("@")) {
            logger.warn("Skipping invalid email: {}", hrEmail);
            return;
        }

        String subject = "Application for Java Backend Developer | " + hrDetails.getCompanyName() + " | Chandu Raparthi";


        String body = "Dear " + hrDetails.getHrName() + ",\n\n" +
        	    "I hope this email finds you well.\n\n" +
        	    "I'm Chandu Raparthi, a Java Backend Developer with 3 years of experience building secure and scalable applications using Java, Spring Boot, Hibernate, and REST APIs.\n\n" +
        	    "Currently, I’m working at Cybrowse Digital Solutions Pvt. Ltd., Hyderabad, and exploring backend opportunities at " + hrDetails.getCompanyName() + ". " +
        	    "My notice period is 7 days, and I’m available to join immediately after that.\n\n" +
        	    "Please find my resume attached for your reference.\n\n" +
        	    "Best regards,\n" +
        	    "Chandu Raparthi\n" +
        	    "+91 9452301058\n" +
        	    "raaparthichandu@gmail.com\n";


        // Send email with attachment
        try {
            emailService.sendEmailWithAttachment(hrEmail, subject, body, resumePath);
            logger.info("Email sent to: {} at {}", hrEmail, hrDetails.getCompanyName());
        } catch (Exception e) {
            logger.error("Failed to send email to {}: {}", hrEmail, e.getMessage());
        }
    }


    private void shutdownApplication() {
        logger.info("Email sending process completed. Shutting down application...");
        new Thread(() -> {
            try {
                Thread.sleep(5000); // Give logging time to complete
                int exitCode = SpringApplication.exit(applicationContext, () -> 0);
                System.exit(exitCode);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}