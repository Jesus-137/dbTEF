package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "ventas")

public class VentasModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "folio_producto")
    private int folio_producto;

    @Column(name = "venta_mes")
    private int venta_mes;

    @Column(name = "mes")
    private String mes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFolio_producto() {
        return folio_producto;
    }

    public void setFolio_producto(int folio_producto) {
        this.folio_producto = folio_producto;
    }

    public int getVenta_mes() {
        return venta_mes;
    }

    public void setVenta_mes(int venta_mes) {
        this.venta_mes = venta_mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
