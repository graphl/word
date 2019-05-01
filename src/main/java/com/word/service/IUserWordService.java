package com.word.service;

import com.word.common.ServerResponse;
import com.word.vo.UserWordVo;
import com.word.vo.WordDetailOneVo;

import java.util.List;

public interface IUserWordService {

    ServerResponse addUserWord(Integer wordId, Integer userId);

    ServerResponse deleteUserWord(Integer wordId,Integer userId);

    List<UserWordVo> showUserWord(Integer user_id);

    WordDetailOneVo searchWordDetail(String wordName);


}
