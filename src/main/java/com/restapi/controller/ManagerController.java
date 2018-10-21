package com.restapi.controller;

import com.restapi.entity.Manager;

//import restapi.spring.entity.Manager;

import com.restapi.service.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/managers")
public class ManagerController {

    @Autowired
    ManagerServiceImpl managerService ;

    private static final Logger log = LoggerFactory.getLogger(ManagerController.class);

//	@GetMapping(value = "/hello")
//	public  String test() {
//		return  "Hello WORLD....................................";
//	}


    @GetMapping("/")
    public ResponseEntity<List<Manager>> ManagerList() {
        List<Manager> managers = null;
        try {
            managers = managerService.findAll();
            if(managers.isEmpty()) {
                return new ResponseEntity("Manager list is empty",HttpStatus.OK);
            }
        }catch(Exception e){
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return new ResponseEntity<List<Manager>>(managers, HttpStatus.OK);
    }


}
