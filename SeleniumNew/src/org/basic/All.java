package org.basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		try {
		driver.navigate().to("https://paytm.com/education");
		String parent = driver.getWindowHandle();
		WebElement element = driver.findElement(By.cssSelector("div._21ZT>ul>li:last-child"));
		act.click(element).perform();
		WebElement element1 = driver.findElement(By.xpath("//a[text()=\"Customer care\"]"));
		act.moveToElement(element1).click().perform();
		
		
		Set<String> child =  driver.getWindowHandles();
		List<String> list = new LinkedList<String>(child);
	
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println("done");
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement childelement =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[text()=\"Navigate to ‘Help & Support’\"])[1]")));
		//WebElement childelement =driver.findElement(By.xpath("(//h4[text()=\"Navigate to ‘Help & Support’\"])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", childelement);
	
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}
