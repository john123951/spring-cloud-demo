package sweet.cloud.eureka.client3.domain;

import java.io.Serializable;

public abstract class AbstractApiResponse implements Serializable {
    private static final long serialVersionUID = -892588750913473368L;

    private Integer code;       // 返回码
    private String message;     // 返回信息

    public static <T extends AbstractApiResponse> T success(Class<T> clazz) {
        try {
            T response = clazz.newInstance();
            response.setMessage("操作成功");
            response.setCode(200);

            return response;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T extends AbstractApiResponse> T fail(String message, Class<T> clazz) {
        try {
            T response = clazz.newInstance();
            response.setMessage(message);
            response.setCode(500);

            return response;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
