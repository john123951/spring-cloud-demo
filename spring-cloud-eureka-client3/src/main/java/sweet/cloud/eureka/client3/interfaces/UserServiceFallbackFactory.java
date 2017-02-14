package sweet.cloud.eureka.client3.interfaces;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallbackFactory extends GeneralFallbackFactory<IUserService> {
    @Override
    Class[] getInterfaces() {
        return new Class[]{IUserService.class};
    }
}
