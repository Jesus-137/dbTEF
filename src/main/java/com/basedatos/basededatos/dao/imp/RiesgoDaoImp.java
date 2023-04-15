package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.RiesgoDao;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.models.RiesgoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class RiesgoDaoImp implements RiesgoDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<RiesgoModel> getRAll(){
        String hql = "FROM RiesgoModel as u";
        return (List<RiesgoModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public RiesgoModel getR( long id){
        return entityManager.find(RiesgoModel.class, id);

    }
    @Transactional
    @Override
    public RiesgoModel registerR( RiesgoModel riesgoModel){
        entityManager.merge(riesgoModel);
        return riesgoModel;
    }
    @Transactional
    @Override
    public RiesgoModel updateR( RiesgoModel riesgoModel){
        entityManager.merge(riesgoModel);
        return riesgoModel;
    }
    @Transactional
    @Override
    public void deleteR(  long id){
        RiesgoModel riesgoModel = getR(id);
        entityManager.remove(riesgoModel);
    }
}
