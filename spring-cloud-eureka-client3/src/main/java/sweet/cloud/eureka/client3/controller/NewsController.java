package sweet.cloud.eureka.client3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sweet.cloud.eureka.client3.domain.user.LoginApiResponse;
import sweet.cloud.eureka.client3.domain.user.LoginRequest;
import sweet.cloud.eureka.client3.interfaces.IUserService;

/**
 * Created by sweet on 17-1-12.
 */
@RestController
public class NewsController {
    final private IUserService userService;

    public NewsController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String home() {
        return "远程调用结果：" + userService.test();
    }

    @RequestMapping("/login")
    public LoginApiResponse login() {
        return userService.login(new LoginRequest());
    }
}
