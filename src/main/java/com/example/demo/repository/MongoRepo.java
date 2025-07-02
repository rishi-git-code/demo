package com.example.demo.repository;

import com.example.demo.entity.MongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface MongoRepo extends MongoRepository<MongoEntity, String> {

    @Override
    Optional<MongoEntity> findById(String id);
}
