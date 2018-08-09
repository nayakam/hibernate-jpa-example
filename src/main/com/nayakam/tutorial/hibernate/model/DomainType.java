package com.nayakam.tutorial.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "DOMAIN_TYPE")
public class DomainType extends BaseEntity {

    @OneToMany(mappedBy = "domainType")
    private List<DomainAspect> aspects;

    public List<DomainAspect> getAspects() {
        return aspects;
    }

    public void setAspects(List<DomainAspect> aspects) {
        this.aspects = aspects;
    }

    @Override
    public String toString() {
        return "DomainType{" +
                "aspects=" + aspects +
                "} " + super.toString();
    }
}
