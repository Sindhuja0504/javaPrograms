package org.action;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.navigate().to("https://disqus.com/publishers/login/?next=https://disqus.com/admin/");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.getTitle();
		
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[contains(@class,'social-login__wrapper')]//button[1])[1]")).click();
		System.out.println("parent: " + driver.getCurrentUrl());
		System.out.println("parent: " + driver.getTitle());
		
		//String childwindow = driver.getWindowHandle();
		
		Set<String> allwindo = driver.getWindowHandles();
		
		//Set<String> child = driver.getWindowHandles();
		for (String string : allwindo) {
			if (!string.equals(parentwindow)) {
				driver.switchTo().window(string);
				System.out.println("child: " + driver.getCurrentUrl());
				System.out.println("child: " + driver.getTitle());
				driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sindhuja@gmail.com");
				driver.switchTo().window(parentwindow);
				
			}
		
		}
		
		//System.out.println(parentwindow);
//		System.out.println(childwindow);
//		System.out.println(allwindo);
	//	System.out.println(driver.getTitle());
		
		
//		driver.switchTo().window(parentwindow);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'social-login__wrapper')]//button[1])[2]"))).click();
		
		//driver.switchTo().window(allwindo);
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[2]"))).click();

	}

}
