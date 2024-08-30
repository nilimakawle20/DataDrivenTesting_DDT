/*Procedure for fetching data from excel sheet - Easy way*/
package data.driven.testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C53_DDT_Easyway {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream(" ");
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String pwd=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);
	}
}
