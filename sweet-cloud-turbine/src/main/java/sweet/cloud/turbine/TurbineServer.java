package sweet.cloud.turbine;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "sweet.cloud.eureka")
@EnableAutoConfiguration
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class TurbineServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineServer.class).web(true).run(args);
    }

}