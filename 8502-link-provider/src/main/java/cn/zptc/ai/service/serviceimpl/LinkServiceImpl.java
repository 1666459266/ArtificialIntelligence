package cn.zptc.ai.service.serviceimpl;

import cn.zptc.ai.dao.LinkMapper;
import cn.zptc.ai.entity.Link;
import cn.zptc.ai.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements LinkService {
    @Autowired
    private LinkMapper linkMapper;

    @CacheEvict(cacheNames = "link",key = "#link.id")
    @Override
    public int insertLink(Link link) {
        return linkMapper.insertSelective(link);
    }

    @CacheEvict(cacheNames = "link",key = "#link.id")
    @Override
    public int updateLink(Link link) {
        return linkMapper.updateByPrimaryKeySelective(link);
    }

    @CacheEvict(cacheNames = "link",key = "#id")
    @Override
    public int deleteLinkById(Integer id) {
        return linkMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(cacheNames = "link",key = "#id")
    @Override
    public Link selectLinkById(Integer id) {
        return linkMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Link> selectLinkList(Integer page, Integer limit) {
        return linkMapper.selectLinkList(page,limit);
    }

    @CacheEvict(cacheNames = "link",key = "#link.id")
    @Override
    public int updateLinkStates(Link link) {
        return linkMapper.updateLinkStates(link);
    }
}
