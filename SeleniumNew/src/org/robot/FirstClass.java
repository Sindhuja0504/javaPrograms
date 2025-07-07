package org.robot;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.get("https://www.google.com/imghp?hl=en-GB&tab=ri&ogbl");
		driver.findElement(By.xpath("//a[@role=\"button\"]"));
		act.contextClick().perform();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		robo.keyPress(KeyEvent.VK_UP);
		robo.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(1000);
		

	}

}
