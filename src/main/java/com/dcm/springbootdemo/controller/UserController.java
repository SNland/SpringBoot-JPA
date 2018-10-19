package com.dcm.springbootdemo.controller;

import com.dcm.springbootdemo.bean.User;
import com.dcm.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //添加一个User
    @PostMapping("/adduser")
    public int addUser(@Valid User user, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return 404;
        }
        try{
            userService.addUser(user);
            return 200;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("User failed to add to database");
            return 500;
        }
    }

    //根据User id查询
    @GetMapping("/findUserById")
    public User findUserById(@RequestParam(name = "id",required=true) Integer id)
    {
        User user=userService.findUserById(id);
        return new User(user.getName(),user.getAge(),user.getEmail());
    }

    //根据User姓名查询
    @GetMapping("/findUserByName")
    public List<User> findUserByName(@RequestParam(value = "name",required = true)String name)
    {
            List<User> userList=userService.findUserByName(name);
            return userList;
    }

    //查询所有User
    @GetMapping("/findAll")
    public List<User> findAllUser()
    {
        List<User> userList=userService.findAll();
        return userList;
    }

    //更新User
    @PutMapping("/updateUser")
    public int updateUser(User user)
    {
        User user1=new User();
        user1.setId(user.getId());
        user1.setAge(user.getAge());
        user1.setEmail(user.getEmail());
        user1.setName(user.getName());
        userService.updateUser(user1);
        return 200;
    }

    //根据id删除User
    @DeleteMapping("/deleteUserById")
    public void deleteUserById(@RequestParam("id") Integer id)
    {
        userService.deleteUserById(id);
    }

    @DeleteMapping("/deleteUserByName")
    public void deleteUserByName(@RequestParam("name") String name)
    {
        userService.deleteUserByName(name);
    }
}
