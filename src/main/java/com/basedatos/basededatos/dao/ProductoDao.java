package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.models.VentasModel;

import java.util.List;


public interface ProductoDao {
    List<ProductoModel> getPAll();
    ProductoModel getP( long id);
    ProductoModel registerP( ProductoModel productoModel);
    ProductoModel updateP( ProductoModel productoModel);
    void deleteP(  long id);
}
