package com.mytest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
    public static void main(String args[]){
        //实例化集合类对象
        Collection<String> list=new ArrayList<>();
        //向集合添加数据
        list.add("wuxiaokun");
        list.add("wuyuechen");
        list.add("chenyuanyi");
        //创建迭代器
        Iterator iterator=list.iterator();
        //判断是否有下一个元素
        while (iterator.hasNext()){
            //获取集合中的元素
            String str=(String) iterator.next();
            System.out.println(str);

        }

    }
}

