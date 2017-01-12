package sweet.cloud.eureka.client2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sweet.cloud.eureka.client2.interfaces.IUserService;

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
}
