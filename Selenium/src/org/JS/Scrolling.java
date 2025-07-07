package org.JS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/grocery-supermart-store?");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,400)", ""); //scroll
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
//		driver.get("https://www.flipkart.com/mobile-phones-store?");
//		WebElement elements =driver.findElement(By.linkText("Exchange offers on Mobile Phone"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()", elements);//visible text

	}

}
