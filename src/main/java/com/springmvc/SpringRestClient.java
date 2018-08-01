package com.springmvc;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication 
public class SpringRestClient {

    public static void main(String args[]){
    	SpringApplication.run(SpringRestClient.class, args);
    }   
}