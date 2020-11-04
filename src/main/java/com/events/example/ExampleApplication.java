package com.events.example;

import com.events.example.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);

        PersonService service = context.getBean(PersonService.class);
        service.createPerson("John", "Doe");

        service.createPerson("Kaela", "Jones");
    }

}
