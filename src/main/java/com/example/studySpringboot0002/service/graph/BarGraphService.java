package com.example.studySpringboot0002.service.graph;

import org.springframework.stereotype.Service;

/**
 * barGraph 관련한 연산 메서드 모음집
 */
public interface BarGraphService {

    /**
     * barGraph2 HTML에 전달할 데이터 연산 메서드
     * @return String타입
     */
    String getBarGraph2Data();
}
