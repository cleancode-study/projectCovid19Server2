package com.example.project_server110_springboot.component.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {



    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("1번키","사과"); //값 추가
        map.put("2번키","바나나");
        map.put("3번키","포도");
        map.put("4번키","포도");

        for(Map.Entry<String, String> item : map.entrySet()){
            if(item.getValue().equals("포도")) {
                System.out.println("포도의 키 값은 "+item.getKey());
            }
        }

    }
}
