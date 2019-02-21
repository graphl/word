package com.word.service;

import com.word.common.ServerResponse;

import java.util.List;


public interface ICategoryService {
    /**
     * 添加分类
     * @param categoryName

     * @return
     */
    ServerResponse addCategory(String categoryName);

    /**
     * 更新分类名字
     * @param categoryId
     * @param categoryName
     * @return
     */
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    /**
     * 获取所有分类名字
     * @return
     */
    ServerResponse<List<String>> getAllCagegoryName();

}
