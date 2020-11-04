package com.events.example.service;

import com.events.example.dto.Person;
import com.events.example.event.publisher.ChangeEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private ChangeEventPublisher publisher;

    public PersonService(ChangeEventPublisher publisher){
        this.publisher = publisher;
    }

    public Person createPerson(String firstname, String lastname) {
        Person person = new Person();
        person.setFirstname(firstname);
        person.setLastname(lastname);

        //Emit Event
        this.publisher.publishPersonChange(person);

        return person;
    }
}
