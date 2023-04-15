package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.MetaModel;

import java.util.List;

public interface MetaDao {
    List<MetaModel> getMAll();
    MetaModel getM( long id);
    MetaModel registerM( MetaModel metaModel);
    MetaModel updateM( MetaModel metaModel);
    void deleteM(  long id);
}
