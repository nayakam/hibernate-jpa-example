package com.nayakam.tutorial.hibernate.dao;

import com.nayakam.tutorial.hibernate.model.Person;

import javax.persistence.EntityManager;

public class CRUDTemplateExample {

    private EntityManager entityManager = null;

    public CRUDTemplateExample(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void createPerson(Person person) {
        try {
            this.entityManager.getTransaction().begin();
            // Save entity
            this.entityManager.persist(person);

            this.entityManager.getTransaction().commit();
            System.out.println("Person saved successfully - " + person);
        } catch (Exception e) {
            e.printStackTrace();
            if (this.entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                this.entityManager.getTransaction().rollback();
            }
        }
    }
}
