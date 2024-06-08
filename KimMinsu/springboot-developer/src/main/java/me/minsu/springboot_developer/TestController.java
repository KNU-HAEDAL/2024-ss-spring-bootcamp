package me.minsu.springboot_developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 라우터 역할을 한다. ( HTTP 요청과 메서드를 연결하는 장치 )
public class TestController {
    @Autowired  // 빈 주입
    TestService testService;

    @GetMapping("/test")    // /test Get 요청이 오면 getAllMembers() 메서드를 실행
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }
}