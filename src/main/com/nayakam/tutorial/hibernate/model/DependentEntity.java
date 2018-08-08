package com.nayakam.tutorial.hibernate.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dependentTable")
public class DependentEntity {
    @Id
    private Long id;

    @ManyToOne
    MainEntity mainEntity;

    @ElementCollection
    @CollectionTable(name = "dependentElements")
    Set<EmbeddableElement> dependentElements;
}