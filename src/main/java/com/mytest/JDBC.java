package com.mytest;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
@Author wuxiaokun
@Date 2021.7.16

 */
public class JDBC {
    //JDBC 驱动名；
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    //数据库URL；
    static final String DB_URL="jdbc:mysql://localhost:3306/wuxiaokun";
    //数据库用户名、密码；
    static final String USER="root";
    static final String PASSWORD="";
    static Log log= LogFactory.getLog(JDBC.class);

    public static void main(String[] args) {
        Connection connection;
        Statement statement;


        try{
            //注册JDBC驱动；
            Class.forName(JDBC_DRIVER);
            //System.out.println("连接数据库...");
            //连接数据库；
            log.info("链接数据库");
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

JDBC jdbc=new JDBC();
Class aClass=jdbc.getClass();

log.info(aClass.getName());
    }
    public ResultSet queryByName(){
        Connection connection;
        Statement statement;


        try{
            //注册JDBC驱动；
            Class.forName(JDBC_DRIVER);
            //System.out.println("连接数据库...");
            //连接数据库；
            log.info("链接数据库");
            connection=DriverManager.getConnection(DB_URL,USER,PASSWORD);
            System.out.println(" 实例化Statement对象...");
            //执行查询；
            statement=connection.createStatement();
            String SQL="select id, name, url FROM websites";
            ResultSet resultSet =statement.executeQuery(SQL);

           /* while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String url=resultSet.getString("url");
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");

            }*/
            return resultSet;

            //resultSet.close();
            //statement.close();
            //connection.close();

        }catch (Exception e){
            e.printStackTrace();

        };

    return null;

}



}
