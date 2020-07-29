package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    //根据用户名查询用户权限
    @Select("SELECT p.identification FROM permission p " +
            "LEFT JOIN role_permission rp on rp.permission_id = p.id " +
            "LEFT JOIN role r on rp.role_id = r.id " +
            "LEFT JOIN user u on u.role_id = r.id " +
            "WHERE u.username = #{username}")
    List<String> getPermissionByUsername(String username);
}