package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.VentasDao;
import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.models.VentasModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class VentasDaoImp implements VentasDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<VentasModel> getVAll(){
        String hql = "FROM VentasModel as u";
        return (List<VentasModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public VentasModel getV( long id){
        return entityManager.find(VentasModel.class, id);

    }
    @Transactional
    @Override
    public VentasModel registerV( VentasModel ventasModel){
        entityManager.merge(ventasModel);
        return ventasModel;
    }
    @Transactional
    @Override
    public VentasModel updateV( VentasModel ventasModel){
        entityManager.merge(ventasModel);
        return ventasModel;
    }
    @Transactional
    @Override
    public void deleteV(  long id){
        VentasModel ventasModel = getV(id);
        entityManager.remove(ventasModel);
    }
}
