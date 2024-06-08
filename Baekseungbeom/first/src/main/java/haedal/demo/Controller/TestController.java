package haedal.demo.Controller;

import haedal.demo.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public UserInfo hello()
    {
        UserInfo userInfo = new UserInfo("haedal","asdf@naver.com");
        return userInfo;

    }


}
