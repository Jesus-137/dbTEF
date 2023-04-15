package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.VentasModel;

import java.util.List;

public interface VentasDao {
    List<VentasModel> getVAll();
    VentasModel getV( long id);
    VentasModel registerV( VentasModel ventasModel);
    VentasModel updateV( VentasModel ventasModel);
    void deleteV(  long id);

}
