package com.sample.dao;

import com.sample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonDao extends JpaRepository<Person, Integer> {

    List<Person> findByName(String name);

}
