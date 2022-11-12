package com.Hamza.studentSystem.controller;

import com.Hamza.studentSystem.model.Attribute;
import com.Hamza.studentSystem.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/attribute")

public class AttributeController {
    @Autowired
    private AttributeService attributeService;

    @GetMapping("/getAll")
    public List<Attribute> getAll(){
        return attributeService.getAllAttributes();
    }
}
