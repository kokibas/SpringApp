package com.example.springbootapp.controllers;

import com.example.springbootapp.entity.StringEntity;
import com.example.springbootapp.service.StringJPA;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/strings")
public class StringController {
    @Autowired
    private StringJPA stringJPA;

    @PostMapping
    @Operation(summary = "save to data")
    public StringEntity saveString(@RequestBody StringEntity stringEntity){
        return stringJPA.saveToData(stringEntity);
    }
    @GetMapping
    @Operation(summary = "search by symbols")
    public List<StringEntity> searchByContent(@RequestParam("search")String searchQuery){
        return stringJPA.searchByContent(searchQuery);
    }

}
