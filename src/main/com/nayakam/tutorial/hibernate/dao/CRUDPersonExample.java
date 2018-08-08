package com.nayakam.tutorial.hibernate.dao;

import com.nayakam.tutorial.hibernate.model.Person;

import javax.persistence.EntityManager;
import java.util.List;

public class CRUDPersonExample {

    private EntityManager entityManager = null;

    public CRUDPersonExample(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void createPerson(Person person) {
        try {
            this.entityManager.getTransaction().begin();

//            Person person = new Person();
//            person.setFirstName("Thomas");
//            person.setMiddleName("Alva");
//            person.setLastName("Edison");
//            // Set DOB
//            Calendar dob = Calendar.getInstance();
//            dob.set(Calendar.DATE, 11);
//            dob.set(Calendar.MONTH, 02);
//            dob.set(Calendar.YEAR, 1947);
//            dob.set(Calendar.HOUR_OF_DAY, 0);
//            dob.set(Calendar.MINUTE, 0);
//            dob.set(Calendar.SECOND, 0);
//            dob.set(Calendar.MILLISECOND, 0);
//            person.setDob(dob.getTime());

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

    public void deletePerson(Long id) {
        try {
            this.entityManager.getTransaction().begin();

            Person person = this.entityManager.find(Person.class, id);

            //Remove entity
            this.entityManager.remove(person);

            this.entityManager.getTransaction().commit();
            System.out.println("Person removed successfully");
        } catch (Exception e) {
            e.printStackTrace();
            if (this.entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                this.entityManager.getTransaction().rollback();
            }
        }
    }


    public List<Person> readAllPerson() {

        List<Person> persons = null;
        try {
            this.entityManager.getTransaction().begin();
            persons = this.entityManager.createQuery("Select t from " + Person.class.getSimpleName() + " t").getResultList();
            this.entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (this.entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                this.entityManager.getTransaction().rollback();
            }
        }
        return persons;
    }

    public Person readPerson(Long id) {
        Person person = null;
        try {
            this.entityManager.getTransaction().begin();

            person = this.entityManager.find(Person.class, id);

//            System.out.println("First Name = " + person.getFirstName());
//            System.out.println("Middle Name = " + person.getMiddleName());
//            System.out.println("Last Name = " + person.getLastName());
//            System.out.println("DOB = " + new SimpleDateFormat("yyyy-MM-dd").format(person.getDob()));

            this.entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (this.entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                this.entityManager.getTransaction().rollback();
            }
        }
        return person;
    }

    private void updatePerson(Person person) {
        try {
            this.entityManager.getTransaction().begin();

            // Person person = this.entityManager.find(Person.class, 1l);

            //Detach entity
            this.entityManager.clear();

//            // Update DOB
//            Calendar dob = Calendar.getInstance();
//            dob.setTime(person.getDob());
//            dob.set(Calendar.YEAR, 1847);
//
//            person.setDob(dob.getTime());

            this.entityManager.merge(person);

            this.entityManager.getTransaction().commit();
            System.out.println("Person updated successfully");

        } catch (Exception e) {
            e.printStackTrace();
            if (this.entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                this.entityManager.getTransaction().rollback();
            }
        }
    }
}

