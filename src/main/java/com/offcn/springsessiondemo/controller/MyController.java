package com.offcn.springsessiondemo.controller;

import com.offcn.springsessiondemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MyController {
    @GetMapping("/indexPage")
    public String indexPage(Model model){
//        new ModelAndView()
        //在前端通过message去拿到hello-thymeleaf的值
        model.addAttribute("message","hello-thymeleaf");
        System.out.println("-------进入了控制层");
        User user = new User();
        user.setId("123456");
        user.setName("ym");
        user.setAge(18);
        model.addAttribute("user",user);


        List<User> list=new ArrayList<User>();
        User u1 = new User();
        u1.setId("1");
        u1.setName("优就业");
        u1.setAge(18);
        list.add(u1);

        User u2 = new User();
        u2.setId("2");
        u2.setName("中公教育");
        u2.setAge(28);
        list.add(u2);
        User u3 = new User();
        u3.setId("3");
        u3.setName("IT先锋");
        u3.setAge(88);
        list.add(u3);

        User u4 = new User();
        u4.setId("4");
        u4.setName("JAVA第一");
        u4.setAge(888);
        list.add(u4);

        model.addAttribute("userList", list);

        //日期
        Date date = new Date();
        model.addAttribute("date",date);
        double num = 4.1415926;
        model.addAttribute("price",num);
        String str = "qiehjhghojhasoijh" +
                "han;akjsgn;aoi" +
                ";shga;ih";
        model.addAttribute("str",str);
        return "index";

    }
}











