package com.mustaquick;

import org.testng.annotations.Test;
import sun.net.www.http.HttpClient;

import java.util.ArrayList;
import java.util.List;

public class ExcelProcessTest {
    @Test
    public void testGetProcess(String rename){
        ExcelProcess excelProcess=new ExcelProcess();
        List<String> list=excelProcess.getProcess(rename);

    }
}
