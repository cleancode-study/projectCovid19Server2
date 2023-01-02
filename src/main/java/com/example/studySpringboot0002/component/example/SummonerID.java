package com.example.studySpringboot0002.component.example;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SummonerID {
    private String id;             // Encryted summoner ID
    private String accountID;
    private String puuid;          // 소환사 고유 id
    private static String name;           // 소환사 닉네임 >> 메인 컨트롤러에서 클래스 생성해서 받자
    private String profileIconId;  // 프로필 아이콘
    private String summonerLevel;
    private String[] matchID = new String[30];

    // 게터
    public String getId() {
        return id;
    }
    public String getAccountID() {
        return accountID;
    }
    public String getPuuid() {
        return puuid;
    }
    public String getName() {
        return name;
    }
    public String getProfileIconId() {
        return profileIconId;
    }
    public String getSummonerLevel() {
        return summonerLevel;
    }
    public String[] getMatchID() {
        return matchID;
    }

    // 클래스 생성자 >> 생성시 소환사 이름 받아서 할당
    public SummonerID(String name) {
        this.name = name;
    }

    // Riot API 클래스 ApiZip 하위 변수 summonerV4 >> 소환사 기본
    // [반환 정보] id(Encryted summoner ID), accountID, puuid(소환사 고유 id), name(소환사 닉네임), profileIconId(프로필 아이콘), summonerLevel

    public static void main(String[] args) throws IOException, ParseException {

        // 0. api 주소 모음 객체 생성
//        ApiZip apiZip = new ApiZip();
//        System.out.println(apiZip.getSummonerV4());
        // 이거 http:// 안 달려 있는 코드임 형식 맞게 붙여주셈
        // 주소 형식 예제
        // https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/???

        // 1. API 주소 설정
        String API = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/";

        // 2. URL 객체 생성
        URL url = new URL(API);

        // 3. URL과 통신하기 위한 Connection 객체 생성
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();


        

        // 4. GET 방식
        conn.setRequestMethod("GET");

        // 5. 통신 요청 SET
        conn.setRequestProperty("Content-Type", "application/json; UTF-8");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.3) Gecko/20100401 Firefox/3.6.3");
        conn.setRequestProperty("Accept-Language", "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
        conn.setRequestProperty("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");
        conn.setRequestProperty("Origin", "https://developer.riotgames.com");



        // 4. 통신 메서드 SET(GET, POST)
//        conn.setRequestMethod("POST");

        System.out.println(conn.getRequestProperties().toString());
        /* 요청 형태
            {
                "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36",
                "Accept-Language": "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7",
                "Accept-Charset": "application/x-www-form-urlencoded; charset=UTF-8",
                "Origin": "https://developer.riotgames.com",
                "X-Riot-Token": "RGAPI-3a549bfe-ce0a-471f-897d-b5985ffe2307"
            }
        */

        // 항상 갱신된 값을 가져옴
        conn.setDoOutput(true);

        // 6. 통신 응답 코드 확인
        int res = conn.getResponseCode();
        System.out.println("RES: " + res);

        // 7. 추출한 데이터를 BufferdReader 객체로 저장 >> 응답 코드가 올바르지 않을 경우 예외 처리
        // 7-1). json String 을 저장할 변수 생성
        String jsonData = "";

        if(res >= 200 && res <= 300) {

            // 7-2) BufferdReader 객체 생성
            // **) https://recordsoflife.tistory.com/306
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

            // 7-3) 버퍼 리더 객체를 한 줄씩 읽어 json String 변수 result에 저장
            jsonData += rd.readLine();

            // 7-3) 리더 객체 종료
            rd.close();
        } else {
            // 예외 처리
            System.out.println("요청 오류 발생");
        }

        // 10. 저장한 json 데이터 정상 출력 확인
        System.out.println(jsonData);

//        // 11. JSONParser 생성 및 최초 파싱 > JSONObject에 저장
//        // https://velog.io/@sujin1018/%EC%8A%A4%ED%94%84%EB%A7%81-json-%ED%8C%8C%EC%8B%B1%ED%95%98%EA%B8%B0
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
//
//        // 12. JSONObject에서 원하는 요소 추출
//        JSONObject data = (JSONObject) jsonObject.get("data");
//        System.out.println(data);
    }
}