package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://account.viber.com/en/login/");
		driver.findElement(By.className("phone")).sendKeys("2345678191" +Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("testing@123" + Keys.ENTER);
		
		
		
	}

}
