package com.nayakam.tutorial.hibernate.util;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class PhysicalNamingStrategyImplV2 implements PhysicalNamingStrategy {

    @Override
    public Identifier toPhysicalCatalogName(Identifier identifier, JdbcEnvironment jdbcEnv) {
        if (identifier != null) {
            System.out.println();
            System.out.println("PhysicalCatalogName: CanonicalName:" + identifier.getCanonicalName() + ", Text:" + identifier.getText() + ", Identifier:" + identifier);
            print("PhysicalCatalogName : ", identifier);
        }
        return convert(identifier);
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment jdbcEnv) {
//        if (identifier != null) {
//            System.out.println("PhysicalColumnName :" + identifier.getCanonicalName() + ", " + identifier.getText());
//        }
        return convert(identifier);
    }

    @Override
    public Identifier toPhysicalSchemaName(Identifier identifier, JdbcEnvironment jdbcEnv) {
        if (identifier != null) {
            System.out.println();
            print("PhysicalSchemaName : ", identifier);
        }
        return convert(identifier);
    }

    @Override
    public Identifier toPhysicalSequenceName(Identifier identifier, JdbcEnvironment jdbcEnv) {
        if (identifier != null) {
            System.out.println();
            print("PhysicalSequenceName : ", identifier);
        }
        return convert(identifier);
    }

    @Override
    public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment jdbcEnv) {
        if (identifier != null) {
            System.out.println();
            print("PhysicalTableName : ", identifier);
        }
        return convert(identifier);
    }

    private Identifier convert(Identifier identifier) {
        if (identifier == null || StringUtils.isBlank(identifier.getText())) {
            return identifier;
        }

        String regex = "([a-z])([A-Z])";
        String replacement = "$1_$2";
        String newName = identifier.getText().replaceAll(regex, replacement).toLowerCase();
        System.out.println("CONVERT:" + String.format("%-30s: %s", identifier.getText(), newName));
        return Identifier.toIdentifier(newName);
    }

    private void print(String method, Identifier identifier) {
        System.out.println(String.format("%-30s: %-30s: %s", method, identifier.getCanonicalName(), identifier.getText()) + " , Identifier:" + identifier);
    }
}