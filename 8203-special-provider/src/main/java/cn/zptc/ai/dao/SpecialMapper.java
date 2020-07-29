package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Special;

public interface SpecialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Special record);

    int insertSelective(Special record);

    Special selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Special record);

    int updateByPrimaryKey(Special record);
}