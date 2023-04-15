package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.ProductoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class ProductoDaoImp implements ProductoDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<ProductoModel> getPAll(){
        String hql = "FROM ProductoModel as u";
        return (List<ProductoModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public ProductoModel getP( long id){
        return entityManager.find(ProductoModel.class, id);

    }
    @Transactional
    @Override
    public ProductoModel registerP( ProductoModel productoModel){
        entityManager.merge(productoModel);
        return productoModel;
    }
    @Transactional
    @Override
    public ProductoModel updateP( ProductoModel productoModel){
        entityManager.merge(productoModel);
        return productoModel;
    }
    @Transactional
    @Override
    public void deleteP(  long id){
        ProductoModel productoModel = getP(id);
        entityManager.remove(productoModel);
    }
}
