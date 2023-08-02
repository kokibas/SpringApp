package com.example.springbootapp.DAO;

import com.example.springbootapp.entity.StringEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StringRepository extends JpaRepository<StringEntity,Long> {
    public List<StringEntity> searchByContentContaining(String searchQuery);
}
