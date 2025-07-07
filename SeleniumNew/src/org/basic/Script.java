package org.basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script {
	WebDriver driver;
	public WebDriver driverinit() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public void getUrl(String url) {
		driver.get(url);
		
	}

	  public void handlePromptAlert(By by, String text) {
	        WebElement ele = driver.findElement(by);
	        ele.click();

	        // Wait for the alert
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.alertIsPresent());

	        // Handle the alert
	        Alert alert = driver.switchTo().alert();
	        alert.sendKeys(text);
	        System.out.println("Alert text: " + alert.getText());
//	        alert.accept();
//
//	        // Wait for the result element and print its value
//	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("promptreturn")));
//	        String result = driver.findElement(By.id("promptreturn")).getText();
//	        System.out.println("Prompt result: " + result);
	    }
		
}
