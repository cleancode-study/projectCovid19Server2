package com.example.studySpringboot0002.service.graph;

import org.springframework.stereotype.Service;

@Service
public class BarGraphServiceImpl implements BarGraphService {
    /**
     * barGraph2 HTML에 전달할 데이터 연산 메서드
     *
     * @return String타입
     */
    @Override
    public String getBarGraph2Data(int wdith) {
        return "wdith:"+Integer.toString(wdith);
    }
}
