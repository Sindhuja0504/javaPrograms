package org.basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		// driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hello");
//		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		System.out.println("frame2");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hi");

//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.findElement(By.id("promptBox")).click();
//
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		Alert  alert=	wait.until(ExpectedConditions.alertIsPresent());
//		//=	driver.switchTo().alert();
////		System.out.println(alert.getText());
//	alert.sendKeys("helo");
////		//alert.accept();
//		System.out.println(alert.getText());

//		driver.get("https://www.automationtesting.co.uk/dropdown.html");
//		driver.manage().window().maximize();
//	WebElement car =	driver.findElement(By.id("cars"));
//	Select select = new Select(car);
//	select.selectByIndex(3);
//	List <WebElement>  selectoption =select.getAllSelectedOptions();
//	for(WebElement s :selectoption) {
//		System.out.println(s.getText());
//		
//	}
//	List <WebElement>  options =select.getOptions();
//	for(WebElement s :options) {
//		System.out.println(s.getText());
//		
//	}
//	
//	
//	if(select.isMultiple()) {
//		System.out.println("yes is a multi selector");
//	}
//	else {
//		System.out.println("is not a multi selector");
//		select.selectByVisibleText("Suzuki");
//	}
//	
//	
//	//select.selectByVisibleText("Audi");
	}

}
