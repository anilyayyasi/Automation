package chapter_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTExcel2 {
public static void main(String[] args) throws IOException {
//	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("./Selenium.xlsx");
//	p.load(fis);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sht = wb.createSheet("vTiger");
	wb.getSheet(""+sht+"").createRow(0).createCell(0).setCellValue("url");
	wb.getSheet(""+sht+"").createRow(0).createCell(1).setCellValue("Username");
	wb.getSheet(""+sht+"").createRow(0).createCell(2).setCellValue("Password");
	
	
	wb.getSheet(""+sht+"").getRow(0).getCell(0).setCellValue("url");
	
}
}
