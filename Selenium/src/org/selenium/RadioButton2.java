package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
		WebElement a= driver.findElement(By.cssSelector("input[name=\"green\"]"));
		if(a.isEnabled() && a.isDisplayed()) {
			if(!(a.isSelected())) {
				System.out.println("Green is not selected");
				a.click();
			}
		}else {
		System.out.println("not enabled");
		}
	}
}
