package cn.zptc.ai.controller;

import cn.zptc.ai.entity.Article;
import cn.zptc.ai.service.ArticleService;
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
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/article")
    @PreAuthorize("hasAnyAuthority('p1','p2','p3','p4','p5','p6','p7','p8')")
    public ResponseUtil insertUser(Article article, @RequestParam(value = "file",required = false)MultipartFile multipartFile, HttpServletRequest request){
        try {
            if (multipartFile != null){
                FileUploadTool fileUploadTool = new FileUploadTool();
                String image = fileUploadTool.createFile(multipartFile, request);
                article.setImage(image);
            }
            article.setStates(1);
            int i = articleService.insertArticle(article);
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

    @PutMapping("/article")
    @PreAuthorize("hasAnyAuthority('p1','p2','p3','p4','p5','p6','p7','p8')")
    public ResponseUtil updateUser(Article article, @RequestParam(value = "file",required = false)MultipartFile multipartFile, HttpServletRequest request){
        try {
            if (article.getId() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Article article1 = articleService.selectArticleById(article.getId());
            if (article1 == null){
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
            if (multipartFile != null){
                FileUploadTool fileUploadTool = new FileUploadTool();
                String image = fileUploadTool.createFile(multipartFile, request);
                article.setImage(image);
            }
            int i = articleService.updateArticle(article);
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

    @DeleteMapping("/article/{id}")
    @PreAuthorize("hasAnyAuthority('p1','p2','p3','p4','p5','p6','p7','p8')")
    public ResponseUtil deleteUser(@PathVariable("id") Integer id){
        if (id == null){
            return new ResponseUtil(Constant.FAIL,"数据缺失");
        }
        Article article = articleService.selectArticleById(id);
        if (article == null){
            return new ResponseUtil(Constant.FAIL,"没有数据");
        }
        article.setStates(2);
        int i = articleService.updateArticleStates(article);
        if (i > 0){
            return new ResponseUtil(Constant.SUCCESS,"删除成功");
        } else {
            return new ResponseUtil(Constant.FAIL,"删除失败");
        }
    }

    @GetMapping("/article/{id}")
    public ResponseUtil selectUser(@PathVariable("id") Integer id){
        try {
            if (id == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Article article = articleService.selectArticleById(id);
            if (article != null){
                return new ResponseUtil(Constant.SUCCESS,article,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @GetMapping("/articleList")
    public ResponseUtil selectUserList(Integer page,Integer limit){
        try {
            if (page == null || limit == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            if (page <= 0 || limit <= 0){
                return new ResponseUtil(Constant.FAIL,"page或limit不能小于等于0");
            }
            List<Article> articles = articleService.selectArticleList(page-1, page*limit);
            if (articles != null){
                return new ResponseUtil(Constant.SUCCESS,articles,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }
}
