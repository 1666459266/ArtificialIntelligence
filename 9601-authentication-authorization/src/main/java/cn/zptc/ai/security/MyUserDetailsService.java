package cn.zptc.ai.security;

import cn.zptc.ai.entity.User;
import cn.zptc.ai.service.PermissionService;
import cn.zptc.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);
        if (user == null) {
            return null;
        }
        List<String> permissions = permissionService.getPermissionByUsername(username);
        //将permissions转化为数组
        String[] permissionArray = new String[permissions.size()];
        permissions.toArray(permissionArray);
        //返回数据库的数据
        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities(permissionArray)
                .build();
        return userDetails;
    }
}
