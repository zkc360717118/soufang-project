package com.imooc.web.controller;

import com.imooc.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "lara");
        return "index";
    }

    //测试写的api通用回复
    @RequestMapping("/get")
    @ResponseBody
    public ApiResponse get() {
        return ApiResponse.ofNotLogin();
    }

    //测试写的404页面
    @RequestMapping("/404")
    public String notFooundPage() {
        return "404";
    }

    //测试写的403页面
    @RequestMapping("/403")
    public String accessError() {
        return "403";
    }

    //测试写的500页面
    @RequestMapping("/500")
    public String internalError() {
        return "500";
    }

    //测试写的logout页面
    @RequestMapping("/logout")
    public String logout() {
        //退出页面
        return  "logout";
    }
}

