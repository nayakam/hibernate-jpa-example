package com.nayakam.tutorial.hibernate.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class TemplateSection extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Template template;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private String displayName;

    @Column(length = 2000)
    private String description;

    private int displayOrder;


    @Column(nullable = false)
    private String fieldGroupKey;

    /**
     * The list of fields of this section is set by using the field group key, the fields list cannot be updated
     * directly, this is to avoid having a ManyToMany mapping table
     */
    @OneToMany
    @JoinColumn(name = "groupKey", referencedColumnName = "fieldGroupKey", updatable = false, insertable = false)
    private List<TemplateField> fields;

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getFieldGroupKey() {
        return fieldGroupKey;
    }

    public void setFieldGroupKey(String fieldGroupKey) {
        this.fieldGroupKey = fieldGroupKey;
    }

    public List<TemplateField> getFields() {
        return fields;
    }

    public void setFields(List<TemplateField> fields) {
        this.fields = fields;
    }
}