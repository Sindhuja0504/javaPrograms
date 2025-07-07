package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"color\"][1]")).click();
		driver.findElement(By.xpath("//input[@name=\"color\"][4]")).click();
		driver.findElement(By.cssSelector("div>input:nth-of-type(3)")).click();
		

	}

}
