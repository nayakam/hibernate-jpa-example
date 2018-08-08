### Hibernate JPA Example

The purpose of this project to verify [hibernate naming strategies](https://docs.jboss.org/hibernate/orm/5.3/userguide/html_single/chapters/domain/naming.html) in version 5.3.

#### TODO
* Find migration path to the existing strategy [OracleNamingStrategy](https://code.google.com/archive/p/hibernate-naming-strategy-for-oracle/)

##### Before Hibernate 5.0
```
 <property name="hibernate.ejb.naming_strategy" value="com.nayakam.tutorial.hibernate.util.OracleNamingStrategy"/>
 ```
 
##### After Hibernate 5.0
 
###### ImplicitNamingStrategy

Used when table or column name explicitly defined in entity.
```$
<property name="hibernate.implicit_naming_strategy" value="org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl"/>
<property name="hibernate.implicit_naming_strategy" value="org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyHbmImpl"/>
<property name="hibernate.implicit_naming_strategy" value="org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl"/>
<property name="hibernate.implicit_naming_strategy" value="org.hibernate.boot.model.naming.ImplicitNamingStrategyComponentPathImpl"/>
```

###### PhysicalNamingStrategy

To map logical name of entity or properties to physical name.
```
<property name="hibernate.physical_naming_strategy" value="org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl"/>
<property name="hibernate.physical_naming_strategy" value="com.nayakam.tutorial.hibernate.util.PhysicalNamingStrategyImplV1"/>
<property name="hibernate.physical_naming_strategy" value="com.nayakam.tutorial.hibernate.util.PhysicalNamingStrategyImplV2"/>
<property name="hibernate.physical_naming_strategy" value="com.nayakam.tutorial.hibernate.util.PhysicalNamingStrategyImplV3"/>
```
 
##### Reference 

* https://stackoverflow.com/questions/32165694/spring-hibernate-5-naming-strategy-configuration