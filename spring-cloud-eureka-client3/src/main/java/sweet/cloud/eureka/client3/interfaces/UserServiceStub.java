package sweet.cloud.eureka.client3.interfaces;

import org.springframework.stereotype.Component;
import sweet.cloud.eureka.client3.domain.user.LoginApiResponse;
import sweet.cloud.eureka.client3.domain.user.LoginRequest;

/**
 * Created by sweet on 17-1-12.
 */
@Component
public class UserServiceStub implements IUserService {

    @Override
    public String test() {
        return "failback";
    }

    @Override
    public LoginApiResponse login(LoginRequest request) {
        return null;
    }
}
