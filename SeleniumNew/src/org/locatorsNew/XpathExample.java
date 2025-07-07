package org.locatorsNew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		
//		driver.get("https://www.swiggy.com/order-online-near-me");
//	//WebElement  attributes =	driver.findElement(By.xpath("//div[text()=\"Search for restaurant and food\"]"));
//    WebElement element =	wait.until(ExpectedConditions.visibilityOfElementLocated
//    		(By.xpath("//div[text()=\"Search for restaurant and food\"]")));
//    element.sendKeys("noodles" +Keys.ENTER);
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class=\"_1wE2Px\"]")).click();
		System.out.println("done");
		

	}

}
