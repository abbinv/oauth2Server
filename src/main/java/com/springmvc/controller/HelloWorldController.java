package com.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@RestController
public class HelloWorldController {
    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());


    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<String> getHelloUser(HttpServletRequest request)throws IOException {
        LOG.info("User call received");
        return new ResponseEntity<String>("Hello User", HttpStatus.OK);
    }

    @RequestMapping(value = "/admin/", method = RequestMethod.GET)
    public ResponseEntity<String> getHelloAdmin(HttpServletRequest request)throws IOException {
        LOG.info("User call received");
        return new ResponseEntity<String>("Hello Admin", HttpStatus.OK);
    }
}