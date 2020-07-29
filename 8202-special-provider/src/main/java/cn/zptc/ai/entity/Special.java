package cn.zptc.ai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Special implements Serializable {
    private Integer id;

    private String title;

    private String context;

    private String image;

    private String classification;

    private Integer createId;

    private String createName;

    private Date createTime;

    private Integer modifyId;

    private String modifyName;

    private Date modifyTime;

    private Integer states;
}