package com.restapi.entity;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Manager {

    @Id
    @GeneratedValue
    private Integer id;
}
