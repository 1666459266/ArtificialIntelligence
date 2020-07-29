package cn.zptc.ai.dao;

import cn.zptc.ai.entity.PartyBuilding;

public interface PartyBuildingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PartyBuilding record);

    int insertSelective(PartyBuilding record);

    PartyBuilding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartyBuilding record);

    int updateByPrimaryKey(PartyBuilding record);
}