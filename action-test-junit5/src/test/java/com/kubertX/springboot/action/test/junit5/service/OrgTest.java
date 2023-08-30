package com.kubertX.springboot.action.test.junit5.service;

import cn.hutool.core.collection.CollectionUtil;
import com.kubertX.springboot.action.test.junit5.OrgService;
import com.kubertX.springboot.action.test.junit5.dto.OrganizationTreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@DisplayName("org 测试")
@Slf4j
@SpringBootTest
public class OrgTest {


    @Mock
    private OrgService orgService;

    @Test
    public void testTree(){
        OrganizationTreeNode parent = new OrganizationTreeNode();
        parent.setOrgId("org_1_1003521");

        OrganizationTreeNode l1 = new OrganizationTreeNode();
        l1.setOrgId("org_2_1000845");
        l1.setParentOrgId("org_1_1003521");
        OrganizationTreeNode l2 = new OrganizationTreeNode();
        l2.setOrgId("org_2_1000849");
        l2.setParentOrgId("org_2_1000845");
        Mockito.when(orgService.listChildrenOrganizationTreeNode("org_1_1003521"))
                .thenReturn(Arrays.asList(l1));
        Mockito.when(orgService.listChildrenOrganizationTreeNode("org_2_1000845"))
                .thenReturn(Arrays.asList(l2));
        Mockito.when(orgService.listChildrenOrganizationTreeNode("org_2_1000849"))
                .thenReturn(null);


        List<OrganizationTreeNode> tree = iterateOrganizationTree(Arrays.asList(parent));
        tree.stream()
                .forEach(elem -> {

                    log.info(elem.toString());
                });


    }

    private List<OrganizationTreeNode> iterateOrganizationTree(List<OrganizationTreeNode> parentList){
        if(CollectionUtil.isEmpty(parentList)){
            return null;
        }
        List<String> parentOrgIdList = parentList.stream().map(OrganizationTreeNode::getOrgId).collect(Collectors.toList());

        String[] ids = new String[]{parentOrgIdList.get(0)};


        List<OrganizationTreeNode> children = orgService.listChildrenOrganizationTreeNode(ids);

        //
        children = iterateOrganizationTree(children);

        if(CollectionUtil.isNotEmpty(children)){
            Map<String, OrganizationTreeNode> parentMap = parentList.stream()
                    .collect(Collectors.toMap(OrganizationTreeNode::getOrgId, Function.identity(), (k1, k2) -> k1));

            Map<String, List<OrganizationTreeNode>> childrenMap = children.stream()
                    .collect(Collectors.groupingBy(OrganizationTreeNode::getParentOrgId));
            for (String parentOrgId : parentMap.keySet()) {
                List<OrganizationTreeNode> curChildren = childrenMap.get(parentOrgId);
                if(CollectionUtil.isNotEmpty(curChildren)){
                    parentMap.get(parentOrgId)
                            .setChildren(curChildren);
                }
            }
        }
        return parentList;

    }
}
