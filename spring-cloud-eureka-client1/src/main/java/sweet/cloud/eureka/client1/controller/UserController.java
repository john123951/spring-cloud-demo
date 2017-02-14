package sweet.cloud.eureka.client1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sweet.cloud.eureka.client1.domain.user.LoginApiResponse;
import sweet.cloud.eureka.client1.domain.user.LoginRequest;

import java.util.Date;

/**
 * Created by sweet on 17-1-12.
 */
@RestController
public class UserController {

    @RequestMapping("/test")
    public String test() {
        return new Date().toString();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginApiResponse login(LoginRequest request) {

        LoginApiResponse response = LoginApiResponse.success(LoginApiResponse.class);

        return response;
    }
}
