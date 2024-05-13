package kr.hs.study.UrlMapping.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class HomeController {
    @RequestMapping("/")
//    @GetMapping("/")    // /로 get 접속했을 때 아래 home메서드를 실행해라
    public String home() {
        return "result"; // 타임리프 파일이름
    }
}
