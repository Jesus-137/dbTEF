package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "riesgo")

public class RiesgoModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "riesgo_cercano")
    private String riesgo_cercano;

    @Column(name = "impacto_economico")
    private float impacto_economico;

    @Column(name = "numeros_luegares_afectados")
    private int numeros_lugares_afectados;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRiesgo_cercano() {
        return riesgo_cercano;
    }

    public void setRiesgo_cercano(String riesgo_cercano) {
        this.riesgo_cercano = riesgo_cercano;
    }

    public float getImpacto_economico() {
        return impacto_economico;
    }

    public void setImpacto_economico(float impacto_economico) {
        this.impacto_economico = impacto_economico;
    }

    public int getNumeros_lugares_afectados() {
        return numeros_lugares_afectados;
    }

    public void setNumeros_lugares_afectados(int numeros_lugares_afectados) {
        this.numeros_lugares_afectados = numeros_lugares_afectados;
    }
}
