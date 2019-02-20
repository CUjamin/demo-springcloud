package cuj.springcloud.configclient.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2019/2/20 18:12
 * @Description:
 */
@RestController
@Log4j
public class DataController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String home(){
        List<String> serviceList =discoveryClient.getServices();
        for(String serviceId :serviceList){
            List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances(serviceId);
            log.info("service:"+serviceId);
            for (ServiceInstance serviceInstance:serviceInstanceList){
                log.info("uri:"+serviceInstance.getUri());
            }
        }
        return "hello spring";
    }

}
