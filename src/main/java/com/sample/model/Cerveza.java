package com.sample.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cervezas")
public class Cerveza {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "precio")
    private float price;

    @Column(name = "imagen")
    private String image;

    @Column(name = "activo")
    private int top;

    @ManyToMany
    @JoinTable(name="envasesxcervezas",
    joinColumns = @JoinColumn(name = "id_envase"),
    inverseJoinColumns = @JoinColumn(name = "id_cerveza"))
    private List<Envase> envases;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public List<Envase> getEnvases() {
        return envases;
    }

    public void setEnvases(List<Envase> envases) {
        this.envases = envases;
    }
}
