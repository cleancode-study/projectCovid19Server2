package com.example.project_server110_springboot.component.example;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;

public class Knusl {

    public static void main(String[] args)  {

        System.out.println("hello world");

        try {
            FileReader reader = new FileReader("D:/Cleancode/projectCovid19Server110/src/main/resources/static/csv/SentiWord_info.json");
            JSONParser parser = new JSONParser();
            Object jsonObject = parser.parse(reader);

            ArrayList<HashMap<String, String>> parsedMap = (ArrayList<HashMap<String, String>>) jsonObject;

//            System.out.println("jsonObjects > " + jsonObject);
            for(HashMap<String, String> item : parsedMap) {
                System.out.println(item.get("word"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
