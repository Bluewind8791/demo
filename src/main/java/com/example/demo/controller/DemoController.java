package com.example.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
public class DemoController {

//    @GetMapping(value = "/")
//    public HttpEntity<?> intro() {
//
//        Map<String, Object> body = new HashMap<>();
//        body.put("now", new Date());
//
//        return new ResponseEntity<>(body, HttpStatus.OK);
//    }

    @GetMapping(value = "/api")
    public HttpEntity<?> intro() {

        Map<String, Object> body = new HashMap<>();
        body.put("type", "api");
        body.put("now", new Date());

        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
