package com.nayakam.tutorial.hibernate.model;

import javax.persistence.*;
import java.util.Set;

/**
 * https://stackoverflow.com/questions/41267416/hibernate-5-naming-strategy-examples
 */
@Entity
@Table(name = "mainTable")
public class MainEntity {
    @Id
    private Long id;

    @ElementCollection
    Set<EmbeddableElement> mainElements;

    @OneToMany(targetEntity = DependentEntity.class)
    Set<DependentEntity> dependentEntities;

    @OneToOne(targetEntity = OwnedEntity.class)
    OwnedEntity ownedEntity;
}