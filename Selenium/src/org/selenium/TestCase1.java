package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.className("gLFyf")).sendKeys("madurai" + Keys.ENTER);
//		driver.navigate().back();
		List<WebElement> count= driver.findElements(By.tagName("a"));
		int num=count.size();
		System.out.println("size of tag: " + num);
		for(int i=0;i<=num;i++) {
			System.out.println(count.get(i).getTagName());
		}
		//driver.close();
		
	}

}
