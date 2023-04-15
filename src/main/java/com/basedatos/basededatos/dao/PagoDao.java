package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.PagoModel;

import java.util.List;

public interface PagoDao {
    List<PagoModel> getGAll();
    PagoModel getG( long id);
    PagoModel registerG( PagoModel pagoModel);
    PagoModel updateG( PagoModel pagoModel);
    void deleteG(  long id);
}
