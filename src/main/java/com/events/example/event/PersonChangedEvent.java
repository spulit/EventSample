package com.events.example.event;

import com.events.example.dto.Person;
import org.springframework.context.ApplicationEvent;

public class PersonChangedEvent extends ApplicationEvent {

    private Person person;

    public PersonChangedEvent(Person person, Object source) {
        super(source);
        this.person = person;
    }

    public Person getPerson() {
        return this.person;
    }
}
