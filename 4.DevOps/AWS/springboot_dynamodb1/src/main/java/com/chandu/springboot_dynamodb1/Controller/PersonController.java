package com.chandu.springboot_dynamodb1.Controller;

import com.chandu.springboot_dynamodb1.Entity.Person;
import com.chandu.springboot_dynamodb1.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonRepo personRepo;


    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person){
        return personRepo.save(person);
    }

    @GetMapping("/getPerson/{personId}")
    public Person findById(@PathVariable String personId){
      return  personRepo.findPersonById(personId);
    }


    @DeleteMapping("/deletePerson")
    public String deletePerson(Person person){
return personRepo.deletePerson(person);
    }

    @PutMapping("/editPerson")
    public String updatedPerson(@RequestBody Person person){
        return personRepo.updatePerson(person);

    }

}
