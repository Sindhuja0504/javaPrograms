package org.sc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class EmailPositive {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver snap = new EdgeDriver();
		
		snap.navigate().to("https://login.yahoo.com/?");
		snap.manage().window().maximize();
		WebElement email = snap.findElement(By.name("username"));
		email.sendKeys("sindhuja");
		TakesScreenshot screenshoot = (TakesScreenshot)snap;
	File f1= email.getScreenshotAs(OutputType.FILE);
	System.out.println(f1);
	File f2= new File("./screen/email1.png");
	FileHandler.copy(f1, f2);
		 // TakeScreenshot typecast
//		File src = screenshoot.getScreenshotAs(OutputType.FILE);
//		File dest = new File("E:\\File1.png");
//		FileHandler.copy(src, dest) ;
		
	}

}
//WebElement username=driver.findElement(By.id("email"));
//File name1 =username.getScreenshotAs(OutputType.FILE);
//File name2=new File("./Image/mail.png");
//FileHandler.copy(name1, name2);
//
//}
//}
