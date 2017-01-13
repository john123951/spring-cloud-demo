package sweet.cloud.consul.client1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Consul 通过检测/health判断在线状态，不在线远程调用将失败
 * 自定义以下配置修改检测地址：
 * spring.cloud.consul.discovery.healthCheckPath
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @RequestMapping("ping")
    public Date home() {
        return new Date();
    }
}
