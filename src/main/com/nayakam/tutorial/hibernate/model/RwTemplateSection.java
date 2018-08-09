package com.nayakam.tutorial.hibernate.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class RwTemplateSection implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private RwTemplate template;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private String displayName;

    @Column(length = 2000)
    private String description;

    private int displayOrder;

    private boolean multisection;

    //Business Domain API Field
    private String variableName;
    private String defaultVariableName;
    private String fieldVariableNamePrefix;

    @Column(nullable = false)
    private String fieldGroupKey;

    /**
     * The list of fields of this section is set by using the field group key, the fields list cannot be updated
     * directly, this is to avoid having a ManyToMany mapping table
     */
    @OneToMany
    @JoinColumn(name = "groupKey", referencedColumnName = "fieldGroupKey", updatable = false, insertable = false)
    private List<RwTemplateField> fields;

    private Boolean visible;

    private Boolean editable;

    private String cssClass;

    private String cssStyle;

    private Boolean triggerRules;

    private Boolean duplicatable;
    private Boolean showRemoveLink;

    private Boolean collapsible;
    private Boolean collapse;

    private Boolean hideAdd;
    private Boolean hideDelete;

    private String multisectionSort;
    private String defaultSort;

    @Deprecated
    private Integer colSpan;
    @Deprecated
    private Integer rowSpan;
    @Deprecated
    private Boolean celltableLayout;
    @Deprecated
    private Integer lineFeed;
    @Deprecated
    private boolean showTitleFlag;
    @Deprecated
    private boolean showTitleInSummaryFlag;


    public RwTemplate getTemplate() {
        return template;
    }

    public void setTemplate(RwTemplate template) {
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

    public String getDefaultVariableName() {
        return defaultVariableName;
    }

    public void setDefaultVariableName(String defaultVariableName) {
        this.defaultVariableName = defaultVariableName;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public boolean isMultisection() {
        return multisection;
    }

    public void setMultisection(boolean multisection) {
        this.multisection = multisection;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getFieldVariableNamePrefix() {
        return fieldVariableNamePrefix;
    }

    public void setFieldVariableNamePrefix(String fieldVariableNamePrefix) {
        this.fieldVariableNamePrefix = fieldVariableNamePrefix;
    }

    public String getFieldGroupKey() {
        return fieldGroupKey;
    }

    public void setFieldGroupKey(String fieldGroupKey) {
        this.fieldGroupKey = fieldGroupKey;
    }

    public List<RwTemplateField> getFields() {
        return fields;
    }

    public void setFields(List<RwTemplateField> fields) {
        this.fields = fields;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssStyle() {
        return cssStyle;
    }

    public void setCssStyle(String cssStyle) {
        this.cssStyle = cssStyle;
    }

    public Boolean getTriggerRules() {
        return triggerRules;
    }

    public void setTriggerRules(Boolean triggerRules) {
        this.triggerRules = triggerRules;
    }

    public Boolean getDuplicatable() {
        return duplicatable;
    }

    public void setDuplicatable(Boolean duplicatable) {
        this.duplicatable = duplicatable;
    }

    public Boolean getShowRemoveLink() {
        return showRemoveLink;
    }

    public void setShowRemoveLink(Boolean showRemoveLink) {
        this.showRemoveLink = showRemoveLink;
    }

    public Boolean getCollapsible() {
        return collapsible;
    }

    public void setCollapsible(Boolean collapsible) {
        this.collapsible = collapsible;
    }

    public Boolean getCollapse() {
        return collapse;
    }

    public void setCollapse(Boolean collapse) {
        this.collapse = collapse;
    }

    public Boolean getHideAdd() {
        return hideAdd;
    }

    public void setHideAdd(Boolean hideAdd) {
        this.hideAdd = hideAdd;
    }

    public Boolean getHideDelete() {
        return hideDelete;
    }

    public void setHideDelete(Boolean hideDelete) {
        this.hideDelete = hideDelete;
    }

    public String getMultisectionSort() {
        return multisectionSort;
    }

    public void setMultisectionSort(String multisectionSort) {
        this.multisectionSort = multisectionSort;
    }

    public String getDefaultSort() {
        return defaultSort;
    }

    public void setDefaultSort(String defaultSort) {
        this.defaultSort = defaultSort;
    }

    public Integer getColSpan() {
        return colSpan;
    }

    public void setColSpan(Integer colSpan) {
        this.colSpan = colSpan;
    }

    public Integer getRowSpan() {
        return rowSpan;
    }

    public void setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
    }

    public Boolean getCelltableLayout() {
        return celltableLayout;
    }

    public void setCelltableLayout(Boolean celltableLayout) {
        this.celltableLayout = celltableLayout;
    }

    public Integer getLineFeed() {
        return lineFeed;
    }

    public void setLineFeed(Integer lineFeed) {
        this.lineFeed = lineFeed;
    }

    public boolean isShowTitleFlag() {
        return showTitleFlag;
    }

    public void setShowTitleFlag(boolean showTitleFlag) {
        this.showTitleFlag = showTitleFlag;
    }

    public boolean isShowTitleInSummaryFlag() {
        return showTitleInSummaryFlag;
    }

    public void setShowTitleInSummaryFlag(boolean showTitleInSummaryFlag) {
        this.showTitleInSummaryFlag = showTitleInSummaryFlag;
    }
}