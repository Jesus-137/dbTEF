package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "meta")

public class MetaModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "folio")
    private int folio;
    @Column(name = "dinero_alcanzar")
    private float dinero_alcanzar;

    @Column(name = "fecha_ultimo_mantenimiento")
    private float fecha_ultimo_mantenimiento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public float getDinero_alcanzar() {
        return dinero_alcanzar;
    }

    public void setDinero_alcanzar(float dinero_alcanzar) {
        this.dinero_alcanzar = dinero_alcanzar;
    }

    public float getFecha_ultimo_mantenimiento() {
        return fecha_ultimo_mantenimiento;
    }

    public void setFecha_ultimo_mantenimiento(float fecha_ultimo_mantenimiento) {
        this.fecha_ultimo_mantenimiento = fecha_ultimo_mantenimiento;
    }
}
