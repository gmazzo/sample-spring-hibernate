package com.sample.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "fecha_entrega")
    private Date deliveryDate;

    @Column(name = "estado")
    // TODO pasar a enum EstadoPedido
    private int status;

    @Column(name = "horario")
    // TODO pasar a enum HorarioEntrega
    private int hour;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tipo_entrega")
    private TipoEntrega deliveryType;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

    @Column(name = "monto_final")
    private float finalAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public TipoEntrega getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(TipoEntrega deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
