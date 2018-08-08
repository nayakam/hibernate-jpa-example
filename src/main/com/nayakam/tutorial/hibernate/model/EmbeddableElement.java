package com.nayakam.tutorial.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmbeddableElement {
    //@Column(name = "`quotedField`")
    @Column(name = "quotedField")
    String quotedField;

    @Column
    String regularField;
}