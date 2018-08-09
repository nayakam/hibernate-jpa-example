package com.nayakam.tutorial.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
public class TemplateField extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String groupKey;

    @Column(length = 500)
    private String displayName;

    private Integer displayOrder;

    @Column(length = 2000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(length = 16)
    private PackageFieldType fieldType;

    private String defaultFieldValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PackageFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(PackageFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getDefaultFieldValue() {
        return defaultFieldValue;
    }

    public void setDefaultFieldValue(String defaultFieldValue) {
        this.defaultFieldValue = defaultFieldValue;
    }
}