package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "pagos")

public class PagoModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_pago")
    private String nombre_pago;

    @Column(name = "cantidad_pago")
    private float cantidad_pago;

    @Column(name = "periodo_pago")
    private String periodo_pago;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_pago() {
        return nombre_pago;
    }

    public void setNombre_pago(String nombre_pago) {
        this.nombre_pago = nombre_pago;
    }

    public float getCantidad_pago() {
        return cantidad_pago;
    }

    public void setCantidad_pago(float cantidad_pago) {
        this.cantidad_pago = cantidad_pago;
    }

    public String getPeriodo_pago() {
        return periodo_pago;
    }

    public void setPeriodo_pago(String periodo_pago) {
        this.periodo_pago = periodo_pago;
    }
}
