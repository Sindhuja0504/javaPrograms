package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		Actions mouse = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));

//		WebElement drop = driver.findElement(By.id("droppable"));
//		mouse.dragAndDrop(drag, drop).perform();
		int x = drag.getLocation().getX();
		int y = drag.getLocation().getY();
		mouse.dragAndDropBy(drag, 200, 100).perform();

	}

}
