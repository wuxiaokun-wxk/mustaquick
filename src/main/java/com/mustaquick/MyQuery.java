package com.mustaquick;

import com.mytest.JDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class MyQuery implements Query {
    @Override
    @RequestMapping(value = "/queryByName",method = RequestMethod.GET)
    //通过名字查询；
    public String queryByName(@RequestParam String name){

        JDBC jdbc=new JDBC();
        jdbc.jdbcForQuery();
        return name;
    };
    @RequestMapping
    @Override
    public String queryByAddress(){
        return null;

    };
}
