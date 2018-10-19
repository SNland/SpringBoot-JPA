package com.dcm.springbootdemo.controller;

import com.dcm.springbootdemo.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/say")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    //@RequestMapping(value = {"/hi"},method = RequestMethod.GET)
    @GetMapping("/hello")
    public String say(@RequestParam ("id") Integer mid)
    {
        return "id"+mid;
    }
}
