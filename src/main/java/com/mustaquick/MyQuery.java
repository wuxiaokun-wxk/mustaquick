package com.mustaquick;

import com.mytest.JDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

@RestController
@ResponseBody
public class MyQuery implements Query {
    @Override
    @RequestMapping(value = "/queryByName",method = RequestMethod.GET)
    //通过名字查询；
    public ResultSet queryByName(@RequestParam String name){

        JDBC jdbc=new JDBC();
        ResultSet resultSet=jdbc.queryByName();
        return resultSet;
    };
    @RequestMapping
    @Override
    public String queryByAddress(){
        return null;

    };
}
