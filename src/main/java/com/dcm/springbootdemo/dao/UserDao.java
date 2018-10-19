package com.dcm.springbootdemo.dao;

import com.dcm.springbootdemo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    public List<User> findUserByName(String name);
    public void deleteUserByName(String name);

}
