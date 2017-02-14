package sweet.cloud.eureka.client3.domain.user;

import sweet.cloud.eureka.client3.domain.AbstractRequest;

public class LoginRequest extends AbstractRequest {
    private static final long serialVersionUID = 936252045315326614L;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}