package com.word.service;

import com.github.pagehelper.PageInfo;
import com.word.common.ServerResponse;
import com.word.pojo.Word;
import com.word.vo.WordDetailVo;

public interface IWordService {

    ServerResponse saveOrUpdateProduct(Word word);

    ServerResponse<WordDetailVo> getWordDetail(Integer wordId);

    ServerResponse getWordList(int pageNum,int pageSize);

    ServerResponse<PageInfo> searchWord(String wordName, Integer wordId, int pageNum, int pageSize);

    ServerResponse deleteByWordId(Integer wordId);

    ServerResponse addword(Word word);
}
