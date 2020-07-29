package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.RolePermissionMapper;
import cn.zptc.ai.entity.RolePermission;
import cn.zptc.ai.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {
    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @CacheEvict(cacheNames = "rolePermission",key = "#rolePermission.id")
    @Override
    public int insertRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.insertSelective(rolePermission);
    }

    @CacheEvict(cacheNames = "rolePermission",key = "#rolePermission.id")
    @Override
    public int updateRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.updateByPrimaryKeySelective(rolePermission);
    }

    @CacheEvict(cacheNames = "rolePermission",key = "#rolePermission.id")
    @Override
    public int deleteRolePermissionById(Integer id) {
        return rolePermissionMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(cacheNames = "rolePermission",key = "#id")
    @Override
    public RolePermission selectRolePermissionById(Integer id) {
        return rolePermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<RolePermission> selectRolePermissionList(Integer page, Integer limit) {
        return rolePermissionMapper.selectRolePermissionList(page,limit);
    }
}
