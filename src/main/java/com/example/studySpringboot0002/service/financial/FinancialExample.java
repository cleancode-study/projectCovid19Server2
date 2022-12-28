package com.example.studySpringboot0002.service.financial;

import com.example.studySpringboot0002.entity.financial.FinancialEntity;

import java.util.HashMap;
import java.util.List;

public interface FinancialExample {

    List<FinancialEntity> FindAllFinancialData();

    void saveFinancialData(FinancialEntity financialEntity);

    String BetwinDayFinancialData(String start_day, String end_day);

};


