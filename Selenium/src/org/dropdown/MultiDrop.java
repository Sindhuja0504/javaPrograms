package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");

//		driver.get("https://www.python.org");
		WebElement news= driver.findElement(By.cssSelector("li#events"));
		news.click();
	//	driver.get("https://www.flipkart.com/");
		//driver.findElement(By.cssSelector("input.Pke_EE")).click();
//		driver.get("https://www.flipkart.com/account/login?ret=/");
//		
//		driver.findElement(By.cssSelector("input.r4vIwl BV+Dqf[type=\"text\"]")).sendKeys("rsindhuja@gmail.com");
//	   



	}

}
