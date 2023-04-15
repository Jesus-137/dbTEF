package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.dao.RiesgoDao;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.models.RiesgoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class RiesgoService {
    @Autowired
    RiesgoDao riesgoDao;

    public List<RiesgoModel> getAll(){
        return riesgoDao.getRAll();
    }

    public RiesgoModel get( long id){

        return riesgoDao.getR(id);
    }

    public RiesgoModel register( RiesgoModel riesgoModel){
        return riesgoDao.registerR(riesgoModel);
    }

    public RiesgoModel update(@RequestBody RiesgoModel riesgoModel){
        return riesgoDao.updateR(riesgoModel);
    }

    public void delete(@PathVariable long id){
        riesgoDao.deleteR(id);
    }
}
