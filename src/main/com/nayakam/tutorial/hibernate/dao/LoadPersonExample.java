package com.nayakam.tutorial.hibernate.dao;

import com.nayakam.tutorial.hibernate.model.Person;
import com.nayakam.tutorial.hibernate.util.JPAUtil;

import javax.persistence.EntityManager;
import java.text.SimpleDateFormat;


public class LoadPersonExample {
    public static void main(String[] args) {
        EntityManager entityManager = null;
        try {
            entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
            entityManager.getTransaction().begin();

            Person person = entityManager.find(Person.class, 1l);
            System.out.println("First Name = " + person.getFirstName());
            System.out.println("Middle Name = " + person.getMiddleName());
            System.out.println("Last Name = " + person.getLastName());
            System.out.println("DOB = " + new SimpleDateFormat("yyyy-MM-dd")
                    .format(person.getDob()));

            entityManager.getTransaction().commit();
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