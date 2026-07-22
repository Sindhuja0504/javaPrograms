package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void  main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/dialog-boxes/");
		
		driver.findElement(By.cssSelector("#create-user[id=\"create-user\"]")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class=\"demo-frame\"])[1]")));
	WebElement name =	driver.findElement(By.id("name"));
	name.click();
//	Actions act = new Actions(driver);
//	act.keyUp(Keys.CONTROL);
//	act.sendKeys("A");
//	act.sendKeys("C");
//	WebElement mail =	driver.findElement(By.id("email"));
//	mail.click();
//	act.keyDown(Keys.CONTROL);
//	act.sendKeys("V");
//	act.perform();
		
		
	}

}
