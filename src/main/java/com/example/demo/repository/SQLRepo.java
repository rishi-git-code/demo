package com.example.demo.repository;

import com.example.demo.entity.SQLEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SQLRepo extends JpaRepository<SQLEntity, String> {

    @Override
    Optional<SQLEntity> findById(String id);
}
