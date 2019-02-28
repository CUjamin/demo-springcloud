package cuj.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 18:16
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
//@EnableAutoConfiguration
//@EnableDiscoveryClient
//@EnableConfigServer
public class EurekaServerAppication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAppication.class);
    }

}
