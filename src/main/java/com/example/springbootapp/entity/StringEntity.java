package com.example.springbootapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "string")
public class StringEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String content;

    public StringEntity(String content) {
        this.content = content;
    }

    public StringEntity() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
