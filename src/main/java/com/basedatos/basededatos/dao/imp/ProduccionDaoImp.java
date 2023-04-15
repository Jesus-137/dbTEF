package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.ProduccionDao;
import com.basedatos.basededatos.models.ProduccionModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class ProduccionDaoImp implements ProduccionDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<ProduccionModel> getPRAll(){
        String hql = "FROM ProduccionModel as u";
        return (List<ProduccionModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public ProduccionModel getPR( long id){
        return entityManager.find(ProduccionModel.class, id);

    }
    @Transactional
    @Override
    public ProduccionModel registerPR( ProduccionModel produccionModel){
        entityManager.merge(produccionModel);
        return produccionModel;
    }
    @Transactional
    @Override
    public ProduccionModel updatePR( ProduccionModel produccionModel){
        entityManager.merge(produccionModel);
        return produccionModel;
    }
    @Transactional
    @Override
    public void deletePR(  long id){
        ProduccionModel produccionModel = getPR(id);
        entityManager.remove(produccionModel);
    }
}
