package com.dcm.springbootdemo.service;

import com.dcm.springbootdemo.bean.Admin;
import com.dcm.springbootdemo.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AdminService {
    @Autowired
    private AdminDao adminDao;
    public void addAdmin(Admin admin)
    {
        adminDao.save(admin);
    }
}
