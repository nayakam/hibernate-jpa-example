package com.nayakam.tutorial.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "dependentTable")
public class DependentEntity implements Serializable {
    @Id
    private Long id;

    @ManyToOne
    MainEntity mainEntity;

    @ElementCollection
    @CollectionTable(name = "dependentElements")
    Set<EmbeddableElement> dependentElements;
}