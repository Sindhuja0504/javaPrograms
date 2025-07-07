package org.baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	
	WebDriver driver;
	
	public WebDriver driverInit() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public void getUrl(String url) {
		driver.get(url);
		
	}
	public void textBox(By by, String input) {
		driver.findElement(by).sendKeys(input);
		
	}
	
	

	

	}


