package sweet.cloud.eureka.client1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
public class EurekaClient1 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient1.class).web(true).run(args);
    }

}