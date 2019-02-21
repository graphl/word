package com.word.service;

import com.word.common.ServerResponse;

public interface IUserWordService {
    ServerResponse addUserWord(Integer wordId, Integer userId);

    ServerResponse deleteUserWord(Integer wordId,Integer userId);
}
