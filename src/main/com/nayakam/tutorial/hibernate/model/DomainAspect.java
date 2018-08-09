package com.nayakam.tutorial.hibernate.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DOMAIN_ASPECT")
public class DomainAspect extends BaseEntity {

    private String name;

    @ManyToOne
    private DomainType domainType;

    @ManyToOne
    private TemplateSection sectionTemplate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DomainType getDomainType() {
        return domainType;
    }

    public void setDomainType(DomainType domainType) {
        this.domainType = domainType;
    }

    public TemplateSection getSectionTemplate() {
        return sectionTemplate;
    }

    public void setSectionTemplate(TemplateSection sectionTemplate) {
        this.sectionTemplate = sectionTemplate;
    }

    @Override
    public String toString() {
        return "DomainAspect{" +
                "name='" + name + '\'' +
                ", domainType=" + domainType +
                ", sectionTemplate=" + sectionTemplate +
                "} " + super.toString();
    }
}
