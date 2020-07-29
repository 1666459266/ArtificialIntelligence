package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.RoleMapper;
import cn.zptc.ai.entity.Role;
import cn.zptc.ai.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @CacheEvict(cacheNames = "role",key = "#role.id")
    @Override
    public int insertRole(Role role) {
        return roleMapper.insertSelective(role);
    }

    @CacheEvict(cacheNames = "role",key = "#role.id")
    @Override
    public int updateRole(Role role) {
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @CacheEvict(cacheNames = "role",key = "#id")
    @Override
    public int deleteRoleById(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(cacheNames = "role",key = "#id")
    @Override
    public Role selectRoleById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> selectRoleList(Integer page, Integer limit) {
        return roleMapper.selectRoleList(page,limit);
    }

    @CacheEvict(cacheNames = "role",key = "#role.id")
    @Override
    public int updateRoleStates(Role role) {
        return roleMapper.updateRoleStates(role);
    }
}
