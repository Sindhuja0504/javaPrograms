package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
//		WebElement element = driver.findElement(By.xpath("//div[@class=\"forgot-password\"]"));
//		JavascriptExecutor execute  = (JavascriptExecutor) driver;
//		execute.executeScript("arguments[0].scrollIntoView();", element);
//		WebElement element1 = driver.findElement(By.xpath("//a[@class=\"forgot-password-link\"]"));
//		execute.executeScript("arguments[0].style.border='8px solid black';", element1);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@name, 'a-3dqcnelnsqu4')]"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();
		}
	

	

}
