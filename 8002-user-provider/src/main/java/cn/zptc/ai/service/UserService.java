package cn.zptc.ai.service;

import cn.zptc.ai.entity.User;

import java.util.List;

public interface UserService {
    int insertUser(User user);

    int updateUser(User user);

    int deleteUserByUserId(Integer id);

    User selectUserByUserId(Integer id);

    List<User> selectUserList(Integer page, Integer limit);

    int updateUserStates(User user);
}
