package org.projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaytmBus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://form-filler.pdffiller.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement frame=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class=\"focus-visible\"]")));
		
		driver.switchTo().frame(frame);
		System.out.println("frame");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title=\"Reject\"]"))).click();
		//driver.findElement(By.xpath("(//div[@class=\"layout-responsive__body\" and @role=\"main\"]//div[@class=\"section-actions\"]//a[text()='Start free trial'])[1]")).click();
	WebElement element1=	driver.findElement(By.xpath("(//a[contains(@class,'button')])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(element1)).click();
		//element1.click();
		//elements.
	System.out.println("done");

	}

}
