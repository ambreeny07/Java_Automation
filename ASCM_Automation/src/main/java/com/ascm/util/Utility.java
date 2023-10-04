package com.ascm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	 public static int randomNo(int min,int max) {
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
  
	return random_int;
	 
 }
	 
	 public static long timeStamp() {
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 System.out.println(timestamp.getTime()); 
		return timestamp.getTime();
		 
	 }
	 public Object[][] readExcel(String fileName,String sheetName) throws IOException{
		 
		 

		    //Create an object of File class to open xlsx file
		 
		    String filePath = System.getProperty("user.dir")+"\\testData";

		    File file =    new File(filePath+"\\"+fileName);
		    
		   // System.out.println(file.getAbsolutePath());

		    //Create an object of FileInputStream class to read excel file

		    FileInputStream inputStream = new FileInputStream(file);

		    Workbook workbook = null;

		    //Find the file extension by splitting file name in substring  and getting only extension name

		    String fileExtensionName = fileName.substring(fileName.indexOf("."));

		    //Check condition if the file is xlsx file

		    if(fileExtensionName.equals(".xlsx")){

		    //If it is xlsx file then create object of XSSFWorkbook class

		    workbook = new XSSFWorkbook(inputStream);

		    }

		    //Check condition if the file is xls file

		    else if(fileExtensionName.equals(".xls")){

		        //If it is xls file then create object of HSSFWorkbook class

		        workbook = new HSSFWorkbook(inputStream);

		    }

		    //Read sheet inside the workbook by its name

		    Sheet sheet = workbook.getSheet(sheetName);

		    //Find number of rows in excel file

		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum()+1;

		    //Create a loop over all the rows of excel file to read it
		    
		    Object[][] dataArr= new Object[rowCount-1 ][sheet.getRow(0).getLastCellNum()];

		    for (int i = 0; i < rowCount; i++) {

		        Row row = sheet.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print Excel data in console

		        	if(i!=0)
		        		dataArr[i-1][j]=row.getCell(j).getStringCellValue();
		            //System.out.print(row.getCell(j).getStringCellValue()+"|| ");

		        }

		     //   System.out.println();
		    } 
		    
		    return dataArr;
		    }  

		    //Main function is calling readExcel function to read data from excel file

		    public  Object[][]  getData(){
		    	
		    	try {
					    Utility objExcelFile = new Utility();
					    //Call read file method of the class to read data
			
					    Object[][] dataArr= objExcelFile.readExcel("procurement_72q_order.xlsx","export20210301-1-1e8zivj");
					    return dataArr;
					    
		    	}catch(Exception e) {}
		    	
		    return null;
		    }
		    
		    public static void main(String...strings) throws IOException{
		    	 Utility objExcelFile = new Utility();
		    	// objExcelFile.readExcel("procurement_72q_order.xlsx", "export20210301-1-1e8zivj");
		    	 Object[][] dataArr = objExcelFile.readExcel("procurement_72q_order.xlsx", "export20210301-1-1e8zivj");
		    	 
		    	 for(int i=0;i<dataArr.length;i++) {
		    		 System.out.println(dataArr[i][0]);
		    	 }
		    }

}
