package sweet.cloud.eureka.server;

import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
