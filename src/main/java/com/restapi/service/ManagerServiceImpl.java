package com.restapi.service;

import com.restapi.entity.Manager;
import com.restapi.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ManagerServiceImpl implements  ManagerService {

    @Autowired
    private ManagerRepository managerRepository ;

    @Override
    @Transactional
    public Manager findById(Integer id) {
        return managerRepository.findById(id).get();
    }

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

    @Override
    public Manager save(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager update(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void delete(Manager manager) {
        managerRepository.delete(manager);
    }
}
