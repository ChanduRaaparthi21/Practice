package com.chandu.springboot_dynamodb1.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.chandu.springboot_dynamodb1.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepo {


    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Person save(Person person) {
     dynamoDBMapper.save(person);
     return person;
    }


    public Person findPersonById(String personId){
        return dynamoDBMapper.load(Person.class,personId);
    }

    public String deletePerson(Person person){
         dynamoDBMapper.delete(person);
         return "removed";
    }

    public String updatePerson(Person person){
        dynamoDBMapper.save(person,buildExperssion(person));
        return "updated";
    }

    private DynamoDBSaveExpression buildExperssion(Person person){
        DynamoDBSaveExpression dynamoDBSaveExpression = new DynamoDBSaveExpression();
        Map<String, ExpectedAttributeValue> expectedValue = new HashMap<>();
        expectedValue.put("personId", new ExpectedAttributeValue(new AttributeValue().withS(person.getPersonId())));
        dynamoDBSaveExpression.setExpected(expectedValue);
        return  dynamoDBSaveExpression;
    }

}
