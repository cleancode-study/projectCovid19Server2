package com.example.project_server110_springboot.service.financial;

import com.example.project_server110_springboot.entity.financial.FinancialEntity;

import java.util.List;

public interface FinancialExample {

    List<FinancialEntity> FindAllFinancialData();

    void saveFinancialData(FinancialEntity financialEntity);

    String BetwinDayFinancialData(String start_day, String end_day);

};


