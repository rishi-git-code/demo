package com.example.demo.controllers;

import com.example.demo.dto.MongoReqDTO;
import com.example.demo.dto.SQLReqDTO;
import com.example.demo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private DemoService demoService;
    @PostMapping("/user")
    public ResponseEntity<?> createUserSQL(@RequestBody SQLReqDTO sqlReqDTO){
        String response = demoService.createUser(sqlReqDTO);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/salary")
    public ResponseEntity<?> addsalaryMongo(@RequestBody MongoReqDTO mongoReqDTO) {
        String response = demoService.createSalary(mongoReqDTO);
        return ResponseEntity.ok(response);
    }

}
