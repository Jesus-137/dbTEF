package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.MaquinaDao;
import com.basedatos.basededatos.models.MaquinaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class MaquinaService {
    @Autowired
    MaquinaDao maquinaDao;

    public List<MaquinaModel> getAll(){
        return maquinaDao.getMAll();
    }

    public MaquinaModel get( long id){

        return maquinaDao.getM(id);
    }

    public MaquinaModel register( MaquinaModel maquinaModel){
        return maquinaDao.registerM(maquinaModel);
    }

    public MaquinaModel update(@RequestBody MaquinaModel maquinaModel){
        return maquinaDao.updateM(maquinaModel);
    }

    public void delete(@PathVariable long id){
        maquinaDao.deleteM(id);
    }
}
