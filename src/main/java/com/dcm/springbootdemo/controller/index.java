package com.dcm.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
public class index {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String indexhtml()
    {
        return "index";
    }

}

