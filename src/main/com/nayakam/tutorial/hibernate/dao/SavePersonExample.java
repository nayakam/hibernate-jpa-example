package com.nayakam.tutorial.hibernate.dao;

import com.nayakam.tutorial.hibernate.model.Person;
import com.nayakam.tutorial.hibernate.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Calendar;


public class SavePersonExample {
    public static void main(String[] args) {

        EntityManager entityManager = null;
        try {
            entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
            entityManager.getTransaction().begin();

            Person person = new Person();
            person.setFirstName("Thomas");
            person.setMiddleName("Alva");
            person.setLastName("Edison");
            // Set DOB
            Calendar dob = Calendar.getInstance();
            dob.set(Calendar.DATE, 11);
            dob.set(Calendar.MONTH, 02);
            dob.set(Calendar.YEAR, 1947);
            dob.set(Calendar.HOUR_OF_DAY, 0);
            dob.set(Calendar.MINUTE, 0);
            dob.set(Calendar.SECOND, 0);
            dob.set(Calendar.MILLISECOND, 0);
            person.setDob(dob.getTime());

            // Save entity
            entityManager.persist(person);

            entityManager.getTransaction().commit();
            System.out.println("Person saved successfully :" + person);
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