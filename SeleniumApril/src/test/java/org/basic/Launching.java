package org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launching {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// WebElement username =
		// driver.findElement(By.xpath("//input[@name=\"username\"]"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
	String value=	username.getAttribute("value");
	System.out.println(value);
		WebElement password = driver.findElement(By.name("password"));
		driver.findElement(By.xpath("//button[contains(@type,\"submit\")]")).click();
		password.sendKeys("admin123");
//	String text=	driver.findElement(By.tagName("button")).getText();
//	System.out.println(text);
		WebDriverWait board = new WebDriverWait(driver, Duration.ofSeconds(10));
		board.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card\"][1]"))).click();
		System.out.println("board");
		//board.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leave']"))).click();
		//driver.findElement(By.xpath("//span[text()='Leave']")).click();
		
		// driver.close();
	}

}
