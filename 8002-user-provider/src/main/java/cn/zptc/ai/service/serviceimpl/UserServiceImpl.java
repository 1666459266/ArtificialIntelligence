package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.UserMapper;
import cn.zptc.ai.entity.User;
import cn.zptc.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @CacheEvict(cacheNames = "user",key = "#user.id")
    @Override
    public int insertUser(User user) {
        return userMapper.insertSelective(user);
    }

    @CacheEvict(cacheNames = "user",key = "#user.id")
    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @CacheEvict(cacheNames = "user",key = "#id")
    @Override
    public int deleteUserByUserId(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(cacheNames = "user",key = "#id")
    @Override
    public User selectUserByUserId(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectUserList(Integer page, Integer limit) {
        return userMapper.selectUserList(page,limit);
    }

    @CacheEvict(cacheNames = "user",key = "#user.id")
    @Override
    public int updateUserStates(User user) {
        return userMapper.updateUserStates(user);
    }
}
