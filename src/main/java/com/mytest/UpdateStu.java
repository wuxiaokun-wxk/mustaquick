package com.mytest;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStu {
    public static void main(String [] args){
      Map<String,String> map=new HashMap<>();
      map.put("351","wuxiaokun");
      map.put("512","chenyuanyi");
      map.put("853","xiaoming");
      map.put("125","xiaowagn");
        Set<String> set=map.keySet();
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            String key=(String) iterator.next();
            System.out.println(key);

            System.out.println(map.get(key));
        }
    }

}
