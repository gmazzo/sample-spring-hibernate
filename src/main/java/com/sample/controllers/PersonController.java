package com.sample.controllers;

import com.sample.dao.PersonDao;
import com.sample.model.Cerveza;
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
    public List<Cerveza> getAll(@RequestParam(value = "name", required = false) String name) {
        return StringUtils.isEmpty(name) ? personDao.findAll() : personDao.findByName(name);
    }

    @GetMapping("/{id}")
    public Cerveza findById(@PathVariable("id") int id) {
        return personDao.findOne(id);
    }

    @PostMapping
    public Cerveza save(@RequestParam(value = "id", required = false) Integer id, @RequestParam("name") String name) {
        Cerveza person = id == null ? new Cerveza() : personDao.findOne(id);
        person.setName(name);
        personDao.save(person);
        return person;
    }

}
