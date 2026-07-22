package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodsWE {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	//boolean textbox=	driver.findElement(By.name("Email")).isDisplayed();
	WebElement checkbox=	driver.findElement(By.name("Email"));
	checkbox.sendKeys("rsindhuja0405@gmail.com");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,500)", "");
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
	
	//System.out.println(checkbox);
		//.sendKeys("rsindhuja0405@gmail.com");
//	WebElement password =		driver.findElement(By.id("Password"));
//			password.sendKeys("Test");
//			Actions act = new Actions(driver);
//			act.keyDown(Keys.CONTROL)
//			.sendKeys("A")
//			.keyUp(Keys.CONTROL)
//			.perform();
			
//		WebElement checkbox =		driver.findElement(By.id("RememberMe"));
//	System.out.println(checkbox);
//	checkbox.click();
	
		
//		WebElement  button=		driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
//		//.isEnabled();
//		if(button.isEnabled()) {
//			System.out.println("enabled");
//			button.click();
//			
//		}
//		else {
//			System.out.println("not enabled");
//		}
		
	}

}
