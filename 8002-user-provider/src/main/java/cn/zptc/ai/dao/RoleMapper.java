package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectRoleList(@Param("page") Integer page, @Param("limit") Integer limit);

    int updateRoleStates(Role role);
}