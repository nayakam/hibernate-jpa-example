package com.nayakam.tutorial.hibernate;

import com.nayakam.tutorial.hibernate.dao.CRUDPersonExample;
import com.nayakam.tutorial.hibernate.model.Person;
import com.nayakam.tutorial.hibernate.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Calendar;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

        CRUDPersonExample crudPersonExample = new CRUDPersonExample(JPAUtil.getEntityManagerFactory().createEntityManager());
        crudPersonExample.createPerson(MainApp.getPerson());
        Person person = crudPersonExample.readPerson(1L);
        System.out.println("Person With ID:1 - " + person);
        List<Person> persons = crudPersonExample.readAllPerson();
        System.out.println("All Persons:" + persons);

        entityManager.close();
        JPAUtil.shutdown();
    }

    private static List<String> getAllTable(EntityManager entityManager) {
        entityManager.getTransaction().begin();

        // Check database version
        // String sql = "select version()";
        String sql = " SELECT TABLE_NAME FROM INFORMATION_SCHEMA.SYSTEM_TABLES where TABLE_TYPE='TABLE'";

        List result = entityManager.createNativeQuery(sql).getResultList();
        System.out.println("TABLES:" + result);

        entityManager.getTransaction().commit();
        return result;
    }

    private static Person getPerson() {
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
        return person;
    }
}