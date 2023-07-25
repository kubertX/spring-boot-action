package com.kubertX.springboot.action.orm.mybatis.pagehelper.controller;


import com.github.pagehelper.PageInfo;
import com.kubertX.springboot.action.orm.mybatis.pagehelper.model.User;
import com.kubertX.springboot.action.orm.mybatis.pagehelper.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/page")
public class PageController {

    @Autowired
    private PageService pageService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<User> list(@RequestParam("num")Integer pageNum,@RequestParam("size")Integer pageSize){
        return pageService.page(pageNum,pageSize);
    }
}
