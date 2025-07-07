package org.projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusBook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paytm.com/");
		try {

			driver.findElement(By.xpath("(//div[@class=\"qGJDj\"])[2]")).click();
			driver.findElement(By.xpath("(//div[@class=\"JDlTe\"])[2]")).click();
			WebElement element = driver.findElement(By.id("dwebSourceInput"));
			element.click();
			driver.findElement(By.xpath("(//div[@class=\"giZ1z\"])[3]")).click();
			driver.findElement(By.xpath("(//div[text()=\"Chennai\"])[1]")).click();
			driver.findElement(By.xpath("(//div[@class=\"_1EWue\"])[2]")).click();
//			element.sendKeys("Chennai");
	//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			driver.findElement(By.xpath("(//div[@class=\"+2ajg\"])[1]")).click();
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class=\"+2ajg\"])[1]")));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
