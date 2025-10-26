package com.chandu.springboot_dynamodb1.Entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Address {


    @DynamoDBAttribute
    private String state;

    @DynamoDBAttribute
    private String country;


    public Address() {
    }

    public Address(String state, String country) {
        this.state = state;
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
