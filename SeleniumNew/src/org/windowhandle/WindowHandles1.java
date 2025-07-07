package org.windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_up?");
		String parentwindow = driver.getWindowHandle();
		WebElement parentelement = driver.findElement(By.linkText("Privacy Policy"));
		parentelement.click();
		// System.out.println(driver.getTitle());
		System.out.println("im in parent page: " + driver.getTitle());
		System.out.println("parent text: "+parentelement.getText());

		Set<String> childwindow = driver.getWindowHandles();
		
		for (String string : childwindow) {
			if (!string .equals(parentwindow)) {
				driver.switchTo().window(string);
				WebElement childelement = driver.findElement(By.xpath("//a[@title=\"Terms of Service\"]"));
				System.out.println("child text: " + childelement.getText());
				childelement.click();
				System.out.println("im in child page: " + driver.getTitle());
				//driver.close();
				driver.switchTo().window(parentwindow);
			} 
			
			
			

		}
		

	}

}
