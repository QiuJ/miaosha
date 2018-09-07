package com.q.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Date: 2018/9/7 10:53
 * @Description:
 */
@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","q");
        return "hello";
    }
}
