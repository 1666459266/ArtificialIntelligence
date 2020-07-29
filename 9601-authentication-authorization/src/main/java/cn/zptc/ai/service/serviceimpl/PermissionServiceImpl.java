package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.PermissionMapper;
import cn.zptc.ai.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<String> getPermissionByUsername(String username) {
        return permissionMapper.getPermissionByUsername(username);
    }
}
