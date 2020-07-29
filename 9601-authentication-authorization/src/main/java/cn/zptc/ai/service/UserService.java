package cn.zptc.ai.service;

import cn.zptc.ai.entity.User;

public interface UserService {
    //根据用户名查询用户密码
    User getUserByUsername(String username);
}
