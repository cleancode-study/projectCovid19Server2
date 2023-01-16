package com.example.project_server110_springboot.controller.search;

import com.example.project_server110_springboot.entity.search.searchHistory;
import com.example.project_server110_springboot.service.search.SearchService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.example.project_server110_springboot.component.useLocalMethod.useTimeMethod.timeData;

//dispaherServlet이 클라이언트 마다 할당되어서 @Controller에 에스코스
//이후 service 또는 repository 또는 html(model)에 이동을 안내해 줌
@Controller
public class searchController {

    private final SearchService searchService;

    @Autowired
    public searchController(SearchService service) {
        this.searchService = service;
    }

    @GetMapping("/ajax")
    public String ajax() {
        return "ajaxtest";
    }

    @PostMapping("/ajaxtest")
    @ResponseBody
    public String ajaxtest(Model model,
                                      @RequestParam(value = "name")String name,
                                      @RequestParam(value = "location")String location

    ) {
        System.out.println(name);
        System.out.println(location);
        return name;
    }


    // ipv6 타입 return 값을 ipv4로 변경
    // VM Options에 -Djava.net.preferIPv4Stack=true
    @PostMapping("search")
    public String search(
            @RequestParam(value = "search", required = false)String searchData,
            HttpServletRequest httpServletRequest,
            Model model
    ) {
        //httpServletRequest : 클라이언트의 정보를 받는 객체 192.168.48.100 (ipv4) >> (ipv6)
//        System.out.println(httpServletRequest.getRemoteAddr());
        this.searchService.saveSearchHistory(new searchHistory(searchData, httpServletRequest.getRemoteAddr(), timeData()));

        //url출력
        model.addAttribute("searchCSVUrl", this.searchService.findAllSearchCSVUrl());
        //검색기록 출력
        model.addAttribute("searchHistory",this.searchService.findAllSearchHistory());

        return "resultDB/search";
    }

    @PostMapping("onload_test")
    public String onload_test(
    ) {
        return "loading/loading";
    }



}
