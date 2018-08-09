package com.nayakam.tutorial.hibernate;

import com.nayakam.tutorial.hibernate.dao.CRUDBaseEntityExample;
import com.nayakam.tutorial.hibernate.dao.CRUDPersonExample;
import com.nayakam.tutorial.hibernate.model.*;
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

        loadDomainType(entityManager);
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
        MainApp.loadDomainType(entityManager);
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

    private static void loadDomainType(EntityManager entityManager) {
        CRUDBaseEntityExample crudBaseEntityExample = new CRUDBaseEntityExample(entityManager);
        print(crudBaseEntityExample, Person.class);
        print(crudBaseEntityExample, Student.class);
        crudBaseEntityExample.createBaseEntity(getTemplateField("GROUP_KEY"));

        print(crudBaseEntityExample, TemplateField.class);
        crudBaseEntityExample.createBaseEntity(getTemplateSection("GROUP_KEY"));
        System.out.println("Field Details:" + crudBaseEntityExample.readAllBaseEntity(TemplateSection.class).get(0).getFields());
        crudBaseEntityExample.createBaseEntity(getTemplateSection("GROUP_KEY_1"));
        print(crudBaseEntityExample, TemplateSection.class);

    }

    private static void print(CRUDBaseEntityExample crudBaseEntityExample, Class entityClass) {
        List result = crudBaseEntityExample.readAllBaseEntity(entityClass);
        System.out.println(result);
    }

    private static TemplateField getTemplateField(String groupKey) {
        TemplateField tf = new TemplateField();
        //tf.setId(id);
        tf.setGroupKey(groupKey);
        tf.setName("TemplateField_NAME_" + groupKey);
        tf.setFieldType(PackageFieldType.TEXT);
        return tf;
    }

    private static TemplateSection getTemplateSection(String groupKey) {
        TemplateSection ts = new TemplateSection();
        //tf.setId(id);
        ts.setFieldGroupKey(groupKey);
        ts.setName("TemplateSection_NAME_" + groupKey);
        return ts;
    }
}