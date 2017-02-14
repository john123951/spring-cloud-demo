package sweet.cloud.eureka.client3.interfaces;

import feign.hystrix.FallbackFactory;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
import sweet.cloud.eureka.client3.domain.AbstractApiResponse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public abstract class GeneralFallbackFactory<T> implements FallbackFactory<T> {

    abstract Class[] getInterfaces();

    @Override
    public T create(Throwable cause) {
        T proxy = (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), getInterfaces(), new ErrorInvocationHandler(cause));
        return proxy;
    }

    class ErrorInvocationHandler implements InvocationHandler {

        private final Throwable cause;

        public ErrorInvocationHandler(Throwable cause) {
            this.cause = cause;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if (AbstractApiResponse.class.isAssignableFrom(method.getReturnType())) {
                Constructor constructor = method.getReturnType().getConstructor();
                AbstractApiResponse response = (AbstractApiResponse) constructor.newInstance();
                response.setMessage(cause.getMessage());

                return response;
            }

            return null;
        }
    }
}
