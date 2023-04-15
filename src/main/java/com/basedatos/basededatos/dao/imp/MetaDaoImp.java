package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.MetaDao;
import com.basedatos.basededatos.models.MetaModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class MetaDaoImp implements MetaDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<MetaModel> getMAll(){
        String hql = "FROM MetaModel as u";
        return (List<MetaModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public MetaModel getM( long id){
        return entityManager.find(MetaModel.class, id);

    }
    @Transactional
    @Override
    public MetaModel registerM( MetaModel metaModel){
        entityManager.merge(metaModel);
        return metaModel;
    }
    @Transactional
    @Override
    public MetaModel updateM( MetaModel metaModel){
        entityManager.merge(metaModel);
        return metaModel;
    }
    @Transactional
    @Override
    public void deleteM(  long id){
        MetaModel metaModel = getM(id);
        entityManager.remove(metaModel);
    }
}
