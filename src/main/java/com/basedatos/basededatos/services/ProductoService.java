package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.dao.VentasDao;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.models.VentasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class ProductoService {
    @Autowired
    ProductoDao productoDao;

    public List<ProductoModel> getAll(){
        return productoDao.getPAll();
    }

    public ProductoModel get( long id){

        return productoDao.getP(id);
    }

    public ProductoModel register( ProductoModel productoModel){
        return productoDao.registerP(productoModel);
    }

    public ProductoModel update(@RequestBody ProductoModel productoModel){
        return productoDao.updateP(productoModel);
    }

    public void delete(@PathVariable long id){
        productoDao.deleteP(id);
    }
}
