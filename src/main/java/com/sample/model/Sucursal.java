package com.sample.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sucursales")
public class Sucursal {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "direccion")
    private String direction;

    @Column(name = "numero")
    private int number;

    @Column(name = "activo")
    private int top;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
