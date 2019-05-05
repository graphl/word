package com.word.service.impl;

import com.google.common.collect.Lists;
import com.word.common.Const;
import com.word.common.ServerResponse;
import com.word.dao.CategoryMapper;
import com.word.pojo.Category;
import com.word.service.ICategoryService;
import com.word.vo.CategoryName;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iCategoryService")
public class CategoryServiceImpl implements ICategoryService {

    private Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public ServerResponse addCategory(String categoryName) {
        if(StringUtils.isBlank(categoryName)){
            return ServerResponse.createByErrorMessage("单词类别参数错误");
        }
        Category category = new Category();
        category.setCategoryName(categoryName);
        int rowCount = categoryMapper.insert(category);
        if(rowCount>0){
            return  ServerResponse.createBySuccess("添加分类成功");
        }
        return ServerResponse.createByErrorMessage("添加分类失败");
    }

    @Override
    public ServerResponse updateCategoryName(Integer categoryId, String categoryName) {
        if(categoryId==null||StringUtils.isBlank(categoryName   )){
            return  ServerResponse.createByErrorMessage("添加单词类别失败");
        }
        Category category = new Category();
        category.setId(categoryId);
        category.setCategoryName(categoryName);
        int rowCount = categoryMapper.updateByPrimaryKeySelective(category);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("更新分类成功");
        }
        return ServerResponse.createByErrorMessage("更新分类失败");
    }
    public ServerResponse<List<CategoryName>> getAllCategoryName(){
         List<String> categoryList = categoryMapper.selectAllCategory();
         if(categoryList == null){
             return ServerResponse.createByErrorCodeMessage(Const.category.CATEGORY_NULL,"没有分类");
         }
        List<CategoryName> categoryNames = Lists.newArrayList();
         for (String item:categoryList){
                CategoryName categoryName = new CategoryName();
                categoryName.setCategoryName(item);
                categoryNames.add(categoryName);
         }
         return ServerResponse.createBySuccess(categoryNames);
    }
    public ServerResponse<Category> getCagegoryNameByCategoryId(Integer categoryId){
       if(categoryId == null){
           return ServerResponse.createByErrorMessage("类别查询参数错误");
       }
       Category category = categoryMapper.selectByCategoryId(categoryId);
       if(category == null){
           return ServerResponse.createByErrorMessage("无此分类");
       }
        return ServerResponse.createBySuccess(category);
    }

    public  ServerResponse updateCategory(Category category){
        int result  = categoryMapper.updateByPrimaryKeySelective(category);

        return ServerResponse.createBySuccess(result);
    }

    public ServerResponse categoryList(int pageNum, int pageSize){
        List<Category> categoryList = categoryMapper.getAllCategory(pageNum, pageSize);
        System.out.println(categoryList.size());
        int count = categoryMapper.getCountCategory();
        return ServerResponse.createBySuccess(categoryList,count);
    }

    public ServerResponse delCategoryId(Integer categoryId){
        int result = categoryMapper.delCategoryById(categoryId);
        return ServerResponse.createBySuccess(result);
    }
}
