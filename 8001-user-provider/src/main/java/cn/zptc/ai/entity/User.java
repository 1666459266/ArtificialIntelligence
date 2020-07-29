package cn.zptc.ai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Integer gender;

    private String phone;

    private String email;

    private Date createTime;

    private Integer roleId;

    private String roleName;

    private String roleDescription;

    private Integer states;
}