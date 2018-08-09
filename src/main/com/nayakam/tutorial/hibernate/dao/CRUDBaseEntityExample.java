package com.nayakam.tutorial.hibernate.dao;

import com.nayakam.tutorial.hibernate.model.BaseEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class CRUDBaseEntityExample {

    private EntityManager entityManager = null;

    public CRUDBaseEntityExample(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void createBaseEntity(BaseEntity baseEntity) {
        try {
            this.entityManager.getTransaction().begin();
            // Save entity
            this.entityManager.persist(baseEntity);

            this.entityManager.getTransaction().commit();
            System.out.println("BaseEntity saved successfully - " + baseEntity);
        } catch (Exception e) {
            e.printStackTrace();
            if (this.entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                this.entityManager.getTransaction().rollback();
            }
        }
    }

    public <T> List<T> readAllBaseEntity(Class<T> entityClass) {

        List<T> entities = null;
        try {
            this.entityManager.getTransaction().begin();
            entities = this.entityManager.createQuery("Select t from " + entityClass.getSimpleName() + " t").getResultList();
            this.entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (this.entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                this.entityManager.getTransaction().rollback();
            }
        }
        return entities;
    }
}
