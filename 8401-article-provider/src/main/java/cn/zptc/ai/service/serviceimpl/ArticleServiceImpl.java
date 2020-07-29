package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.ArticleMapper;
import cn.zptc.ai.entity.Article;
import cn.zptc.ai.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @CacheEvict(cacheNames = "article",key = "#article.id")
    @Override
    public int insertArticle(Article article) {
        return articleMapper.insertSelective(article);
    }

    @CacheEvict(cacheNames = "article",key = "#article.id")
    @Override
    public int updateArticle(Article article) {
        return articleMapper.updateByPrimaryKeySelective(article);
    }

    @CacheEvict(cacheNames = "article",key = "#article.id")
    @Override
    public int deleteArticleById(Integer id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(cacheNames = "article",key = "#id")
    @Override
    public Article selectArticleById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Article> selectArticleList(Integer page, Integer limit) {
        return articleMapper.selectArticleList(page,limit);
    }

    @CacheEvict(cacheNames = "article",key = "#article.id")
    @Override
    public int updateArticleStates(Article article) {
        return articleMapper.updateArticleStates(article);
    }
}
