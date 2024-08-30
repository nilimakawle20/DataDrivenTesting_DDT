/*WAP on what exceptions come when you try to fetch numeric value-GIVES ERROR java.lang.IllegalStateException*/
package data.driven.testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class C53_DDT_Exception {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Selenium_Basics\\DDT\\nilima.xlsx");
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		String un=NumberToTextConverter.toText(w1.getSheet("login2").getRow(0).getCell(0).getNumericCellValue());
		//String un=w1.getSheet("login2").getRow(0).getCell(0).getStringCellValue();
		//String pwd=w1.getSheet("login2").getRow(0).getCell(1).getStringCellValue();
		System.out.println(un);
		//System.out.println(pwd);

	}

}
