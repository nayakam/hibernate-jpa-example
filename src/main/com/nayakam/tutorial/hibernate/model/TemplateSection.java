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

    @Override
    public String toString() {
        return "TemplateSection{" +
                "template=" + template +
                ", name='" + name + '\'' +
                ", fieldGroupKey='" + fieldGroupKey + '\'' +
                ", fields=" + fields +
                "} " + super.toString();
    }
}