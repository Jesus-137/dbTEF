package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.MaquinaDao;
import com.basedatos.basededatos.models.MaquinaModel;
import com.basedatos.basededatos.models.ProductoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class MaquinaDaoImp implements MaquinaDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<MaquinaModel> getMAll(){
        String hql = "FROM MaquinaModel as u";
        return (List<MaquinaModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public MaquinaModel getM( long id){
        return entityManager.find(MaquinaModel.class, id);

    }
    @Transactional
    @Override
    public MaquinaModel registerM( MaquinaModel maquinaModel){
        entityManager.merge(maquinaModel);
        return maquinaModel;
    }
    @Transactional
    @Override
    public MaquinaModel updateM( MaquinaModel maquinaModel){
        entityManager.merge(maquinaModel);
        return maquinaModel;
    }
    @Transactional
    @Override
    public void deleteM(  long id){
        MaquinaModel maquinaModel = getM(id);
        entityManager.remove(maquinaModel);
    }
}
