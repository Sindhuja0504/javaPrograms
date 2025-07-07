package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
	WebElement element=	driver.findElement(By.id("fullname"));
	element.sendKeys("sindhuja");
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	//driver.findElement(By.id("email")).
	action.sendKeys(Keys.TAB);
	action.perform();

	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	
	

	}

}
