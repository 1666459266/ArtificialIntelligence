package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> selectPermissionList(@Param("page") Integer page, @Param("limit") Integer limit);

    int updatePermissionStates(Permission permission);
}