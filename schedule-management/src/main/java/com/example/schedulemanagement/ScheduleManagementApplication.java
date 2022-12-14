package com.example.schedulemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class ScheduleManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleManagementApplication.class, args);
    }

}
