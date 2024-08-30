/*WAP to login to amazon using DDT concept*/
package data_driven_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A172_DDT_Amazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\SeleniumPractice\\DDT\\ddt_sheet.xlsx");
		//step 1 - path for file
		
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("amazon").getRow(1).getCell(0).getStringCellValue();
		String pwd=w1.getSheet("amazon").getRow(1).getCell(1).getStringCellValue();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();	
		WebElement email=driver.findElement(By.xpath("(//input)[7]")); //xpath for email
		email.sendKeys(un);

		WebElement cont=driver.findElement(By.xpath("(//input)[10]"));//xpath for continue button
		cont.click();

		WebElement password=driver.findElement(By.xpath("(//input)[9]"));//xpath for password
		password.sendKeys(pwd);
			
		WebElement signin=	driver.findElement(By.xpath("(//input)[10]"));//xpath for signin
		signin.click();	
		
		System.out.println(un);
		System.out.println(pwd);

	}

}
