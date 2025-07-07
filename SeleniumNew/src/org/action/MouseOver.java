package org.action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement menus = driver.findElement(By.xpath("//img[@alt=\"Fashion\"]"));
		act.moveToElement(menus).perform();
		WebElement submenus = driver.findElement(By.linkText("Men Footwear"));
		act.moveToElement(submenus).perform();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	 wait.until(ExpectedConditions.visibilityOf(submenus));
		WebElement submenus1 = driver.findElement(By.linkText("Men's Ethnic Shoes"));
//     WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Men’s Ethnic Shoes")));
		//act.moveToElement(submenus1).click().build().perform();
		act.click(submenus1).perform();
		
		WebElement select =driver.findElement(By.xpath("//h1[@class=\"BUOuZu\"]"));
		act.moveToElement(select).doubleClick().build().perform();
		
	WebElement rightclick=	driver.findElement(By.name("q"));
	act.contextClick(rightclick).perform();

	}

}
