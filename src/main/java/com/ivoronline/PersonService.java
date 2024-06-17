package com.ivoronline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired private PersonRepository personRepository;

    public void insertRecords() {
        for (int age = 1; age <= 2; age++) {
            if(age==2) { throw new RuntimeException("Exception"); }
            personRepository.save(new Person(0, "John", age));
            System.out.println("Record inserted");
        }
    }

}
