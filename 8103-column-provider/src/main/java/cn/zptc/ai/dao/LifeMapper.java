package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Life;

public interface LifeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Life record);

    int insertSelective(Life record);

    Life selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Life record);

    int updateByPrimaryKey(Life record);
}