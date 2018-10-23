package com.restapi.service;

import  com.restapi.entity.Manager;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface ManagerService {

    public Manager findById(Integer id);
    public List<Manager> findAll();
    public Manager save(Manager manager);
    public Manager update(Manager manager);
    public void  delete(Manager manager);

}
