package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("https://www.google.com/");
	//driver.get("https://www.google.com/");
	WebElement elements = driver.findElement(By.className("gb_X"));
	elements.click();
	String str =driver.getTitle();
	System.out.println("web title : "+ str);
	System.out.println("web title length " + str.length());
	driver.navigate().back();
	String str1 = driver.getTitle();
	System.out.println(str1);
	int num =str1.length();
	System.out.println("back page length : " + str1);
	driver.navigate().forward();
	String forward =driver.getTitle();
	System.out.println("forward title: " + forward);
	int forwardlenth = forward.length();
	System.out.println("forward lenth title: " + forwardlenth);
	driver.navigate().refresh();
	driver.close();

	}

}
