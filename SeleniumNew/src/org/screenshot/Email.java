package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Email {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://login.yahoo.com/?");
//		WebElement email = driver.findElement(By.name("username"));
//		email.sendKeys("sindhuja");
//		TakesScreenshot screenshoot = (TakesScreenshot)driver;
//	File f1= email.getScreenshotAs(OutputType.FILE);
//	System.out.println(f1);
//	File f2= new File("./images/email1.png");
//	FileHandler.copy(f1, f2);
		 
		try {
		driver.get("https://login.yahoo.com/?");
		System.out.println("try incorrect element");
		WebElement email = driver.findElement(By.name("usernam"));
		System.out.println("try incorrect element closed");
		email.sendKeys("sindhuja");
		TakesScreenshot screenshoot = (TakesScreenshot)driver;
		File f1= email.getScreenshotAs(OutputType.FILE);
		System.out.println(f1);
		File f2= new File("./images/email2.png");
		FileHandler.copy(f1, f2);
	}
		catch (Exception e) {
			//System.out.println();
			WebElement email = driver.findElement(By.name("username"));
			email.sendKeys("sindhuja");
			TakesScreenshot screenshoot = (TakesScreenshot)driver;
			File f1= email.getScreenshotAs(OutputType.FILE);
			System.out.println(f1);
			File f2= new File("./images/email3.png");
			FileHandler.copy(f1, f2);
			//e.printStackTrace();
		}
		System.out.println("exception");
		//driver.close();
		}
	

}
