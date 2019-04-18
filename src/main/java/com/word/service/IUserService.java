package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.User;

public interface IUserService {
    ServerResponse login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkVaild(String str,String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username,String question,String answer);

    ServerResponse<String> forgetResetPassword(String username, String passwordNew,String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);

    ServerResponse checkAdminRole(User user);

    ServerResponse getAllUser();

    ServerResponse getAdmins();

    ServerResponse deleteUserById(Integer user_id,Integer role);

    ServerResponse updateUser(User user);
}
