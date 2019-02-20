package cuj.springcloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 18:16
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigServerAppication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAppication.class);
    }

}
