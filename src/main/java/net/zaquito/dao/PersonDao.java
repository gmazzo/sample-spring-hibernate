package net.zaquito.dao;

import net.zaquito.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonDao extends JpaRepository<Person, Integer> {

    List<Person> findByName(String name);

}
