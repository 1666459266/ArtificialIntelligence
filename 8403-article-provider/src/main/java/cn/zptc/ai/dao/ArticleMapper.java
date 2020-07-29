package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectArticleList(@Param("page") Integer page, @Param("limit") Integer limit);

    int updateArticleStates(Article article);
}