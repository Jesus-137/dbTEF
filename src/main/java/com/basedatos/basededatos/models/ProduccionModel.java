package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "produccion")

public class ProduccionModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "costo_dia")
    private float costo_dia;

    @Column(name = "cantidad")
    private float cantidad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getCosto_dia() {
        return costo_dia;
    }

    public void setCosto_dia(float costo_dia) {
        this.costo_dia = costo_dia;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
}
