package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.PermissionMapper;
import cn.zptc.ai.entity.Permission;
import cn.zptc.ai.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @CacheEvict(cacheNames = "permission",key = "#permission.id")
    @Override
    public int insertPermission(Permission permission) {
        return permissionMapper.insertSelective(permission);
    }

    @CacheEvict(cacheNames = "permission",key = "#permission.id")
    @Override
    public int updatePermission(Permission permission) {
        return permissionMapper.updateByPrimaryKeySelective(permission);
    }

    @CacheEvict(cacheNames = "permission",key = "#id")
    @Override
    public int deletePermissionById(Integer id) {
        return permissionMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(cacheNames = "permission",key = "#id")
    @Override
    public Permission selectPermissionById(Integer id) {
        return permissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Permission> selectPermissionList(Integer page, Integer limit) {
        return permissionMapper.selectPermissionList(page,limit);
    }

    @CacheEvict(cacheNames = "permission",key = "#permission.id")
    @Override
    public int updatePermissionStates(Permission permission) {
        return permissionMapper.updatePermissionStates(permission);
    }
}
