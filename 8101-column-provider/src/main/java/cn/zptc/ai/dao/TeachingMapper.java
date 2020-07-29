package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Teaching;

public interface TeachingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teaching record);

    int insertSelective(Teaching record);

    Teaching selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teaching record);

    int updateByPrimaryKey(Teaching record);
}