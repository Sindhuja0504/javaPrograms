package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
		WebElement a = driver.findElement(By.xpath("//input[@name=\"yellow\"]"));
		a.click();
		if(a.isSelected()) {
		System.out.println("yellow is selected");
		}
		driver.navigate().refresh();
		WebElement b = driver.findElement(By.cssSelector("input[name=\"red\"]"));
		b.click();
		driver.findElement(By.xpath("//input[@name=\"dhanbad\"]")).click();
		driver.close();
		

	}

}
