package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelectorEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input[title*=\"for Products\"]")).sendKeys("rose" + Keys.ENTER);

		//		driver.get("https://omayo.blogspot.com/");
//		WebElement  search= driver.findElement(By.cssSelector(".widget-content>ol>li:nth-of-type(3) "));
//		String s=search.getText();
//		System.out.println(s);
	

	}

}
