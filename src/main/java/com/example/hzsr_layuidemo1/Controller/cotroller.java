package com.example.hzsr_layuidemo1.Controller;


import com.example.hzsr_layuidemo1.mapper.MenuMapper;
import com.example.hzsr_layuidemo1.mapper.UserMapper;
import com.example.hzsr_layuidemo1.pojo.menu;
import com.example.hzsr_layuidemo1.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@RestController  return返回字符串类型。不会进行页面跳转   @Controller return回进行页面跳转
@Controller
//@RestController
public class cotroller {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MenuMapper menuMapper;
    @RequestMapping("hello2")
    public void findAll() {
        List<student> list = userMapper.findAll();
        System.out.println(list);
    }

    @RequestMapping("hello1")
    public String hello1(){
        return "hello";
    }

    @RequestMapping("hello3")
    public String findall() {
        List<menu> list = menuMapper.findAll();
        System.out.println(list);
        return "start/index.html";

    }
    @RequestMapping("hello4")
    public String menu(){
        return "start/index.html";
    }
}
