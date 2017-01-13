package sweet.cloud.consul.client2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sweet.cloud.consul.client2.interfaces.IAdminUserService;

/**
 * Created by sweet on 17-1-12.
 */
@RestController
public class NewsController {
    final private IAdminUserService adminUserService;

    public NewsController(IAdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @RequestMapping("/")
    public String home() {
        return "远程调用结果：" + adminUserService.test();
    }
}
