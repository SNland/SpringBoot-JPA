package com.dcm.springbootdemo.controller;

import com.dcm.springbootdemo.bean.Admin;
import com.dcm.springbootdemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class addController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/addAdmin")
    public String addAdmin(@RequestParam Admin admin)
    {
        Admin a=new Admin();
        a.setName(admin.getName());
        a.setAge(admin.getAge());
        a.setEmail(admin.getEmail());
        adminService.addAdmin(a);
        return "success";
    }
}
