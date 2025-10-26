 package com.chandu.service;

import com.chandu.model.Job;
import com.chandu.repo.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

	
	
	
    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
//    	int i = 10/0;
        return jobRepository.findAll();
    }

    public void addJob(Job job) {
        jobRepository.save(job);
    }

	public Job getJob(int postId) {
		// TODO Auto-generated method stub
		return jobRepository.findById(postId).orElse(new Job());
	}

	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		jobRepository.save(job);
		
	}

	public void deleteJob(int postId) {
		// TODO Auto-generated method stub
		jobRepository.deleteById(postId);
		
	}

	public void loadData() {
		// TODO Auto-generated method stub
		// arrayList to store store JobPost objects
		List<Job> jobs = 
				new ArrayList<>(List.of(
						new Job(1, "Software Engineer", "Exciting opportunity for a skilled software engineer, API.", 3, List.of("Java", "Spring", "SQL")),
						new Job(2, "Data Scientist", "Join our data science team and work on cutting-edge projects, API.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
						 new Job(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team, API.", 2, List.of("JavaScript", "React", "CSS")),
						 new Job(4, "Network Engineer", "Design and maintain our robust network infrastructure, API.", 4, List.of("Cisco", "Routing", "Firewalls")),
						 new Job(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

				));
		jobRepository.saveAll(jobs);
	}

	public List<Job> search(String keyword) {
		// TODO Auto-generated method stub
		
	return	jobRepository.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
		
	}
}

	
