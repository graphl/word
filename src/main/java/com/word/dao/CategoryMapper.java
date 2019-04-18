package com.word.dao;

import com.word.pojo.Category;
import com.word.vo.CategoryName;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<String> selectAllCategory();

    Category selectByCategoryId(Integer categoryId);

    List<Category> getAllCategory();

    int delCategoryById(Integer categoryId);
}