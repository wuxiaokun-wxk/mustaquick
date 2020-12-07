package com.mustaquick;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.List;
public class ExcelProcessTest {
    @Test
    @Parameters("rename")
    public  void testGetProcess(String rename){
        ExcelProcess excelProcess=new ExcelProcess();
        List list=excelProcess.getProcess(rename);
       Iterator iterable=list.iterator();
       while (iterable.hasNext()){
           System.out.println(iterable.next().toString());
       }


    }

    @Test
    public void test(){
        System.out.println("11111");
    }
}
