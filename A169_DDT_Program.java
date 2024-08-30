/*WAP to fetch un,pass from excel sheet*/
package data_driven_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A169_DDT_Program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\SeleniumPractice\\DDT\\ddt_sheet.xlsx");
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("unpass").getRow(2).getCell(0).getStringCellValue();
		String pwd=w1.getSheet("unpass").getRow(2).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);

	}

}
