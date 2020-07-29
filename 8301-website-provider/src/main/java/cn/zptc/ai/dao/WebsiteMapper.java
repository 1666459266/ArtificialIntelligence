package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Website;

public interface WebsiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Website record);

    int insertSelective(Website record);

    Website selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Website record);

    int updateByPrimaryKey(Website record);
}