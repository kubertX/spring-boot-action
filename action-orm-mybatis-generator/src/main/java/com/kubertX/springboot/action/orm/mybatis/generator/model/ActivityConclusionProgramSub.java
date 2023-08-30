package com.kubertX.springboot.action.orm.mybatis.generator.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ActivityConclusionProgramSub implements Serializable {
    /** 表ID，主键 */
    private Integer id;

    /** 活动总结ID */
    private Integer activityConclusionId;

    /** 活动ID */
    private Integer activityProgramId;

    /** 立项子活动ID */
    private Integer activityProgramSubId;

    /** 总费用 */
    private BigDecimal actualCost;

    /** 租户承担费用 */
    private BigDecimal actualCostMall;

    /** 商场承担费用 */
    private BigDecimal actualCostTenant;

    /** 第三方承担费用 */
    private BigDecimal actualCostThird;

    /** PR费用 */
    private BigDecimal actualCostPr;

    /** 租户承担费用PR */
    private BigDecimal actualCostMallPr;

    /** 商场承担费用PR */
    private BigDecimal actualCostTenantPr;

    /** 第三方承担费用PR */
    private BigDecimal actualCostThirdPr;

    /** SP费用 */
    private BigDecimal actualCostSp;

    /** 商户承担SP费用 */
    private BigDecimal actualCostMallSp;

    /** 租户承担费用SP */
    private BigDecimal actualCostTenantSp;

    /** 第三方承担费用SP */
    private BigDecimal actualCostThirdSp;

    /** CRM费用 */
    private BigDecimal actualCostCrm;

    /** 商场CRM费用 */
    private BigDecimal actualCostMallCrm;

    /** 租户CRM费用 */
    private BigDecimal actualCostTenantCrm;

    /** 第三方CRM费用 */
    private BigDecimal actualCostThirdCrm;

    /** 电商费用 */
    private BigDecimal actualCostEc;

    /** 商场电商费用 */
    private BigDecimal actualCostMallEc;

    /** 租户电商费用 */
    private BigDecimal actualCostTenantEc;

    /** 第三方电商费用 */
    private BigDecimal actualCostThirdEc;

    /** 活动总结是否删除：1为删除 0为正常 */
    private String isDeleted;

    /** 创建人 */
    private String createBy;

    /** 创建人中文名 */
    private String createByName;

    /** 创建时间 */
    private Date createDate;

    /** 最后更新人账号 */
    private String lastUpdateBy;

    /** 最后更新人姓名 */
    private String lastUpdateByName;

    /** 最后更新时间 */
    private Date lastUpdateDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityConclusionId() {
        return activityConclusionId;
    }

    public void setActivityConclusionId(Integer activityConclusionId) {
        this.activityConclusionId = activityConclusionId;
    }

    public Integer getActivityProgramId() {
        return activityProgramId;
    }

    public void setActivityProgramId(Integer activityProgramId) {
        this.activityProgramId = activityProgramId;
    }

    public Integer getActivityProgramSubId() {
        return activityProgramSubId;
    }

    public void setActivityProgramSubId(Integer activityProgramSubId) {
        this.activityProgramSubId = activityProgramSubId;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }

    public BigDecimal getActualCostMall() {
        return actualCostMall;
    }

    public void setActualCostMall(BigDecimal actualCostMall) {
        this.actualCostMall = actualCostMall;
    }

    public BigDecimal getActualCostTenant() {
        return actualCostTenant;
    }

    public void setActualCostTenant(BigDecimal actualCostTenant) {
        this.actualCostTenant = actualCostTenant;
    }

    public BigDecimal getActualCostThird() {
        return actualCostThird;
    }

    public void setActualCostThird(BigDecimal actualCostThird) {
        this.actualCostThird = actualCostThird;
    }

    public BigDecimal getActualCostPr() {
        return actualCostPr;
    }

    public void setActualCostPr(BigDecimal actualCostPr) {
        this.actualCostPr = actualCostPr;
    }

    public BigDecimal getActualCostMallPr() {
        return actualCostMallPr;
    }

    public void setActualCostMallPr(BigDecimal actualCostMallPr) {
        this.actualCostMallPr = actualCostMallPr;
    }

    public BigDecimal getActualCostTenantPr() {
        return actualCostTenantPr;
    }

    public void setActualCostTenantPr(BigDecimal actualCostTenantPr) {
        this.actualCostTenantPr = actualCostTenantPr;
    }

    public BigDecimal getActualCostThirdPr() {
        return actualCostThirdPr;
    }

    public void setActualCostThirdPr(BigDecimal actualCostThirdPr) {
        this.actualCostThirdPr = actualCostThirdPr;
    }

    public BigDecimal getActualCostSp() {
        return actualCostSp;
    }

    public void setActualCostSp(BigDecimal actualCostSp) {
        this.actualCostSp = actualCostSp;
    }

    public BigDecimal getActualCostMallSp() {
        return actualCostMallSp;
    }

    public void setActualCostMallSp(BigDecimal actualCostMallSp) {
        this.actualCostMallSp = actualCostMallSp;
    }

    public BigDecimal getActualCostTenantSp() {
        return actualCostTenantSp;
    }

    public void setActualCostTenantSp(BigDecimal actualCostTenantSp) {
        this.actualCostTenantSp = actualCostTenantSp;
    }

    public BigDecimal getActualCostThirdSp() {
        return actualCostThirdSp;
    }

    public void setActualCostThirdSp(BigDecimal actualCostThirdSp) {
        this.actualCostThirdSp = actualCostThirdSp;
    }

    public BigDecimal getActualCostCrm() {
        return actualCostCrm;
    }

    public void setActualCostCrm(BigDecimal actualCostCrm) {
        this.actualCostCrm = actualCostCrm;
    }

    public BigDecimal getActualCostMallCrm() {
        return actualCostMallCrm;
    }

    public void setActualCostMallCrm(BigDecimal actualCostMallCrm) {
        this.actualCostMallCrm = actualCostMallCrm;
    }

    public BigDecimal getActualCostTenantCrm() {
        return actualCostTenantCrm;
    }

    public void setActualCostTenantCrm(BigDecimal actualCostTenantCrm) {
        this.actualCostTenantCrm = actualCostTenantCrm;
    }

    public BigDecimal getActualCostThirdCrm() {
        return actualCostThirdCrm;
    }

    public void setActualCostThirdCrm(BigDecimal actualCostThirdCrm) {
        this.actualCostThirdCrm = actualCostThirdCrm;
    }

    public BigDecimal getActualCostEc() {
        return actualCostEc;
    }

    public void setActualCostEc(BigDecimal actualCostEc) {
        this.actualCostEc = actualCostEc;
    }

    public BigDecimal getActualCostMallEc() {
        return actualCostMallEc;
    }

    public void setActualCostMallEc(BigDecimal actualCostMallEc) {
        this.actualCostMallEc = actualCostMallEc;
    }

    public BigDecimal getActualCostTenantEc() {
        return actualCostTenantEc;
    }

    public void setActualCostTenantEc(BigDecimal actualCostTenantEc) {
        this.actualCostTenantEc = actualCostTenantEc;
    }

    public BigDecimal getActualCostThirdEc() {
        return actualCostThirdEc;
    }

    public void setActualCostThirdEc(BigDecimal actualCostThirdEc) {
        this.actualCostThirdEc = actualCostThirdEc;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", activityConclusionId=").append(activityConclusionId);
        sb.append(", activityProgramId=").append(activityProgramId);
        sb.append(", activityProgramSubId=").append(activityProgramSubId);
        sb.append(", actualCost=").append(actualCost);
        sb.append(", actualCostMall=").append(actualCostMall);
        sb.append(", actualCostTenant=").append(actualCostTenant);
        sb.append(", actualCostThird=").append(actualCostThird);
        sb.append(", actualCostPr=").append(actualCostPr);
        sb.append(", actualCostMallPr=").append(actualCostMallPr);
        sb.append(", actualCostTenantPr=").append(actualCostTenantPr);
        sb.append(", actualCostThirdPr=").append(actualCostThirdPr);
        sb.append(", actualCostSp=").append(actualCostSp);
        sb.append(", actualCostMallSp=").append(actualCostMallSp);
        sb.append(", actualCostTenantSp=").append(actualCostTenantSp);
        sb.append(", actualCostThirdSp=").append(actualCostThirdSp);
        sb.append(", actualCostCrm=").append(actualCostCrm);
        sb.append(", actualCostMallCrm=").append(actualCostMallCrm);
        sb.append(", actualCostTenantCrm=").append(actualCostTenantCrm);
        sb.append(", actualCostThirdCrm=").append(actualCostThirdCrm);
        sb.append(", actualCostEc=").append(actualCostEc);
        sb.append(", actualCostMallEc=").append(actualCostMallEc);
        sb.append(", actualCostTenantEc=").append(actualCostTenantEc);
        sb.append(", actualCostThirdEc=").append(actualCostThirdEc);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createBy=").append(createBy);
        sb.append(", createByName=").append(createByName);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateByName=").append(lastUpdateByName);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}