package com.example.springbootapp.service;

import com.example.springbootapp.entity.StringEntity;

import java.util.List;

public interface StringService {
    public StringEntity saveToData(StringEntity stringEntity);
    public List<StringEntity> searchByContent(String searchQuery);
}
