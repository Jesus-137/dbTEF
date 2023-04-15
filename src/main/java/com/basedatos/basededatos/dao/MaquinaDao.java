package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.MaquinaModel;
import com.basedatos.basededatos.models.ProductoModel;

import java.util.List;

public interface MaquinaDao {
    List<MaquinaModel> getMAll();
    MaquinaModel getM( long id);
    MaquinaModel registerM( MaquinaModel maquinaModel);
    MaquinaModel updateM( MaquinaModel maquinaModel);
    void deleteM(  long id);
}
