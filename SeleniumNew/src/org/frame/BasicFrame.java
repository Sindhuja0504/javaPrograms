package org.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://app.intercom.com/admins/sign_up?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	WebElement element =	driver.findElement(By.xpath("//iframe[@title=\"reCAPTCHA\"]"));
	System.out.println("1");
	driver.switchTo().frame(1);
		System.out.println("2");
		*/
		
		driver.get("https://letcode.in/frame");
	 WebElement element=	driver.findElement(By.xpath("//iframe[@src=\"frameui\"]"));
		driver.switchTo().frame(element);
		//driver.switchTo().frame(2);
		driver.findElement(By.name("fname")).sendKeys("sindhuja" );
		WebElement element1 = driver.findElement(By.xpath("//iframe[@src=\"innerframe\"]"));
		//driver.switchTo().frame("innerframe");
		driver.switchTo().frame(element1);
		
		driver.findElement(By.name("email")).sendKeys("sindhuja");
		driver.switchTo().parentFrame();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.
		driver.findElement(By.name("lname")).sendKeys("rsindhu@gmail.com");
		//driver.
		driver.switchTo().frame(element1);
		driver.findElement(By.name("email")).sendKeys("@gmail.com");
		

	}

}
