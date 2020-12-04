package com.mustaquick;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.ExcelStyleDateFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@ResponseBody
public class ExcelProcess {
private static String path="C:\\\\Users\\\\wb-wxk505493\\\\Downloads\\\\bug.xlsx";
private static String oss_path="https://117888.oss-cn-hangzhou.aliyuncs.com/xgc_test_cases/bvt_data/280/bug.xlsx";


@RequestMapping("/getProcess")
public List<String> getProcess(String rename){
    String s;
    ExcelProcess excelProcess=new ExcelProcess();
    List <String> list=excelProcess.process(rename,path);
   Iterator iterator=list.iterator();
   while (iterator.hasNext()){
       s=(String) iterator.next();
   }
   return list;

}

@RequestMapping(value = "/process",method = RequestMethod.GET)
    public List<String> process(@RequestParam(required = true) String rdname,
                                @RequestParam(required = true) String pathname) {
        List<String> list = new ArrayList<String>();

        try {
            //"C:\\Users\\wb-wxk505493\\Downloads\\bug.xlsx"
            File file = new File(pathname);
            InputStream inputStream = new FileInputStream(file);
            Workbook workbook = null;
            if (file.getName().endsWith("xlsx")) {
                workbook = new XSSFWorkbook(inputStream);//excel 2007
            } else if (file.getName().endsWith("xls")) {
                workbook = new HSSFWorkbook(inputStream);
            } else {
                throw new Exception("不支持该文件格式");

            }
            Sheet sheet;
            //获取对应sheet页的内容
            for (int sheetnum = 0; sheetnum < workbook.getNumberOfSheets(); sheetnum++) {
                if (workbook.getSheetName(sheetnum).equals("work items")) {
                    sheet = workbook.getSheetAt(sheetnum);
                    //找到某一个条件项对应的是哪一列
                    for (int rownum = 0; rownum < sheet.getRow(0).getLastCellNum(); rownum++) {
                        if (sheet.getRow(0).getCell(rownum).getStringCellValue().equals(rdname)) {
                            //Row row=sheet.getRow(0);
                            //取每一行的目标列加入到list中,并返回
                            for (int allrow = 0; allrow < sheet.getLastRowNum(); allrow++) {
                                String string = sheet.getRow(allrow).getCell(rownum).getStringCellValue();
                                //System.out.println(string);
                                list.add(string);

                            }


                        }

                    }
                }
                if (workbook.getSheetAt(sheetnum) == null) {
                    continue;
                }


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;


    }

    @RequestMapping( "/hello")
    public String HelloWorld(){
    return "Hello World";

    }
}
