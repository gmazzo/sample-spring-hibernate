package com.sample.dao;

import com.sample.model.Cerveza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonDao extends JpaRepository<Cerveza, Integer> {

    List<Cerveza> findByName(String name);

}
