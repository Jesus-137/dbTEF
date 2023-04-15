package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "producto")

public class Producto {
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

    @Column (nmae = "")
}
