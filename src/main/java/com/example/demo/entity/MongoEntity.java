package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "demo")
public class MongoEntity {

    @Id
    private String id;
    private String username;
    private double income;
}
