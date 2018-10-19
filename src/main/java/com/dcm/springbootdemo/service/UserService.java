package com.dcm.springbootdemo.service;

import com.dcm.springbootdemo.bean.User;
import com.dcm.springbootdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    //增加User
    public void addUser( User user)
    {
        userDao.save(user);
    }

    //修改User信息
    public void updateUser(User user)
    {
        userDao.save(user);
    }

    //根据User的ID删除User
    public void deleteUserById(Integer id)
    {
        userDao.deleteById(id);
    }

    //根据User Name删除User
    public void deleteUserByName(String name)
    {
        userDao.deleteUserByName(name);
    }

    //查询所有User
    public List<User> findAll()
    {
        return userDao.findAll();
    }

    //根据id查询User
    public User findUserById(Integer id){
        return userDao.findById(id).get();
    }

    //根据name查询User
    public List<User>findUserByName(String name)
    {
        return userDao.findUserByName(name);
    }

}
