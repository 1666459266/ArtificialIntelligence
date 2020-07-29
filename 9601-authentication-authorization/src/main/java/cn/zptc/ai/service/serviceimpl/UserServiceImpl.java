package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.UserMapper;
import cn.zptc.ai.entity.User;
import cn.zptc.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }
}
