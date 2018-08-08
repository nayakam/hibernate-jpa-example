package com.nayakam.tutorial.hibernate.model;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

//@Entity(name = "`owned_table`")
@Entity(name = "owned_table")
public class OwnedEntity {
    @Id
    private Long id;

    @ElementCollection
    @CollectionTable
    Set<EmbeddableElement> ownedElements;
}
