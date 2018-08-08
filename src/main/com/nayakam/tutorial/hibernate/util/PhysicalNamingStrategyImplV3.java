package com.nayakam.tutorial.hibernate.util;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class PhysicalNamingStrategyImplV3 extends PhysicalNamingStrategyStandardImpl {

    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        return context.getIdentifierHelper().toIdentifier(
                name.getText().replaceAll("((?!^)[^_])([A-Z])", "$1_$2").toLowerCase(),
                name.isQuoted()
        );
    }

    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        return context.getIdentifierHelper().toIdentifier(
                name.getText().replaceAll("((?!^)[^_])([A-Z])", "$1_$2").toLowerCase(),
                name.isQuoted()
        );
    }
}