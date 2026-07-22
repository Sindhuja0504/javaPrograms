package org.basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table {
	
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement e =	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"))));
		 e.sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	WebElement table =	driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]"));
	List<WebElement> row =driver.findElements(By.tagName("tr"));
	for(WebElement r : row) {
		System.out.println(r);
	}
	}

}
