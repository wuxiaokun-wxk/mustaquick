package com.mustaquick;

import com.mytest.JDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

@RestController
@ResponseBody
public class MyQuery implements Query  {
    @Override
    @RequestMapping(value = "/queryByName",method = RequestMethod.GET)
    //通过名字查询；
    public void queryByName(@RequestParam String name){

        JDBC jdbc=new JDBC();
        ResultSet resultSet=jdbc.queryByName();
        try{
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name1=resultSet.getString("name");
                String url=resultSet.getString("url");
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name1);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
                System.out.println("运行了这行代码");

            }

        }catch (Exception exception){
            exception.printStackTrace();

        }

    };
    @RequestMapping
    @Override
    public String queryByAddress(){
        return null;

    };
}
