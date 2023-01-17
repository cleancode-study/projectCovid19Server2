package com.example.project_server110_springboot.component.example;

import java.io.FileReader;
import org.json.simple.parser.JSONParser;

public class Knusl {

    public static void main(String[] args)  {

        System.out.println("hello world");

        try {
            FileReader reader = new FileReader("D:/Cleancode/projectCovid19Server110/src/main/resources/static/csv/SentiWord_info.json");
            JSONParser parser = new JSONParser();
            Object jsonObject = parser.parse(reader);
            reader.close();
            System.out.println("jsonObjects > " + jsonObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
