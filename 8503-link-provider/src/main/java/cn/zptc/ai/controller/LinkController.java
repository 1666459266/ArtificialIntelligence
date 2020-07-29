package cn.zptc.ai.controller;

import cn.zptc.ai.entity.Link;
import cn.zptc.ai.service.LinkService;
import cn.zptc.ai.util.Constant;
import cn.zptc.ai.util.ResponseUtil;
import cn.zptc.ai.util.uploadfile.FileUploadTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class LinkController {
    @Autowired
    private LinkService linkService;

    @PostMapping("/link")
    @PreAuthorize("hasAnyAuthority('p1','p2','p3','p4','p5','p6','p7','p8')")
    public ResponseUtil insertUser(Link link, @RequestParam(value = "file",required = false) MultipartFile multipartFile, HttpServletRequest request){
        try {
            if (multipartFile != null){
                FileUploadTool fileUploadTool = new FileUploadTool();
                String image = fileUploadTool.createFile(multipartFile, request);
                link.setImage(image);
            }
            link.setStates(1);
            int i = linkService.insertLink(link);
            if (i > 0){
                return new ResponseUtil(Constant.SUCCESS,"添加成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @PutMapping("/link")
    @PreAuthorize("hasAnyAuthority('p1','p2','p3','p4','p5','p6','p7','p8')")
    public ResponseUtil updateUser(Link link, @RequestParam(value = "file",required = false) MultipartFile multipartFile, HttpServletRequest request){
        try {
            if (link.getId() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Link link1 = linkService.selectLinkById(link.getId());
            if (link1 == null){
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
            if (multipartFile != null){
                FileUploadTool fileUploadTool = new FileUploadTool();
                String image = fileUploadTool.createFile(multipartFile, request);
                link.setImage(image);
            }
            int i = linkService.updateLink(link);
            if (i > 0){
                return new ResponseUtil(Constant.SUCCESS,"修改成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @DeleteMapping("/link/{id}")
    @PreAuthorize("hasAnyAuthority('p1','p2','p3','p4','p5','p6','p7','p8')")
    public ResponseUtil deleteUser(@PathVariable("id") Integer id){
        if (id == null){
            return new ResponseUtil(Constant.FAIL,"数据缺失");
        }
        Link link = linkService.selectLinkById(id);
        if (link == null){
            return new ResponseUtil(Constant.FAIL,"没有数据");
        }
        link.setStates(2);
        int i = linkService.updateLinkStates(link);
        if (i > 0){
            return new ResponseUtil(Constant.SUCCESS,"删除成功");
        } else {
            return new ResponseUtil(Constant.FAIL,"删除失败");
        }
    }

    @GetMapping("/link/{id}")
    public ResponseUtil selectUser(@PathVariable("id") Integer id){
        try {
            if (id == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Link link = linkService.selectLinkById(id);
            if (link != null){
                return new ResponseUtil(Constant.SUCCESS,link,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @GetMapping("/linkList")
    public ResponseUtil selectUserList(Integer page,Integer limit){
        try {
            if (page == null || limit == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            if (page <= 0 || limit <= 0){
                return new ResponseUtil(Constant.FAIL,"page或limit不能小于等于0");
            }
            List<Link> links = linkService.selectLinkList(page-1, page*limit);
            if (links != null){
                return new ResponseUtil(Constant.SUCCESS,links,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }
}
