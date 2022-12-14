package com.example.studySpringboot0002.service.search;

import com.example.studySpringboot0002.entity.search.searchHistory;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SearchService {
    /**
     * 검색내용, IP, 시각을 저장하는 메서드
     */
    void saveSearchHistory(searchHistory input);

    /**
     * 검색 내용에 맞춰 데이터 출력 (예정)
     * @return List
     */
    List<?> getDataTemp();
}
