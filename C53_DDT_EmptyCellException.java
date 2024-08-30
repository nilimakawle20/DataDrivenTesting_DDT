/*What exception come when you fetch empty cell- gives error java.lang.NullPointerException:*/
package data.driven.testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C53_DDT_EmptyCellException {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Selenium_Basics\\DDT\\nilima.xlsx");
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("login").getRow(2).getCell(2).getStringCellValue();//CHANGE CELL VALUE
		String pwd=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);
		
	}

}
