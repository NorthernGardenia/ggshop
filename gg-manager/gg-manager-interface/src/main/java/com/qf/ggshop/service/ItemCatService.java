package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.TreeNode;

import java.util.List;

/**
 * User: DHC
 * Date: 2017/11/10
 * Time: 15:08
 * Version:V1.0
 */
public interface ItemCatService {
    List<TreeNode> listItemCatsByPid(Long parentId);
}
