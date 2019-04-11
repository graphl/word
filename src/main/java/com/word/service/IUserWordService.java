package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.Word;

import java.util.List;

public interface IUserWordService {

    ServerResponse addUserWord(Integer wordId, Integer userId);

    ServerResponse deleteUserWord(Integer wordId,Integer userId);

    ServerResponse<List<Word>> showUserWord(Integer user_id);
}
