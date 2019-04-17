package com.yuxi.web.controller;

import com.yuxi.model.Student;
import com.yuxi.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller

@RequestMapping("stu")
public class StudentController {
    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("username","wyx");
        model.addAttribute("age",20);
        List<Student> stuList=new ArrayList<Student>();
        stuList.add(new Student(1,"lisi","123"));
        stuList.add(new Student(2,"lisi","123"));
        stuList.add(new Student(3,"lisi","123"));
        model.addAttribute("stuList",stuList);
        return "stu/list";
    }

    }


