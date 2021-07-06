package com.itheima.controller;

import com.itheima.exception.MyException;
import com.itheima.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLOutput;

@Controller
public class TargetController {
    @Autowired
    @Qualifier("demoService")
    private DemoService demoService;

    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("目标资源获取中......");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","itcase");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/show")
    public String show1() throws MyException {
        System.out.println("show running......");
        demoService.show1();
        return "index";
    }
}
