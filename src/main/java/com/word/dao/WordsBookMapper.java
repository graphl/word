package com.word.dao;

import com.word.pojo.WordsBook;
import com.word.vo.BookWord;
import com.word.vo.MWordVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface WordsBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WordsBook record);

    int insertSelective(WordsBook record);

    WordsBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WordsBook record);

    int updateByPrimaryKey(WordsBook record);

    int delTobookWord(@Param("bookId")Integer bookId,
                      @Param("wordId") Integer wordId);
    /**
     * 前端
     */
    List<MWordVo> selectByBookId(Integer bookId);


    List<BookWord> selectBookWord( @Param("bookId")Integer bookId,
                                   @Param("pageNumKey")Integer pageNum,
                                  @Param("pageSizeKey") Integer pageSize

    );
    int deleteByWbId(@Param("id") Integer wbId);
}