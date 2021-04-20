package com.mytest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gather {
    public static void main(String [] args){
        List<String> list=new ArrayList<>();//创建集合对象
        list.add("a");                      //向集合添加元素
        list.add("b");
        list.add("c");
        int i=(int)(Math.random()*list.size());//获得0-2之间的随机数
        System.out.println(list.get(i));
        list.remove(2);                      //将指定索引位置的元素从集合中移除
        Iterator iterator=list.listIterator();      //遍历集合
        while (iterator.hasNext()){
            String str=(String) iterator.next();
            System.out.println(str);
        }

    }
}
