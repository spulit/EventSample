package com.events.example.event.publisher;

import com.events.example.dto.Person;
import com.events.example.event.PersonChangedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ChangeEventPublisher {

    private ApplicationEventPublisher publisher;

    public ChangeEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishPersonChange(Person person) {
        PersonChangedEvent pce = new PersonChangedEvent(person, this);
        this.publisher.publishEvent(pce);
    }
}
