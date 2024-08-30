/*Login to facebook using DDT*/
package data.driven.testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class C53_DDT_Facebook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Selenium_Basics\\DDT\\nilima.xlsx");
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String pwd=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(un); //hide username and password with un and pwd variable
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();

	}

}
