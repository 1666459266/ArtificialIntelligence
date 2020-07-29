package cn.zptc.ai.service;

import java.util.List;

public interface PermissionService {
    //根据用户名查询用户权限
    List<String> getPermissionByUsername(String username);
}
