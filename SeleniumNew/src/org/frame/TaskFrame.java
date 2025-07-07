package org.frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		List<WebElement> tagnames = driver.findElements(By.tagName("iframe"));
		System.out.println("total no.of frames:"  + tagnames.size());
		
		System.out.println("title of the main webpage:" +driver.getTitle());
		System.out.println("current url: " +driver.getCurrentUrl());
		WebElement parent = driver.findElement(By.xpath("//iframe[@name=\"iframe_a\"]"));
	String parenturl = parent.getAttribute("src");
		System.out.println(parenturl);
		driver.switchTo().frame(parent);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("before search");
		WebElement child = driver.findElement(By.xpath("//iframe[@name=\"iframe_b\"]"));
		System.out.println("after search");
		driver.switchTo().frame(child);
		String childurl =child.getAttribute("src");
		driver.get(childurl);
		System.out.println("child url: " + childurl);
		//System.out.println(driver.getCurrentUrl());
		driver.switchTo().defaultContent();
 
	}

}
