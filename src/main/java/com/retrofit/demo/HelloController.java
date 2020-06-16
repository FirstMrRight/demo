package com.retrofit.demo;


import com.retrofit.demo.dto.DevicesStatusDto;
import com.retrofit.demo.utils.HttpSendUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenovo
 */
@RestController
public class HelloController {
    @Autowired
    HttpSendUtil httpSendUtil;
    @GetMapping("/hello")
    public String test(){
        DevicesStatusDto devicesStatusDto = new DevicesStatusDto();
        devicesStatusDto.setDeviceid("1");
        devicesStatusDto.setDeviceip("192.168.2.1");
        devicesStatusDto.setHumidity("50");
        httpSendUtil.sendDevicesStatus(devicesStatusDto);
        System.out.println("test");
        return "test";
    }
}
