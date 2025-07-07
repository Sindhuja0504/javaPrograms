package org.JS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Highlight {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver lights = new EdgeDriver();
		
		lights.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement high =lights.findElement(By.cssSelector("div>div>ol>li:nth-child(2)"));
		
		JavascriptExecutor convert=(JavascriptExecutor)lights;
		convert.executeScript("arguments[0].style.border='5px solid yellow'",high);
		System.out.println("done");
		
//		driver.get("https://www.gmail.com/");
//		WebElement createAccount = driver.findElement(By.xpath("//span[text()=\"Create account\"]"));
//		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
//		jsExecutor1.executeScript("arguments[0].style.border='5px solid blue'", createAccount);

		
		
		

	}

}
