package com.example.studySpringboot0002.component.useLocalMethod;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class useTimeMethod {

    public static String timeData() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        String logDate = dateTime.format(formatter);
        return logDate;
    }

}
