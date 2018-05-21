package de.murat.tutorial.gradledemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class GradleDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(GradleDemo01Application.class, args);
    }
}
