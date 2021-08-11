package com.mustaquick;

import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class MyQuery implements Query {
    @Override
    @RequestMapping(value = "/queryByName",method = RequestMethod.GET)
    //通过名字查询；
    public String queryByName(@RequestParam String name){
        return name;
    };
    @RequestMapping
    @Override
    public String queryByAddress(){
        return null;

    };
}
