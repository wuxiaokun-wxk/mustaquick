package com.mytest;



import java.sql.*;

public class Jdbc1 {
     static final String JDBC_DEIVER="com.mysql.jdbc.Driver";
     static final String DB_URL="jdbc:mysql://localhost:3306/wuxiaokun";
     static final String USER="root";
     static final String PASSWORD="";
     public static void main(String []args)throws Exception {
         Class.forName(JDBC_DEIVER);
         Connection connection =DriverManager.getConnection(DB_URL,USER,PASSWORD);
         Statement statement=connection.createStatement();
         String SQL="select id, name, url FROM websites";
         ResultSet resultSet=statement.executeQuery(SQL);
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



    }
}
