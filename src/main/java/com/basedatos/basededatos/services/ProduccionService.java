package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProduccionDao;
import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.ProduccionModel;
import com.basedatos.basededatos.models.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class ProduccionService {
    @Autowired
    ProduccionDao produccionDao;

    public List<ProduccionModel> getAll(){
        return produccionDao.getPRAll();
    }

    public ProduccionModel get( long id){

        return produccionDao.getPR(id);
    }

    public ProduccionModel register( ProduccionModel produccionModel){
        return produccionDao.registerPR(produccionModel);
    }

    public ProduccionModel update(@RequestBody ProduccionModel produccionModel){
        return produccionDao.updatePR(produccionModel);
    }

    public void delete(@PathVariable long id){
        produccionDao.deletePR(id);
    }
}
