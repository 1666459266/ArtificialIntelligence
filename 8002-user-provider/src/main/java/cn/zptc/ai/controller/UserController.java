package cn.zptc.ai.controller;

import cn.zptc.ai.entity.Role;
import cn.zptc.ai.entity.User;
import cn.zptc.ai.service.RoleService;
import cn.zptc.ai.service.UserService;
import cn.zptc.ai.util.Constant;
import cn.zptc.ai.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @PostMapping("/user")
    @PreAuthorize("hasAnyAuthority('p1','p2')")
    public ResponseUtil insertUser(User user){
        try {
            if (user.getUsername() == null || user.getPassword() == null || user.getRoleId() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
            user.setPassword(password);
            user.setStates(1);
            user.setCreateTime(new Date());
            Role role = roleService.selectRoleById(user.getRoleId());
            user.setRoleId(role.getId());
            user.setRoleName(role.getName());
            user.setRoleDescription(role.getDescription());
            int i = userService.insertUser(user);
            if (i > 0){
                return new ResponseUtil(Constant.SUCCESS,"添加成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @PutMapping("/user")
    @PreAuthorize("hasAnyAuthority('p1','p2')")
    public ResponseUtil updateUser(User user){
        try {
            if (user.getId() == null || user.getUsername() == null || user.getPassword() == null || user.getRoleId() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            User user1 = userService.selectUserByUserId(user.getId());
            if (user1 == null){
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
            if (BCrypt.checkpw(user.getPassword(),user1.getPassword())){
                String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
                user.setPassword(password);
            } else {
                user.setPassword(user1.getPassword());
            }
            int i = userService.updateUser(user);
            if (i > 0){
                return new ResponseUtil(Constant.SUCCESS,"修改成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @DeleteMapping("/user/{id}")
    @PreAuthorize("hasAnyAuthority('p1','p2')")
    public ResponseUtil deleteUser(@PathVariable("id") Integer id){
        if (id == null){
            return new ResponseUtil(Constant.FAIL,"数据缺失");
        }
        User user = userService.selectUserByUserId(id);
        if (user == null){
            return new ResponseUtil(Constant.FAIL,"没有数据");
        }
        user.setStates(2);
        int i = userService.updateUserStates(user);
        if (i > 0){
            return new ResponseUtil(Constant.SUCCESS,"删除成功");
        } else {
            return new ResponseUtil(Constant.FAIL,"删除失败");
        }
    }

    @GetMapping("/user/{id}")
    public ResponseUtil selectUser(@PathVariable("id") Integer id){
        try {
            if (id == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            User user = userService.selectUserByUserId(id);
            if (user != null){
                return new ResponseUtil(Constant.SUCCESS,user,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @GetMapping("/userList")
    public ResponseUtil selectUserList(Integer page,Integer limit){
        try {
            if (page == null || limit == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            if (page <= 0 || limit <= 0){
                return new ResponseUtil(Constant.FAIL,"page或limit不能小于等于0");
            }
            List<User> users = userService.selectUserList(page-1, page*limit);
            if (users != null){
                return new ResponseUtil(Constant.SUCCESS,users,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }
}
