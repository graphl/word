package com.word.service;

import com.word.vo.MWordVo;

public interface IMemoService {

    MWordVo MM(Integer userId);

    MWordVo onKnow(Integer grad);

    void unKonw(Integer grad);

    MWordVo NextMW();
}
