package com.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class HelloWorldController {


    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<String> getHelloWorld()throws IOException {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}