package com.mustaquick;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileOutputStream;
import java.util.List;

//输出查询结果,以Excel输出
@Controller
public class OutputExcel {
    @Autowired
    ExcelProcess excelProcess;
    List outputlist;

    @RequestMapping("getExcel")
    public void getExcel(String rename){
        outputlist=excelProcess.getProcess(rename);
        Workbook workbook = null;
        //FileOutputStream fileOutputStream=new FileOutputStream()


    }
}
