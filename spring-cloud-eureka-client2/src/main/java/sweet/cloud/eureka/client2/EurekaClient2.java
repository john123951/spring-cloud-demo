package sweet.cloud.eureka.client2;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "sweet.cloud.eureka")
@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients
public class EurekaClient2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient2.class).web(true).run(args);
    }

}
