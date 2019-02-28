package cuj.springcloud.configserver.controller;

import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j;
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
@Log4j
public class ConfigController {
    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String getUser(
            @ApiParam(value = "" , required = true)@RequestParam String id,
            @ApiParam(value = "" , required = false)@RequestParam String username,
            @ApiParam(value = "" ,required = false)@RequestParam String notename){
        log.info("id:"+id+";username:"+username+";notename:"+notename);
        return username;
    }
}
