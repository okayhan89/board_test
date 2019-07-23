package com.yeobi.daily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeobi.daily.mapper.BoardMapper;

@RestController
public class TestController {
 
	
    @RequestMapping("/test")
    public String test(){
        return "Hello World";
    }
    
    @RequestMapping("/test2")
    public String test2(){
        return "Hello World";
    }
}


