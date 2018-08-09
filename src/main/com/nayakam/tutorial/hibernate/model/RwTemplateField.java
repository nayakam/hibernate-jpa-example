package com.nayakam.tutorial.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class RwTemplateField implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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
    private RwPackageFieldType fieldType;

    private String defaultFieldValue;

    // Basic
    private Integer fieldLength;
    private Double minRangeValue;
    private Double maxRangeValue;

    // Reference
    @Column(length = 100)
    private String codeTableKey;
    private Boolean codeTableKeyRefFlag;
    private Boolean showCodeAndName;
    private Boolean showCodeAndNameSelected;
    private String codeTableFilter;
    private Boolean hasImageReference;
    private Integer minNumberOfValues;
    private Integer maxNumberOfValues;
    private Boolean multiAdd;
    private String referenceData;
    private String referenceDataOnly;

    // Link
    private String domainTypes;
    private Boolean createButton;
    private String linkType; //TODO should really be an enum

    private String dynamicParameters;
    private String searchDashboard;

    private String defaultResourceRole;
    private String resourceRoleEnabled;

    //Business Domain API
    private String defaultVariableName;

    private Boolean visible;

    private Boolean editable;

    //Trigger Rules
    private Boolean triggerRules;
    private String triggerRulesLinkText;
//    @Enumerated(EnumType.STRING)
//    private TriggerRuleManually triggerRulesManually;

    private String cssStyle;

    private String cssClass;

    @Deprecated
    private Integer orderInSummary;
    @Deprecated
    private Integer lineFeed;
    @Deprecated
    private boolean showInDetailFlag;
    @Deprecated
    private Boolean mandatoryFlag;
    @Deprecated
    private Boolean immediateCheckFlag;
    @Deprecated
    @Column(length = 128)
    private String validationExpression;
    @Deprecated
    @Column(length = 80)
    private String validationMessage;
    @Deprecated
    @Column(length = 500)
    private String populateExpressionIn;
    @Deprecated
    @Column(length = 500)
    private String populateExpressionOut;
    @Deprecated
    private Boolean referenceSaveNameOnly;
    @Deprecated
    private Integer colSpan;
    @Deprecated
    private Integer rowSpan;
    @Deprecated
    private Integer visibleLines;
    @Deprecated
    private Boolean showDetails;
    @Deprecated
    private Boolean saveImmediate;
    @Deprecated
    private String definitionChangeMap;
    @Deprecated
    private String layoutChangeMap;
    @Deprecated
    private String dataChangeMap;
    @Deprecated
    private Boolean snapshotMode;

    private String associationTypeName;

    private String tooltipText;

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

    public Integer getOrderInSummary() {
        return orderInSummary;
    }

    public void setOrderInSummary(Integer orderInSummary) {
        this.orderInSummary = orderInSummary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RwPackageFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(RwPackageFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getDefaultFieldValue() {
        return defaultFieldValue;
    }

    public void setDefaultFieldValue(String defaultFieldValue) {
        this.defaultFieldValue = defaultFieldValue;
    }

    public Integer getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(Integer fieldLength) {
        this.fieldLength = fieldLength;
    }

    public Double getMinRangeValue() {
        return minRangeValue;
    }

    public void setMinRangeValue(Double minRangeValue) {
        this.minRangeValue = minRangeValue;
    }

    public Double getMaxRangeValue() {
        return maxRangeValue;
    }

    public void setMaxRangeValue(Double maxRangeValue) {
        this.maxRangeValue = maxRangeValue;
    }

    public String getCodeTableKey() {
        return codeTableKey;
    }

    public void setCodeTableKey(String codeTableKey) {
        this.codeTableKey = codeTableKey;
    }

    public Boolean isCodeTableKeyRefFlag() {
        return codeTableKeyRefFlag;
    }

    public Boolean isShowCodeAndName() {
        return showCodeAndName;
    }

    public Boolean isShowCodeAndNameSelected() {
        return showCodeAndNameSelected;
    }

    public String getCodeTableFilter() {
        return codeTableFilter;
    }

    public void setCodeTableFilter(String codeTableFilter) {
        this.codeTableFilter = codeTableFilter;
    }

    public Boolean isHasImageReference() {
        return hasImageReference;
    }

    public Boolean getHasImageReference() {
        return hasImageReference;
    }

    public void setHasImageReference(Boolean hasImageReference) {
        this.hasImageReference = hasImageReference;
    }

    public Integer getMinNumberOfValues() {
        return minNumberOfValues;
    }

    public void setMinNumberOfValues(Integer minNumberOfValues) {
        this.minNumberOfValues = minNumberOfValues;
    }

    public Integer getMaxNumberOfValues() {
        return maxNumberOfValues;
    }

    public void setMaxNumberOfValues(Integer maxNumberOfValues) {
        this.maxNumberOfValues = maxNumberOfValues;
    }

    public Boolean getMultiAdd() {
        return multiAdd;
    }

    public void setMultiAdd(Boolean multiAdd) {
        this.multiAdd = multiAdd;
    }

    public String getReferenceData() {
        return referenceData;
    }

    public void setReferenceData(String referenceData) {
        this.referenceData = referenceData;
    }

    public String getReferenceDataOnly() {
        return referenceDataOnly;
    }

    public void setReferenceDataOnly(String referenceDataOnly) {
        this.referenceDataOnly = referenceDataOnly;
    }

    public String getDomainTypes() {
        return domainTypes;
    }

    public void setDomainTypes(String domainTypes) {
        this.domainTypes = domainTypes;
    }

    public Boolean getCreateButton() {
        return createButton;
    }

    public void setCreateButton(Boolean createButton) {
        this.createButton = createButton;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getDynamicParameters() {
        return dynamicParameters;
    }

    public void setDynamicParameters(String dynamicParameters) {
        this.dynamicParameters = dynamicParameters;
    }

    public String getSearchDashboard() {
        return searchDashboard;
    }

    public void setSearchDashboard(String searchDashboard) {
        this.searchDashboard = searchDashboard;
    }

    public String getDefaultResourceRole() {
        return defaultResourceRole;
    }

    public void setDefaultResourceRole(String defaultResourceRole) {
        this.defaultResourceRole = defaultResourceRole;
    }

    public String getResourceRoleEnabled() {
        return resourceRoleEnabled;
    }

    public void setResourceRoleEnabled(String resourceRoleEnabled) {
        this.resourceRoleEnabled = resourceRoleEnabled;
    }

    public String getDefaultVariableName() {
        return defaultVariableName;
    }

    public void setDefaultVariableName(String defaultVariableName) {
        this.defaultVariableName = defaultVariableName;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visibleFlag) {
        this.visible = visibleFlag;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getTriggerRules() {
        return triggerRules;
    }

    public void setTriggerRules(Boolean triggerRules) {
        this.triggerRules = triggerRules;
    }

    public String getTriggerRulesLinkText() {
        return triggerRulesLinkText;
    }

    public void setTriggerRulesLinkText(String triggerRulesLinkText) {
        this.triggerRulesLinkText = triggerRulesLinkText;
    }

    public String getCssStyle() {
        return cssStyle;
    }

    public void setCssStyle(String cssStyle) {
        this.cssStyle = cssStyle;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public Integer getLineFeed() {
        return lineFeed;
    }

    public void setLineFeed(Integer lineFeed) {
        this.lineFeed = lineFeed;
    }

    public boolean isShowInDetailFlag() {
        return showInDetailFlag;
    }

    public void setShowInDetailFlag(boolean showInDetailFlag) {
        this.showInDetailFlag = showInDetailFlag;
    }

    public Boolean isMandatoryFlag() {
        return mandatoryFlag;
    }

    public Boolean isImmediateCheckFlag() {
        return immediateCheckFlag;
    }

    public String getValidationExpression() {
        return validationExpression;
    }

    public void setValidationExpression(String validationExpression) {
        this.validationExpression = validationExpression;
    }

    public String getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }

    public Boolean getCodeTableKeyRefFlag() {
        return codeTableKeyRefFlag;
    }

    public void setCodeTableKeyRefFlag(Boolean codeTableKeyRefFlag) {
        this.codeTableKeyRefFlag = codeTableKeyRefFlag;
    }

    public Boolean getShowCodeAndName() {
        return showCodeAndName;
    }

    public void setShowCodeAndName(Boolean showCodeAndName) {
        this.showCodeAndName = showCodeAndName;
    }

    public Boolean getShowCodeAndNameSelected() {
        return showCodeAndNameSelected;
    }

    public void setShowCodeAndNameSelected(Boolean showCodeAndNameSelected) {
        this.showCodeAndNameSelected = showCodeAndNameSelected;
    }

    public Boolean getMandatoryFlag() {
        return mandatoryFlag;
    }

    public void setMandatoryFlag(Boolean mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
    }

    public Boolean getImmediateCheckFlag() {
        return immediateCheckFlag;
    }

    public void setImmediateCheckFlag(Boolean immediateCheckFlag) {
        this.immediateCheckFlag = immediateCheckFlag;
    }

    public String getPopulateExpressionIn() {
        return populateExpressionIn;
    }

    public void setPopulateExpressionIn(String populateExpressionIn) {
        this.populateExpressionIn = populateExpressionIn;
    }

    public String getPopulateExpressionOut() {
        return populateExpressionOut;
    }

    public void setPopulateExpressionOut(String populateExpressionOut) {
        this.populateExpressionOut = populateExpressionOut;
    }

    public Boolean getReferenceSaveNameOnly() {
        return referenceSaveNameOnly;
    }

    public void setReferenceSaveNameOnly(Boolean referenceSaveNameOnly) {
        this.referenceSaveNameOnly = referenceSaveNameOnly;
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

    public Integer getVisibleLines() {
        return visibleLines;
    }

    public void setVisibleLines(Integer visibleLines) {
        this.visibleLines = visibleLines;
    }

    public Boolean getShowDetails() {
        return showDetails;
    }

    public void setShowDetails(Boolean showDetails) {
        this.showDetails = showDetails;
    }

    public Boolean getSaveImmediate() {
        return saveImmediate;
    }

    public void setSaveImmediate(Boolean saveImmediate) {
        this.saveImmediate = saveImmediate;
    }

    public String getDefinitionChangeMap() {
        return definitionChangeMap;
    }

    public void setDefinitionChangeMap(String definitionChangeMap) {
        this.definitionChangeMap = definitionChangeMap;
    }

    public String getLayoutChangeMap() {
        return layoutChangeMap;
    }

    public void setLayoutChangeMap(String layoutChangeMap) {
        this.layoutChangeMap = layoutChangeMap;
    }

    public String getDataChangeMap() {
        return dataChangeMap;
    }

    public void setDataChangeMap(String dataChangeMap) {
        this.dataChangeMap = dataChangeMap;
    }

    public Boolean getSnapshotMode() {
        return snapshotMode;
    }

    public void setSnapshotMode(Boolean snapshotMode) {
        this.snapshotMode = snapshotMode;
    }

    public String getAssociationTypeName() {
        return this.associationTypeName;
    }

    public void setAssociationTypeName(String associationTypeName) {
        this.associationTypeName = associationTypeName;
    }

    public String getTooltipText() {
        return tooltipText;
    }

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }

}