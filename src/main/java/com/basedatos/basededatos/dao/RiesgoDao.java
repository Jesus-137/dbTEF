package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.RiesgoModel;

import java.util.List;

public interface RiesgoDao {
    List<RiesgoModel> getRAll();
    RiesgoModel getR( long id);
    RiesgoModel registerR( RiesgoModel riesgoModel);
    RiesgoModel updateR( RiesgoModel riesgoModel);
    void deleteR(  long id);
}
