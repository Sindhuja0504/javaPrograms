package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		List<WebElement> list = driver.findElements(By.xpath("//input[@type=\"text\"]"));
		int num =list.size();
		System.out.println("size of webelements: " + num);
		for(int i=0;i<=num;i++) {
			System.out.println(list.get(i).getAttribute("value"));
			//System.out.println(list.get(i).getText("08/04/2025"));
		}

	}

}
