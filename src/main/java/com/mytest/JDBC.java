package com.mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class JDBC {
    //JDBC 驱动名；
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    //数据库URL；
    static final String DB_URL="jdbc:mysql://localhost:3306/wuxiaokun";
    //数据库用户名、密码；
    static final String USER="root";
    static final String PASSWORD="";
    public static void main(String[] args) {
        Connection connection;
        Statement statement;


        try{
            //注册JDBC驱动；
            Class.forName(JDBC_DRIVER);
            System.out.println("连接数据库...");
            //连接数据库；
            connection=DriverManager.getConnection(DB_URL,USER,PASSWORD);
            System.out.println(" 实例化Statement对象...");
            //执行查询；
            statement=connection.createStatement();
            String SQL="select id, name, url FROM websites";
            ResultSet resultSet =statement.executeQuery(SQL);

            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String url=resultSet.getString("url");
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");

            }
            resultSet.close();
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();

        };


    }

}
