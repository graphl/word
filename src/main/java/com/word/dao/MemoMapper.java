package com.word.dao;

import com.word.pojo.Memo;
import com.word.vo.MWordVo;

import java.util.List;

public interface MemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Memo record);

    int insertSelective(Memo record);

    Memo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Memo record);

    int updateByPrimaryKey(Memo record);

    List<MWordVo> selectMList(Integer userId);

    List<Memo> selectMemo(Integer userId);

    List<Integer> selectWordId(Integer userId);

    int MemoSize();

}