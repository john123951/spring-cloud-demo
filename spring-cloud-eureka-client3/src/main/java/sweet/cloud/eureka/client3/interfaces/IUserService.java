package sweet.cloud.eureka.client3.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sweet.cloud.eureka.client3.domain.user.LoginApiResponse;
import sweet.cloud.eureka.client3.domain.user.LoginRequest;

/**
 * 调用 eureka-client1 远程服务
 */
//@FeignClient(name = "eureka-client1", fallback = UserServiceStub.class)
@FeignClient(name = "eureka-client1", fallbackFactory = UserServiceFallbackFactory.class)
public interface IUserService {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    LoginApiResponse login(LoginRequest request);
}
