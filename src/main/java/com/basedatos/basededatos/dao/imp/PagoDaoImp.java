package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.PagoDao;
import com.basedatos.basededatos.models.PagoModel;
import com.basedatos.basededatos.models.VentasModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class PagoDaoImp implements PagoDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<PagoModel> getGAll(){
        String hql = "FROM PagoModel as u";
        return (List<PagoModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public PagoModel getG( long id){
        return entityManager.find(PagoModel.class, id);

    }
    @Transactional
    @Override
    public PagoModel registerG( PagoModel pagoModel){
        entityManager.merge(pagoModel);
        return pagoModel;
    }
    @Transactional
    @Override
    public PagoModel updateG( PagoModel pagoModel){
        entityManager.merge(pagoModel);
        return pagoModel;
    }
    @Transactional
    @Override
    public void deleteG(  long id){
        PagoModel pagoModel = getG(id);
        entityManager.remove(pagoModel);
    }
}
