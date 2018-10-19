package com.dcm.springbootdemo.dao;

import com.dcm.springbootdemo.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin,String> {
}
