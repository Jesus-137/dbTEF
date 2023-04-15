package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.ProduccionModel;

import java.util.List;

public interface ProduccionDao {
    List<ProduccionModel> getPRAll();
    ProduccionModel getPR( long id);
    ProduccionModel registerPR( ProduccionModel produccionModel);
    ProduccionModel updatePR( ProduccionModel produccionModel);
    void deletePR(  long id);
}
