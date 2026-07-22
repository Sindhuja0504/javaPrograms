package org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		driver.findElement(By.id("btn1")).click();
//		System.out.println("clicked1");
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement textbox1=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
//		//driver.findElement(By.id("txt1")).sendKeys("hello");
//	textbox1.sendKeys("hello");
		
		
		driver.findElement(By.id("btn2")).click();
		System.out.println("clicked2");
		//WebElement  element =	driver.findElement(By.id("txt2"));
		WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement textbox2 =	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		textbox2.sendKeys("hi");
	
	}

}
