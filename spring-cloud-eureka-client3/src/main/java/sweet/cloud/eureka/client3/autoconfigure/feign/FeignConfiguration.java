package sweet.cloud.eureka.client3.autoconfigure.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {
    @Bean
    public JsonHeaderRequestInterceptor jsonHeaderRequestInterceptor() {
        return new JsonHeaderRequestInterceptor();
    }

    public class JsonHeaderRequestInterceptor implements RequestInterceptor {

        @Override
        public void apply(RequestTemplate template) {
            if (template.method().compareToIgnoreCase("post") == 0) {
                template.header("Content-Type", "application/json");
            }
        }
    }
}
