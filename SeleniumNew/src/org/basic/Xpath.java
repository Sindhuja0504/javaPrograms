package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://auth.uber.com/v2/");
//		driver.findElement(By.xpath("//input[class=\"be bf bg\" or @type=\"email\"]")).sendKeys("sindhuja@gmail.com");
//		//driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sindhuja@gmail.com"+ Keys.ENTER);
//		//driver.findElement(By.xpath("//button[contains(@id, 'forward-button')]")).click();
//		//driver.findElement(By.xpath("//button[starts-with(@id, 'forward')]")).click();
//		driver.findElement(By.xpath("//div[text()=\"Continue\"]")).click();
		
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("(//div[@class=\"YBLJE4\"])[1]/following::div[1]")).click();
		//driver.findElement(By.xpath("(//div[@class=\"YBLJE4\"])[2]//ancestor::a")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"_38VF5e\"])[2]//child::a[2]")).click();
		
		
//		driver.get("Selenium08.blogspot.com/2019/11/selenium-iframe.html");
//		driver.fin
		

	}

}
