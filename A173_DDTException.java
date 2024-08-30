/*WAP on DDT exceptions, and how to convert numeric value to string value*/
package data_driven_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class A173_DDTException {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\SeleniumPractice\\DDT\\ddt_sheet.xlsx");
		//FileInputStream f1=new FileInputStream("C:\\eclipse-workspace\\SeleniumPractice\\DDT\\ddt_sheet.xlsx"); Wrong path gives FileNotFound exception
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		String un=NumberToTextConverter.toText(w1.getSheet("numeric").getRow(1).getCell(0).getNumericCellValue()); //convert numeric value to string value
		//String un=w1.getSheet("numeric").getRow(1).getCell(0).getStringCellValue(); //Throws java.lang.IllegalStateException
		//String un=w1.getSheet("numeric").getRow(2).getCell(0).getStringCellValue(); //gives NullPointer Exception
		String pwd=w1.getSheet("numeric").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(un);
		System.out.println(pwd);
		

	}

}
