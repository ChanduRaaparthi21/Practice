package com.chandu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandu.model.Job;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer>{	
	
	List<Job> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
	
}


//arrayList to store store JobPost objects
//List<Job> jobs = 
//		new ArrayList<>(List.of(
//				new Job(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
//				new Job(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
//				 new Job(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
//				 new Job(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
//				 new Job(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))
//
//		));
//
//public List<Job> findAll() {
//return jobs;
//}
//
//public Optional<Job> findById(int id) {
//return jobs.stream().filter(job -> job.getPostId() == id).findFirst();
//}
//
//public void addJob(Job job) {
//jobs.add(job);
//}
//
//public void deleteById(int id) {
//jobs.removeIf(job -> job.getPostId() == id);
//}
//
//public Job getJob(int postId) {
//// TODO Auto-generated method stub
//for(Job job: jobs) {
//if(job.getPostId()== postId)
//
//return job;
//}
//return null;
//}
//
//public void updateJob(Job job) {
//// TODO Auto-generated method stub
//for(Job job1 : jobs) {
//if(job1.getPostId()== job.getPostId()) {
//job1.setPostProfile(job.getPostProfile());
//job1.setPostDesc(job.getPostDesc());
//job1.setReqExperience(job.getReqExperience());
//job1.setPostTechStack(job.getPostTechStack());
//}
//
//}
//
//}