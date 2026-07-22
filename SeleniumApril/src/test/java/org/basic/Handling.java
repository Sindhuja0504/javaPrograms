package org.basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Windows.html");
	
		driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]")).click();
		String one = driver.getWindowHandle();
		System.out.println(one);
	Set<String> allwindow =	driver.getWindowHandles();
	System.out.println(allwindow);
driver.findElement(By.cssSelector("#navbarDropdown")).click();
		
	}

}
