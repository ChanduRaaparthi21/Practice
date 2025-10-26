package com.chandu.fleet.batchConfig;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.chandu.fleet.entity.Hr;
import com.chandu.fleet.repository.HrRepository;

import lombok.AllArgsConstructor;

@Configuration
@EnableBatchProcessing
@AllArgsConstructor
public class batchConfig {

	
	@Autowired
	private HrRepository hrRepository;
	
	
	
	
	//create Reader
	
	@Bean
	public FlatFileItemReader<Hr> hrReader(){
		
		FlatFileItemReader<Hr> itemReader = new FlatFileItemReader<Hr>();
		
		itemReader.setResource(new FileSystemResource("src/main/resources/hr.csv"));
		itemReader.setName("csv-reader");
		itemReader.setLinesToSkip(1);
		itemReader.setEncoding("UTF-8");
		itemReader.setLineMapper(lineMapper());
		
		return itemReader;
	}

	private LineMapper<Hr> lineMapper() {
	    DefaultLineMapper<Hr> lineMapper = new DefaultLineMapper<>();

	    DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
	    lineTokenizer.setDelimiter(","); // Change comma to tab
	    lineTokenizer.setStrict(false);
	    lineTokenizer.setNames("SNo", "Name", "Email", "Title", "Company");

	    BeanWrapperFieldSetMapper<Hr> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
	    fieldSetMapper.setTargetType(Hr.class);

	    lineMapper.setLineTokenizer(lineTokenizer);
	    lineMapper.setFieldSetMapper(fieldSetMapper);

	    return lineMapper;
	}

	
	
	//create Processor
	
	@Bean
	public HrProcessor hrProcessor() {
		
		return new HrProcessor();
	}
	
	//create Writer
	
	@Bean
	public RepositoryItemWriter<Hr> hrWriter(){
		
		RepositoryItemWriter<Hr> repositoryItemWriter = new RepositoryItemWriter<>();
		
		repositoryItemWriter.setRepository(hrRepository);
		repositoryItemWriter.setMethodName("save");
		
		return repositoryItemWriter;
	}
	
	//create Step
	
	@Bean
    public Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step1", jobRepository)
                .<Hr, Hr>chunk(10, transactionManager)
                .reader(hrReader())
                .processor(hrProcessor())
                .writer(hrWriter())
                .build();
    }
	
	//create Job
	
	@Bean
	public Job job(JobRepository jobRepository, Step step1) {
		
		return new JobBuilder("importUserJob", jobRepository)
				.start(step1)
				.build();
	}
	
	
}
