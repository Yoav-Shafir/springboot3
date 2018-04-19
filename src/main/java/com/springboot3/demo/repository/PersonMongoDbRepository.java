package com.springboot3.demo.repository;

import com.springboot3.demo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonMongoDbRepository extends MongoRepository<Person, String> {
    List<Person> findByName(String name);
    Long countByName(String name);
}