/*WAP to automate https://grotechminds.com/registeration-form/ using DDT concept*/
package data_driven_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A170_DDT_register {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\SeleniumPractice\\DDT\\ddt_sheet.xlsx");
		//step 1 - path for file
	
	Workbook w1=WorkbookFactory.create(f1);
	String f_name=w1.getSheet("registration").getRow(1).getCell(0).getStringCellValue();
	String l_name=w1.getSheet("registration").getRow(1).getCell(1).getStringCellValue();
	String email_id=w1.getSheet("registration").getRow(1).getCell(2).getStringCellValue();
	String phn=NumberToTextConverter.toText(w1.getSheet("registration").getRow(1).getCell(3).getNumericCellValue());
	String gender=w1.getSheet("registration").getRow(1).getCell(4).getStringCellValue();
	String state=w1.getSheet("registration").getRow(1).getCell(5).getStringCellValue();
	String aadhaar=NumberToTextConverter.toText(w1.getSheet("registration").getRow(1).getCell(6).getNumericCellValue());
	String pan=w1.getSheet("registration").getRow(1).getCell(7).getStringCellValue();
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement first_name=driver.findElement(By.id("firstName")); //webelement for firstname
		first_name.sendKeys(f_name);
		WebElement last_name=driver.findElement(By.id("lastName")); //webelement for lastname
		last_name.sendKeys(l_name);
		WebElement email=driver.findElement(By.name("email")); //webelement for email
		email.sendKeys(email_id);
		WebElement contact_num=driver.findElement(By.xpath("//input[@name='phone']")); //xpath for phone
		contact_num.sendKeys(phn);
		
		WebElement gen=driver.findElement(By.id("gender"));
		Select s1=new Select(gen);
		gen.sendKeys(gender);
		
		WebElement state_name=driver.findElement(By.name("state"));
		Select s2=new Select(state_name);
		state_name.sendKeys(state);
		
	
		WebElement aadhaar_num=driver.findElement(By.xpath("//input[@name='aadhaar']")); //xpath for aadhaar
		aadhaar_num.sendKeys(aadhaar);
		WebElement panid=driver.findElement(By.xpath("//input[@name='pan']")); //xpath for pan
		panid.sendKeys(pan);
		
		WebElement terms_chkbox=driver.findElement(By.xpath("//input[@name='terms']")); //xpath for terms checkbox
		terms_chkbox.click();
		
		WebElement register_btn=driver.findElement(By.xpath("//button[@name='Submit']")); //xpath for register button
		register_btn.click();
		
		System.out.println(f_name);
		System.out.println(l_name);
		System.out.println(email_id);
		System.out.println(phn);
		System.out.println(gender);
		System.out.println(state);
		System.out.println(aadhaar);
		System.out.println(pan);
	}
}
