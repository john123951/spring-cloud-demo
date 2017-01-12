package sweet.cloud.eureka.client1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
