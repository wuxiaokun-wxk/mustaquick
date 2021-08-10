package com.mustaquick;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class SpringBootTest {

    @RequestMapping( "/helloworld")
    public String helloworld(){
        //System.out.println("Hello World");
        return "hello world";
    }

}
