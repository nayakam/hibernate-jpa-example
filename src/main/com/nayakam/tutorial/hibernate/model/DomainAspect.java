package com.nayakam.tutorial.hibernate.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DOMAIN_ASPECT")
public class DomainAspect implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String displayName;


    @ManyToOne
    private TemplateSection sectionTemplate;

    private boolean hideOnCreate;

    private String tooltipText;

    private Integer searchResultSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    public TemplateSection getSectionTemplate() {
        return sectionTemplate;
    }

    public void setSectionTemplate(TemplateSection sectionTemplate) {
        this.sectionTemplate = sectionTemplate;
    }

    public boolean isHideOnCreate() {
        return hideOnCreate;
    }

    public void setHideOnCreate(boolean hideOnCreate) {
        this.hideOnCreate = hideOnCreate;
    }

    public String getTooltipText() {
        return tooltipText;
    }

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    public Integer getSearchResultSize() {
        return searchResultSize;
    }

    public void setSearchResultSize(Integer searchResultSize) {
        this.searchResultSize = searchResultSize;
    }
}
