package com.nayakam.tutorial.hibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    //private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE-HSQLDB";
    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE-MSSQL";
    private static EntityManagerFactory factory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}