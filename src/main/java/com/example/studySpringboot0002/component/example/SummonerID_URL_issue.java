//package com.example.studySpringboot0002.component.example;
//
//
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class SummonerID {
//    private static String id;             // Encryted summoner ID
//    private static String accountId;
//    private static String puuid;          // 소환사 고유 id
//    private static String name;           // 소환사 닉네임 >> 메인 컨트롤러에서 클래스 생성해서 받자
//    private static String profileIconId;  // 프로필 아이콘
//    private static String summonerLevel;
//    private static String[] matchID = new String[30];
//
//    // 게터
//    public String getId() {
//        return id;
//    }
//    public String getAccountId() {
//        return accountId;
//    }
//    public String getPuuid() {
//        return puuid;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getProfileIconId() {
//        return profileIconId;
//    }
//    public String getSummonerLevel() {
//        return summonerLevel;
//    }
//    public String[] getMatchID() {
//        return matchID;
//    }
//
//    // 클래스 생성자 >> 생성시 소환사 이름 받아서 할당
//    public SummonerID(String name) {
//        this.name = name;
//    }
//
//    // Riot API 클래스 ApiZip 하위 변수 summonerV4 >> 소환사 기본
//    // [반환 정보] id(Encryted summoner ID), accountID, puuid(소환사 고유 id), name(소환사 닉네임), profileIconId(프로필 아이콘), summonerLevel
//
//    public static void main(String[] args) throws IOException, ParseException {
//
//        // 0. api 주소 모음 객체 생성
//        ApiZip apiZip = new ApiZip();
//
//        // --------------------------------------- 소환사 기본 정보 ------------------------------------------------------
//
//        System.out.println("--------------------------------- 소환사 기본 정보---------------------------------");
//        // 1. API 주소 설정
//        String APISummonerV4 = apiZip.getHttp() + apiZip.getRegion_kr() + apiZip.getSummonerV4() + "16층남바30바드" + apiZip.getApiKey();
//        System.out.println("API 주소: " + APISummonerV4);
//        https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/xNmvlhdyNouvRkf7HFYM6HqktG1dZCqG1hbyuAC3RyOTy5ozUJm2dD4A_vdYFZotZa2ZFuOcC7MFpg/ids?start=0&count=30&api_key=RGAPI-3a549bfe-ce0a-471f-897d-b5985ffe2307
//
//        // 2. URL 객체 생성
//        URL url = new URL(APISummonerV4);
//
//        // 3. URL과 통신하기 위한 Connection 객체 생성
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//
//        // 4. Request 방식 + Property SET
//        conn.setRequestMethod("GET");
//
//        // 5. 통신 요청 SET
//        conn.setRequestProperty("Content-Type", "application/json; UTF-8");
//        System.out.println("Request parameter: " + conn.getRequestProperties().toString());
//
//        // 항상 갱신된 값을 가져옴
//        conn.setDoOutput(true);
//
//        // 6. 통신 응답 코드 확인
//        int res = conn.getResponseCode();
//        System.out.println("RES: " + res);
//
//        // 7. 추출한 데이터를 BufferdReader 객체로 저장 >> 응답 코드가 올바르지 않을 경우 예외 처리
//        // 7-1). json String 을 저장할 변수 생성
//        String jsonData = "";
//
//        if(res >= 200 && res <= 300) {
//
//            // 7-2) BufferdReader 객체 생성
//            // **) https://recordsoflife.tistory.com/306
//            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//
//            // 7-3) 버퍼 리더 객체를 한 줄씩 읽어 json String 변수 result에 저장
//            jsonData += rd.readLine();
//
//            // 7-3) 리더 객체 종료
//            rd.close();
//        } else {
//            // 예외 처리
//            System.out.println("요청 오류 발생");
//        }
//
//        // 10. 저장한 json 데이터 정상 출력 확인
//        System.out.println("jsonData: " + jsonData);
//
//        // 11. JSONParser 생성 및 최초 파싱 > JSONObject에 저장
//        // https://velog.io/@sujin1018/%EC%8A%A4%ED%94%84%EB%A7%81-json-%ED%8C%8C%EC%8B%B1%ED%95%98%EA%B8%B0
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
//
//        // 12. JSONObject에서 원하는 요소 추출
//        id = jsonObject.get("id").toString();
//        accountId = jsonObject.get("accountId").toString();
//        puuid = jsonObject.get("puuid").toString();
//        name = jsonObject.get("id").toString();
//        profileIconId = jsonObject.get("profileIconId").toString();
//        summonerLevel = jsonObject.get("summonerLevel").toString();
//
//        System.out.println();
//        System.out.println();
//
//        // // -------------------------------------- 소환사 최근 게임 id -----------------------------------------------------
//
//        System.out.println("--------------------------------- 소환사 최근 게임 id ---------------------------------");
//        // 1. API 주소 설정
//        String APImatchV5Puuid = apiZip.getHttp() + apiZip.getRegion_asia() + apiZip.getMatchV5Puuid() + puuid + apiZip.getMatchCount() + "&" +apiZip.getApiKey();
//        System.out.println("API 주소: " + APImatchV5Puuid);
//        // https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/xNmvlhdyNouvRkf7HFYM6HqktG1dZCqG1hbyuAC3RyOTy5ozUJm2dD4A_vdYFZotZa2ZFuOcC7MFpg/ids?start=0&count=30&api_key=RGAPI-3a549bfe-ce0a-471f-897d-b5985ffe2307
//
//        // 2. URL 객체 생성
//        URL url2 = new URL(APImatchV5Puuid);
//
//        // 3. URL과 통신하기 위한 Connection 객체 생성
//        HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
//
//        // 4. Request 방식 + Property SET
//        conn2.setRequestMethod("GET");
//
//        // 5. 통신 요청 SET
//        conn2.setRequestProperty("Content-Type", "application/json; UTF-8");
//        System.out.println("Request parameter: " + conn2.getRequestProperties().toString());
//
//        // 항상 갱신된 값을 가져옴
//        conn2.setDoOutput(true);
//
//        // 6. 통신 응답 코드 확인
//        int res2 = conn2.getResponseCode();
//        System.out.println("RES: " + res2);
//
//        // 7. 추출한 데이터를 BufferdReader 객체로 저장 >> 응답 코드가 올바르지 않을 경우 예외 처리
//        // 7-1). json String 을 저장할 변수 생성
//        String jsonData2 = "";
//
//        if(res >= 200 && res <= 300) {
//
//            // 7-2) BufferdReader 객체 생성
//            // **) https://recordsoflife.tistory.com/306
//            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//
//            // 7-3) 버퍼 리더 객체를 한 줄씩 읽어 json String 변수 result에 저장
//            jsonData += rd.readLine();
//
//            // 7-3) 리더 객체 종료
//            rd.close();
//        } else {
//            // 예외 처리
//            System.out.println("요청 오류 발생");
//        }
//
//        // 10. 저장한 json 데이터 정상 출력 확인
//        System.out.println("jsonData: " + jsonData2);
//
//        // 11. JSONParser 생성 및 최초 파싱 > JSONObject에 저장
//        // https://velog.io/@sujin1018/%EC%8A%A4%ED%94%84%EB%A7%81-json-%ED%8C%8C%EC%8B%B1%ED%95%98%EA%B8%B0
//        JSONObject jsonObject2 = (JSONObject) jsonParser.parse(jsonData2);
//
//        // 12. JSONObject에서 원하는 요소 추출
//        id = jsonObject2.get("id").toString();
//        accountId = jsonObject.get("accountId").toString();
//        puuid = jsonObject.get("puuid").toString();
//        name = jsonObject.get("id").toString();
//        profileIconId = jsonObject.get("profileIconId").toString();
//        summonerLevel = jsonObject.get("summonerLevel").toString();
//
//    }
//}