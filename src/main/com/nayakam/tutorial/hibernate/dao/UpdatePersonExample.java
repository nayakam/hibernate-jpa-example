package com.nayakam.tutorial.hibernate.dao;

import com.nayakam.tutorial.hibernate.model.Person;
import com.nayakam.tutorial.hibernate.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Calendar;


public class UpdatePersonExample {
    public static void main(String[] args) {

        EntityManager entityManager = null;
        try {
            entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
            entityManager.getTransaction().begin();

            Person person = entityManager.find(Person.class, 1l);

            //Detach entity
            entityManager.clear();

            // Update DOB
            Calendar dob = Calendar.getInstance();
            dob.setTime(person.getDob());
            dob.set(Calendar.YEAR, 1847);

            person.setDob(dob.getTime());

            entityManager.merge(person);

            entityManager.getTransaction().commit();
            System.out.println("Person updated successfully");

        } catch (Exception e) {
            e.printStackTrace();
            if (entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        JPAUtil.shutdown();
    }
}