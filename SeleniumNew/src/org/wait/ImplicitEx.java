package org.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://letcode.in/waits");
//		driver.findElement(By.id("accept")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		Alert a =wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(a.getText());
//		a.accept();
		
		WebDriverWait visibletext = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		WebElement element = driver.findElement(By.xpath("//button[@onclick=\"timedText()\"]"));
		element.click();
	WebElement	visible =visibletext.until(ExpectedConditions.visibilityOf(element));
	boolean text =visible.isDisplayed();
	if(text) {
		System.out.println("text is visibled");
	}
	else {
		System.out.println("text not visibled");
	}
		
		

	}

}
