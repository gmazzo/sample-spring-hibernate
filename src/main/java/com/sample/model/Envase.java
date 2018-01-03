package com.sample.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "envases")
public class Envase {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "volumen")
    private float volume;

    @Column(name = "factor")
    private float factor;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "imagen")
    private String image;

    @Column(name = "activo")
    private int top;

    @ManyToMany(mappedBy = "envases")
    private List<Cerveza> cervezas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getFactor() {
        return factor;
    }

    public void setFactor(float factor) {
        this.factor = factor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Cerveza> getCervezas() {
        return cervezas;
    }

    public void setCervezas(List<Cerveza> cervezas) {
        this.cervezas = cervezas;
    }
}
