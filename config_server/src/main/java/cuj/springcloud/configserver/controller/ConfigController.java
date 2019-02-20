package cuj.springcloud.configserver.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cujamin
 * @Date: 2019/2/20 14:26
 * @Description:
 */

@RestController
@RequestMapping(value = "/v1")
public class ConfigController {
    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String getUser(
            @ApiParam(value = "" , required = true)@RequestParam String id,
            @ApiParam(value = "" , required = true)@RequestParam String username,
            @ApiParam(value = "" ,required = true)@RequestParam String notename){
        return username;
    }
}
