package cn.zptc.ai.dao;

import cn.zptc.ai.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUserList(@Param("page") Integer page, @Param("limit") Integer limit);

    int updateUserStates(User user);
}