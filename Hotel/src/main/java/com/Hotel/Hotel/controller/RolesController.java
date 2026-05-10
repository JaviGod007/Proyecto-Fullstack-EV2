package com.Hotel.Hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.service.RolesService;

@RestController
@RequestMapping("/api/v1/roles")
public class RolesController {

    @Autowired
    public RolesService rolesService;

    
}
