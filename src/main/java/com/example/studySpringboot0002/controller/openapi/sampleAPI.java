package com.example.studySpringboot0002.controller.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * openapi : data.go.kr / kakao develop site의 api를 관리하는 controller
 */
@Controller
public class sampleAPI {

    /**
     * api 테스트를 위한 메서드로 코로나 공지사항 데이터를 받는 api 작업 완료
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping("sampleAPI")
    public String sampleAPI(Model model) throws Exception {
        // 1. URL을 만들기 위한 StringBuilder : 메모리 주소가 1개인 String 변수
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew"); /*URL*/
        // 2. 오픈 API의 요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        // append() : urlBuilder 변수에 연결된 heap메모리 주소에 String문자열을 지속적으로 추가하는 메서드
        //URLEncoder.encode() : UTF-8 인코딩 형식으로 문자열을 저장
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=Io8hL7HgmY2rteFGVOkVQhoA2YFq27cZN3HFt8GS3WqAB1yGjhq3puzw%2FldMoe8YRmmQrDbU5KA4a1vLpaYhjw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*XML 또는 JSON*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("cond[country_nm::EQ]","UTF-8") + "=" + URLEncoder.encode("한국", "UTF-8")); /*한글 국가명*/
        urlBuilder.append("&" + URLEncoder.encode("cond[country_iso_alp2::EQ]","UTF-8") + "=" + URLEncoder.encode("KR", "UTF-8")); /*ISO 2자리코드*/
        String codetest = "http://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew?serviceKey=Io8hL7HgmY2rteFGVOkVQhoA2YFq27cZN3HFt8GS3WqAB1yGjhq3puzw%2FldMoe8YRmmQrDbU5KA4a1vLpaYhjw%3D%3D&stdt=20";
        // 3. URL 객체 생성.
        URL url = new URL(urlBuilder.toString());
        // 4. 요청하고자 하는 URL과 통신하기 위한 Connection 객체 생성.
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 5. 통신을 위한 메소드 SET : HttpURLConnection 타입에 setRequestMethod() 메서드를 사용하여 POST, GET방식 선택 가능
        conn.setRequestMethod("GET");
        // 6. 통신을 위한 Content-type SET. : HTTP 메타데이터로 포맷 형식이 json방식이다 라고 선언
        conn.setRequestProperty("Content-type", "application/json");
        // 7. 통신 응답 코드 확인.
        System.out.println("Response code: " + conn.getResponseCode());
        // 8. 전달받은 데이터를 BufferedReader 객체로 저장.
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "UTF-8"));
        }
        // 9. 저장된 데이터를 라인별로 읽어 StringBuilder 객체로 저장.
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        // 10. 객체 해제.
        rd.close();
        conn.disconnect();
        // 11. 전달받은 데이터 확인.
        System.out.println(sb.toString());
        model.addAttribute("result", sb.toString());
        return "covid/covid";
    }

}
