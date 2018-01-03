package com.sample.controllers;

import com.sample.dao.PersonDao;
import com.sample.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonDao personDao;

    @GetMapping
    public List<Person> getAll(@RequestParam(value = "name", required = false) String name) {
        return StringUtils.isEmpty(name) ? personDao.findAll() : personDao.findByName(name);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") int id) {
        return personDao.findOne(id);
    }

    @PostMapping
    public Person save(@RequestParam(value = "id", required = false) Integer id, @RequestParam("name") String name) {
        Person person = id == null ? new Person() : personDao.findOne(id);
        person.setName(name);
        personDao.save(person);
        return person;
    }

}
