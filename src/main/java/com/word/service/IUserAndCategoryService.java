package com.word.service;

import com.github.pagehelper.PageInfo;
import com.word.common.ServerResponse;
import com.word.pojo.WordAndCategory;

public interface IUserAndCategoryService {

    ServerResponse addCategoryService(WordAndCategory wordAndCategory);

    ServerResponse deleteCategoryWord(WordAndCategory wordAndCategory);

    ServerResponse<PageInfo> listBycategoryId(Integer categoryId, Integer pageNum, Integer pageSize);
}
