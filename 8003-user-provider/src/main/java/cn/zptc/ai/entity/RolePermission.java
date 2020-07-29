package cn.zptc.ai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolePermission implements Serializable {
    private Integer id;

    private Integer roleId;

    private String roleName;

    private Integer permissionId;

    private String permissionName;
}