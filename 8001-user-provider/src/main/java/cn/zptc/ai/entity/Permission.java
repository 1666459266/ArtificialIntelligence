package cn.zptc.ai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission implements Serializable {
    private Integer id;

    private String name;

    private String description;

    private String identification;

    private String url;

    private Integer sort;

    private Integer parentId;

    private Integer states;
}