package cuj.springcloud.configclient.controller;

import lombok.extern.log4j.Log4j;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2019/2/20 18:12
 * @Description:
 */
@RestController
@Log4j
public class DataController {

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Value("${nickName}")
    private String nickName;

    private static String userUrl = "/v1/user";

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String home(){
        log.info("nickName:"+nickName);
//        List<String> serviceList =discoveryClient.getServices();
//
//        for(String serviceId :serviceList){
//            List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances(serviceId);
//            log.info("serviceId:"+serviceId);
//            for (ServiceInstance serviceInstance:serviceInstanceList){
//                String url = serviceInstance.getUri()+userUrl+"?user=123";
//                log.info("url:"+url);
//            }
//        }
        return "hello spring-nickName"+nickName;
    }

}
