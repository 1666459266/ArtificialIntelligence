package cn.zptc.ai.service;

import cn.zptc.ai.entity.Link;

import java.util.List;

public interface LinkService {
    int insertLink(Link link);

    int updateLink(Link link);

    int deleteLinkById(Integer id);

    Link selectLinkById(Integer id);

    List<Link> selectLinkList(Integer page, Integer limit);

    int updateLinkStates(Link link);
}
