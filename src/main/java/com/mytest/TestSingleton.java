package com.mytest;
class Singleton{
     private static Singleton singleton=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
//        if (singleton==null){
//            singleton=new Singleton();
//
//        }
        return singleton;

    }
}

public class TestSingleton {
    public static void main(String[] args) {
//        Singleton s=new Singleton();
//        Singleton s1=new Singleton();
//        Singleton s2=new Singleton();
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();


        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }


}
