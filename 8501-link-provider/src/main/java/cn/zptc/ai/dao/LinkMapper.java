package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Link;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Link record);

    int insertSelective(Link record);

    Link selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);

    List<Link> selectLinkList(@Param("page") Integer page, @Param("limit") Integer limit);

    int updateLinkStates(Link link);
}