package com.tssboot.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class TssBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TssBootProjectApplication.class, args);
    }

}
