package com.kubertX.springboot.action.test.junit5.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrganizationTreeNode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 组织ID
     * fly_auth_user.org_id
     * = fly_auth_organization.id
     */
    private String orgId;

    /**
     * 组织编码
     * fly_auth_organization.org_code
     * = fly_psporg_trans.psp_project_code
     */
    private String orgCode;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * psp组织名称
     */
    private String pspOrgName;
    /**
     * 组织等级
     * 取 fly_psporg_trans.level
     * 总部：0
     * 大区：2000
     * 项目：3000
     * 子部门：其他
     */
    private String orgLevel;

    /**
     * 父级组织ID
     * 取 fly_auth_organization.parent_id
     */
    private String parentOrgId;

    /**
     * 父级组织
     */
    //private OrganizationTreeNode parent;

    /**
     * 下级组织
     */
    private List<OrganizationTreeNode> children;

    /**
     * 所属的项目的组织架构ID
     * (大区、总部下用户 为 null)
     */
    private Integer projectOrgId;

    /**
     * 用户所属的组织架构编码
     * (大区、总部下用户 为 null)
     */
    private String projectNo;

    /**
     * 是否是项目层级用户
     * (大区、总部下用户 为 false)
     */
    private boolean isProjectUser;
}
