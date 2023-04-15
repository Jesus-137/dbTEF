package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.VentasDao;
import com.basedatos.basededatos.models.VentasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class VentasService {
    @Autowired
    VentasDao ventasDao;

    public List<VentasModel> getAll(){
        return ventasDao.getVAll();
    }

    public VentasModel get( long id){

        return ventasDao.getV(id);
    }

    public VentasModel register( VentasModel ventasModel){
        return ventasDao.registerV(ventasModel);
    }

    public VentasModel update(@RequestBody VentasModel ventasModel){
        return ventasDao.updateV(ventasModel);
    }

    public void delete(@PathVariable long id){
        ventasDao.deleteV(id);
    }
}
