package cn.zptc.ai.service;

import cn.zptc.ai.entity.Article;

import java.util.List;

public interface ArticleService {
    int insertArticle(Article article);

    int updateArticle(Article article);

    int deleteArticleById(Integer id);

    Article selectArticleById(Integer id);

    List<Article> selectArticleList(Integer page,Integer limit);

    int updateArticleStates(Article article);
}
