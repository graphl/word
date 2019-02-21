package com.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.word.common.ServerResponse;
import com.word.dao.WordAndCategoryMapper;
import com.word.dao.WordMapper;
import com.word.pojo.Word;
import com.word.pojo.WordAndCategory;
import com.word.service.IUserAndCategoryService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iUserAndCategoryService")
public class UserAndCategoryServiceImpl implements IUserAndCategoryService {


    @Autowired
    private WordAndCategoryMapper wordAndCategoryMapper;
    @Autowired
    private WordMapper wordMapper;
    public ServerResponse addCategoryService(WordAndCategory wordAndCategory){
        if(wordAndCategory.getWordId() == null || wordAndCategory.getCategoryId() ==null ){
            return  ServerResponse.createByErrorMessage("参数错误");
        }
        Word word = wordMapper.selectByPrimaryKey(wordAndCategory.getWordId());
        int resultCount = wordAndCategoryMapper.checkCategoryAndWord(wordAndCategory.getWordId(),wordAndCategory.getCategoryId());
        if(word !=null && resultCount > 0){
            int rowCount =  wordAndCategoryMapper.insert(wordAndCategory);
            if(rowCount > 0){
                return  ServerResponse.createBySuccess("单词归类成功");
            }
            return  ServerResponse.createByErrorMessage("单词归类失败");
        }
        return  ServerResponse.createByErrorMessage("单词归类失败，没有该单词获单词重复");
    }
    public ServerResponse deleteCategoryWord(WordAndCategory wordAndCategory){
        if(wordAndCategory.getWordId() == null || wordAndCategory.getCategoryId() ==null ){
            return  ServerResponse.createByErrorMessage("参数错误");
        }
        int resultCount = wordAndCategoryMapper.deleteBywordIdAndCategoryId(wordAndCategory.getCategoryId(),wordAndCategory.getWordId());
        if(resultCount > 0){
            return ServerResponse.createBySuccess("删除成功");
        }
        return ServerResponse.createByErrorMessage("删除失败");
    }
    public ServerResponse<PageInfo> listBycategoryId(Integer categoryId,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        if(categoryId==null)
            return ServerResponse.createByErrorMessage("参数错误");
        List<WordAndCategory>  wordAndCategoryList =  wordAndCategoryMapper.selectByCategoryId(categoryId);
        List<Word> wordIdList = Lists.newArrayList();
        if(CollectionUtils.isNotEmpty(wordAndCategoryList)) {
            for (WordAndCategory wordAndCategoryItem : wordAndCategoryList) {
                Word wordBywordId = wordMapper.selectByPrimaryKey(wordAndCategoryItem.getWordId());
                wordIdList.add(wordBywordId);
            }
        }
        PageInfo pageResult = new PageInfo(wordIdList);
        pageResult.setList(wordIdList);
       return ServerResponse.createBySuccess(pageResult);
    }
}
