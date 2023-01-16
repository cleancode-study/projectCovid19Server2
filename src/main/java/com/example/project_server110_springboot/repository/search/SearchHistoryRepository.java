package com.example.project_server110_springboot.repository.search;

import com.example.project_server110_springboot.entity.search.searchHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchHistoryRepository extends JpaRepository<searchHistory, Long> {
}
