package cn.zptc.ai.dao;

import cn.zptc.ai.entity.RecruitStudents;

public interface RecruitStudentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecruitStudents record);

    int insertSelective(RecruitStudents record);

    RecruitStudents selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitStudents record);

    int updateByPrimaryKey(RecruitStudents record);
}