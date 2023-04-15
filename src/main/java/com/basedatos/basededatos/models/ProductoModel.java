package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "producto")

public class ProductoModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre_producto")
    private String nombre_producto;

    @Column(name = "precio")
    private int precio;

    @Column(name = "importe_dia")
    private String importe_dia;

    @Column (name = "folio")
    private int folio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getImporte_dia() {
        return importe_dia;
    }

    public void setImporte_dia(String importe_dia) {
        this.importe_dia = importe_dia;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }
}
