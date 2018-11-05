package hizhangbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hizhangbo
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterApp {

    public static void main(String[] args) {
        SpringApplication.run(RegisterApp.class, args);
    }
}
