package com.springboot3.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class Person {

    @Id private String id;
    private String name;

    public Person() {
        // Make JPA Happy :)
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Person [id=%s, name=%s]", id, name);
    }
}