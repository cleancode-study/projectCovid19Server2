package com.example.studySpringboot0002.service.search;

import com.example.studySpringboot0002.entity.search.searchHistory;
import com.example.studySpringboot0002.repository.search.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService{

    private final SearchRepository searchRepository;

    //SearchServiceImpl 클래스는 DB와 연동하기 위해서 SearchRepository JPA(DB연동 드라이버)를 필드로 가짐
    //생성자의 초기값을 통해 필드값을 만듬 (SearchRepository 만들고, SearchServiceImpl를 그 다음에 만드는 순서를 지정하기 위해)
    @Autowired
    public SearchServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    /**
     * 검색내용, IP, 시각을 저장하는 메서드
     */
    @Override
    public void saveSearchHistory(searchHistory input) {
        this.searchRepository.save(input);
    }

    /**
     * 검색 내용에 맞춰 데이터 출력 (예정)
     *
     * @return List
     */
    @Override
    public List<?> getDataTemp() {
        return null;
    }
}
