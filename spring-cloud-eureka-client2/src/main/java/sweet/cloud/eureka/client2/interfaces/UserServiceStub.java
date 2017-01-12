package sweet.cloud.eureka.client2.interfaces;

import org.springframework.stereotype.Component;

/**
 * Created by sweet on 17-1-12.
 */
@Component
public class UserServiceStub implements IUserService {

    @Override
    public String test() {
        return "fail";
    }
}
