package com.kubertX.springboot.action.test.junit5;

import com.kubertX.springboot.action.test.junit5.dto.OrganizationTreeNode;

import java.util.List;

public interface OrgService {

    List<OrganizationTreeNode> listChildrenOrganizationTreeNode(String... ids);
}
