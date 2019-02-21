package com.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.dao.WordMapper;
import com.word.pojo.Word;
import com.word.service.IWordService;
import com.word.util.DateTimeUtile;
import com.word.vo.WordDetailVo;
import com.word.vo.WordListVo;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iWordService")
public class WordServiceImpl implements IWordService {

    @Autowired
    private WordMapper wordMapper;
    public ServerResponse saveOrUpdateProduct(Word word) {
      /*  if (word != null) {
            if ((StringUtils.isNotBlank(word.getSubImages()))) {
                String[] subImageArray = product.getSubImages().split(",");
                if (subImageArray.length > 0) {
                    product.setMainImage(subImageArray[0]);
                }
            }*/
            if(word !=null){
                if (word.getId() != null) {
                    int rowCount = wordMapper.updateByPrimaryKey(word);
                    if (rowCount > 0) {
                        return ServerResponse.createBySuccess("跟新单词成功");
                    }
                    return ServerResponse.createBySuccess("跟新单词失败");
                } else {
                    int rowCount = wordMapper.insert(word);
                    if (rowCount > 0) {
                        return ServerResponse.createBySuccess("跟新单词成功");
                    }
                    return ServerResponse.createBySuccess("跟新产品失败");
                }
            }
        return ServerResponse.createByErrorMessage("单词信息为空");

    }
    public ServerResponse<WordDetailVo> getWordDetail(Integer wordId){
        if (wordId == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Word word = wordMapper.selectByPrimaryKey(wordId);
        if(word == null){
            return ServerResponse.createByErrorMessage("没有该单词");
        }

        //VO 对象 value object
        //pojo -》 bo （business object） --> vo (view object)
        WordDetailVo wordDetailVo  = assembleWordDetailVo(word);
        return  ServerResponse.createBySuccess(wordDetailVo);
    }
    private  WordDetailVo assembleWordDetailVo(Word word){
        WordDetailVo wordDetailVo =new WordDetailVo();
        wordDetailVo.setId(word.getId());
        wordDetailVo.setWordImage(word.getWordImage());
        wordDetailVo.setWordName(word.getWordName());

        wordDetailVo.setWordSound(word.getWordSound());
        word.setWordSymbol(word.getWordSymbol());
        wordDetailVo.setCreateTime(DateTimeUtile.dateToStr(word.getCreateTime()));
        wordDetailVo.setUpdateTime(DateTimeUtile.dateToStr(word.getUpdateTime()));
        return wordDetailVo;
    }

    public  ServerResponse getWordList(int pageNum,int pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<Word> wordList = wordMapper.selectList();
        List<WordListVo> wordListVoList = Lists.newArrayList();
        for(Word wordItem:wordList){
            WordListVo productListVo = assembleProductListVo(wordItem);
            wordListVoList.add(productListVo);
        }
        PageInfo pageResult = new PageInfo(wordList);
        pageResult.setList(wordList);
        return ServerResponse.createBySuccess(pageResult);
    }
    private WordListVo assembleProductListVo(Word word){
        WordListVo wordListVo = new WordListVo();
        wordListVo.setId(word.getId());
        wordListVo.setId(word.getId());
        wordListVo.setWordImage(word.getWordImage());
        wordListVo.setWordName(word.getWordName());

        wordListVo.setWordSound(word.getWordSound());
        word.setWordSymbol(word.getWordSymbol());
        return wordListVo;
    }

    public ServerResponse<PageInfo> searchWord(String wordName,Integer wordId,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        if (StringUtils.isNotBlank(wordName)) {
            wordName = new StringBuffer().append("%").append(wordName).append("%").toString();
        }
        List<Word> productList = wordMapper.selectByNameAndWordId(wordName,wordId);
        List<WordListVo> productListVoList = Lists.newArrayList();
        for(Word productItem:productList){
            WordListVo wordListVo = assembleProductListVo(productItem);
            productListVoList.add(wordListVo);
        }
        //分页
        PageInfo pageResult = new PageInfo(productList);
        pageResult.setList(productList);
        return ServerResponse.createBySuccess(pageResult);
    }
}
