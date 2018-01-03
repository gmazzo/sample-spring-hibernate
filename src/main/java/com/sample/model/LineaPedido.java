package com.sample.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "linea_pedidos")
public class LineaPedido {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cerveza")
    private Cerveza cerveza;

    @ManyToOne
    @JoinColumn(name = "id_envase")
    private Envase envase;

    @Column(name = "cantidad")
    private int quantity;

    @Column(name = "precio")
    private float price;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cerveza getCerveza() {
        return cerveza;
    }

    public void setCerveza(Cerveza cerveza) {
        this.cerveza = cerveza;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
