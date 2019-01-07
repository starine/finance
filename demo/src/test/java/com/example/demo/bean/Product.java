package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productNum;
    private String productName;
    private String category;
    private float intrate;
    private int bankNum;
    private String productDescription;
    private String pictureAddress;

    public Product(){};
}
