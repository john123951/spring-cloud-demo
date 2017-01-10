package sweet.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Value("${info.foo:}")
    private String foo;

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/foo")
    public String foo() {
        return foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
