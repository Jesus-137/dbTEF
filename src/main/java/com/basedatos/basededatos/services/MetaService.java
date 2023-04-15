package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.MetaDao;
import com.basedatos.basededatos.dao.RiesgoDao;
import com.basedatos.basededatos.models.MetaModel;
import com.basedatos.basededatos.models.RiesgoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class MetaService {
    @Autowired
    MetaDao metaDao;

    public List<MetaModel> getAll(){
        return metaDao.getMAll();
    }

    public MetaModel get( long id){

        return metaDao.getM(id);
    }

    public MetaModel register( MetaModel metaModel){
        return metaDao.registerM(metaModel);
    }

    public MetaModel update(@RequestBody MetaModel metaModel){
        return metaDao.updateM(metaModel);
    }

    public void delete(@PathVariable long id){
        metaDao.deleteM(id);
    }
}
