package com.calisan;

import entity.Calisan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import repository.CalisanRepository;

import java.util.List;

@SpringBootApplication
public class CalisanApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalisanApplication.class, args);
    }

}
