package com.word.dao;

import com.word.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectLogin(@Param("username") String username,
                     @Param("password") String password,
                     @Param("role") Integer role);

    User selectLoginByPhone(@Param("username") String username,
                     @Param("password") String password,
                     @Param("role") Integer role);

    String selectQuestionByUsername(String username);

    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    int checkPassword(@Param("password") String password, @Param("userId") Integer userId);

    int checkEmailByUserId(@Param("email") String email, @Param("userId") Integer userId);

    int checkUsername(@Param("username") String username,
                      @Param("type") Integer type);

    int checkEmail(String email);

    List<User> getAllUser(@Param("pageNumKey") int pageNum,
                          @Param("pageSizeKey") int pageSize);

    List<User> getAllAdmin(@Param("pageNumKey") int pageNum,
                           @Param("pageSizeKey") int pageSize);

    int getCountUser();

    int getCountAdmin();

    int deleteUserById(@Param("id") Integer id,@Param("role") Integer role);


    int checkUserPhone(@Param("phone") String phtone,
                       @Param("role") Integer role);
}