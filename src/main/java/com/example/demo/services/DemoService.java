package com.example.demo.services;

import com.example.demo.dto.MongoReqDTO;
import com.example.demo.dto.SQLReqDTO;
import com.example.demo.entity.MongoEntity;
import com.example.demo.entity.SQLEntity;
import com.example.demo.repository.MongoRepo;
import com.example.demo.repository.SQLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private MongoRepo mongoRepo;

    @Autowired
    private SQLRepo sqlRepo;

    public String createUser(SQLReqDTO sqlReqDTO){

        SQLEntity user = new SQLEntity();
        user.setUsername(sqlReqDTO.getUsername());
        user.setPassword(sqlReqDTO.getPassword());
        sqlRepo.save(user);
        return "User Created Successfully";
    }
    public String createSalary(MongoReqDTO mongoReqDTO){

        MongoEntity salary = new MongoEntity();
        salary.setUsername(mongoReqDTO.getUsername());
        salary.setIncome(mongoReqDTO.getIncome());
        mongoRepo.save(salary);
        return "Salary Successfully Added";
    }
}
