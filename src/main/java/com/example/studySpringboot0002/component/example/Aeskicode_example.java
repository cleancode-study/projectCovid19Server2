package com.example.studySpringboot0002.component.example;

public class Aeskicode_example {

    public static void main(String[] args) {
        String text = "A가나張";
        for(int i = 0; i < text.length(); i++) {
            System.out.println("=========================================================");
            System.out.println(text.charAt(i));

            // 10진수
            System.out.println((int)text.charAt(i));	// 아스키코드 및 유니코드

            // 16진수
            System.out.format("0x%02X%n", (int)text.charAt(i));	// 아스키코드 ex) A -> 0x41
            System.out.format("0x%04X%n", (int)text.charAt(i));	// 유니코드	ex) 가 -> 0xAC00
        }

        System.out.println("=========================================================");

        // 문자로 변환
        System.out.println((char)65);		// 10진수 A 65 -> A
        System.out.println((char)0x41);		// 16진수 A -> A

        System.out.println((char)44032);	// 유니코드(10진수) 가 44032 -> 가
        System.out.println((char)0xAC00);	// 유니코드 가 0xAC00 -> 가

        System.out.println((char)24373);	// 유니코드 張 44032 -> 가
        System.out.println((char)0x5F35);	// 유니코드 張 44032 -> 가
    }

}
