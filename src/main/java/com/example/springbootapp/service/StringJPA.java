package com.example.springbootapp.service;

import com.example.springbootapp.DAO.StringRepository;
import com.example.springbootapp.entity.StringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StringJPA implements StringService {
    @Autowired
    private StringRepository stringRepository;

    @Override
    public StringEntity saveToData(StringEntity stringEntity) {
        return stringRepository.save(stringEntity);
    }

    @Override
    public List<StringEntity> searchByContent(String searchQuery) {
        return stringRepository.searchByContentContaining(searchQuery);
    }


}
