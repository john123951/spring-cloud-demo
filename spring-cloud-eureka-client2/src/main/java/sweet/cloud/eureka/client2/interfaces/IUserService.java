package sweet.cloud.eureka.client2.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 调用 eureka-client1 远程服务
 */
@FeignClient(name = "eureka-client1", fallback = UserServiceStub.class)
public interface IUserService {

    @RequestMapping(method = RequestMethod.GET, value = "/user/test")
    String test();
}
