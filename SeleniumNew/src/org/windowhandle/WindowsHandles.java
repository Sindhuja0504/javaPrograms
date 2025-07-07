package org.windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		String window1 = driver.getWindowHandle();
//		driver.switchTo().window(window1);
	Set<String>	 window2 = driver.getWindowHandles();
	
		for (String windowall : window2) {
			if(!windowall.equals(window1)) {
				
				driver.switchTo().window(windowall);
			WebElement element=	driver.findElement(By.id("sampleHeading"));
				System.out.println("heading: "+ element.getText());
			}
		}
	}
		
	}


