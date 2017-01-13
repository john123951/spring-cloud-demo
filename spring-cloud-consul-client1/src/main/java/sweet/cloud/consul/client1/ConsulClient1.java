package sweet.cloud.consul.client1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClient1 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulClient1.class).web(true).run(args);
    }

}