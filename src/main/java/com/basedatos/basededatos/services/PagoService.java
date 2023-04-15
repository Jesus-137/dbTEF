package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.PagoDao;
import com.basedatos.basededatos.dao.VentasDao;
import com.basedatos.basededatos.models.PagoModel;
import com.basedatos.basededatos.models.VentasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class PagoService {
    @Autowired
    PagoDao pagoDao;

    public List<PagoModel> getAll(){
        return pagoDao.getGAll();
    }

    public PagoModel get( long id){

        return pagoDao.getG(id);
    }

    public PagoModel register( PagoModel pagoModel){
        return pagoDao.registerG(pagoModel);
    }

    public PagoModel update(@RequestBody PagoModel pagoModel){
        return pagoDao.updateG(pagoModel);
    }

    public void delete(@PathVariable long id){
        pagoDao.deleteG(id);
    }
}
