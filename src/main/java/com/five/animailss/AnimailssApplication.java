package com.five.animailss;

import com.sun.glass.ui.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@MapperScan(value = "com.five.animailss.mapper")
@ServletComponentScan
@SpringBootApplication
@ComponentScan(basePackages={"com"})

public class AnimailssApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(AnimailssApplication.class, args);
    }
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AnimailssApplication.class);
    }
}

