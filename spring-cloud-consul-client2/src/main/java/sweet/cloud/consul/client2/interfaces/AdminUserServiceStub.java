package sweet.cloud.consul.client2.interfaces;

import org.springframework.stereotype.Component;

/**
 * Created by sweet on 17-1-12.
 */
@Component
public class AdminUserServiceStub implements IAdminUserService {

    @Override
    public String test() {
        return "failback";
    }
}
