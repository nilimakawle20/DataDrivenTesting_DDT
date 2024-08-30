/*Procedure for fetching data from excel sheet*/
package data.driven.testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;    //everything should be from ss.usermodel.sheet
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C53_DDTProgram {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Selenium_Basics\\DDT\\nilima.xlsx");
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("login");
		Row r1=s1.getRow(0);
		Cell c1=r1.getCell(0);
		String un=c1.getStringCellValue();
		System.out.println(un);            //this is for username
		

	    Sheet s2=w1.getSheet("login");
		Row r2=s1.getRow(0);
		Cell c2=r2.getCell(1);
		String pwd=c2.getStringCellValue();
		System.out.println(pwd);           //this is for password
	}

}
