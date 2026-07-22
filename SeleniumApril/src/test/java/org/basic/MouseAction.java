package org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class=\"demo-frame\"])[1]")));
		System.out.println("inframe");
		Actions act = new Actions(driver);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement drag	=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id=\"gallery\"]/child::li[1]")));
		WebElement drag = driver.findElement(By.xpath("//ul[@id=\"gallery\"]/child::li[1]"));
		WebElement drop = driver.findElement(By.cssSelector("#trash[id=\"trash\"]"));

		// act.dragAndDropBy(drag, 200, 0).perform();
		// act.dragAndDrop(drag, drop).perform();
		act.clickAndHold(drag).moveToElement(drop).release().perform();

		System.out.println("done");

//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		Actions act = new Actions(driver);
//		//WebElement  click1=	driver.findElement(By.id("btn1"));
//		//act.click(click1).perform();
////		WebElement mousehover =	driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
////		act.moveToElement(mousehover).perform();
////		System.out.println("done");
////		FluentWait<WebDriver> wait = new FluentWait<>(driver)
////				.withTimeout(Duration.ofSeconds(20))
////				.pollingEvery(Duration.ofSeconds(2));
////		WebElement web=		driver.findElement(By.xpath("//a[text()='CSS Selectors Practice']"));
////		act.click(web).perform();
//			//	act.contextClick().perform();
//		
	}

}
