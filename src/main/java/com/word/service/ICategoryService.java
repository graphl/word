package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.Category;
import com.word.vo.CategoryName;

import java.util.List;
import java.util.Map;


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
    ServerResponse<List<CategoryName>> getAllCategoryName();

    /**
     * 更新分类
     * @param category
     * @return
     */
    ServerResponse updateCategory(Category category);

    /**
     *获取所有分类
     */
    ServerResponse categoryList();

    /**
     * 删除分类
     * @param categoryId
     * @return
     */
    ServerResponse delCategoryId(Integer categoryId);
}
