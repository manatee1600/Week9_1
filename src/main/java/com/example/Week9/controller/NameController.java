package com.example.Week9.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.Week9.service.NameService;

import java.util.List;

@RestController
public class NameController {
    
    //field
    private final NameService nameService;

    //constructor
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<NameResponse> getNames(){
        return nameService.findAll().stream().map(NameResponse::new).toList();
        
    }
    
}
