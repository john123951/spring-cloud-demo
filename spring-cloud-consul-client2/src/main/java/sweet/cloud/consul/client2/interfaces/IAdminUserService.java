package sweet.cloud.consul.client2.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 调用 eureka-client1 远程服务
 */
@FeignClient(name = "consul-client1", fallback = AdminUserServiceStub.class)
public interface IAdminUserService {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();
}
