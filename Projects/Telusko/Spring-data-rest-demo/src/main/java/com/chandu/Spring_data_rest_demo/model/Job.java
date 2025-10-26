package com.chandu.Spring_data_rest_demo.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Component
@Entity
public class Job {
	@Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public Job() {
    }

    public Job(int postId, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    // Getters and Setters
    public int getPostId() { return postId; }
    public void setPostId(int postId) { this.postId = postId; }

    public String getPostProfile() { return postProfile; }
    public void setPostProfile(String postProfile) { this.postProfile = postProfile; }

    public String getPostDesc() { return postDesc; }
    public void setPostDesc(String postDesc) { this.postDesc = postDesc; }

    public Integer getReqExperience() { return reqExperience; }
    public void setReqExperience(Integer reqExperience) { this.reqExperience = reqExperience; }

    public List<String> getPostTechStack() { return postTechStack; }
    public void setPostTechStack(List<String> postTechStack) { this.postTechStack = postTechStack; }
    
    
    public void setPostTechStack(String techStack) {
        this.postTechStack = Arrays.asList(techStack.split(","));
    }
}
