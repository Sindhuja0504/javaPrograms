package org.july17;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--ignore-certificate-errors");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://apps.uat.mspsandbox.com/pre-registration-ui/#/eng/sign-in");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("nationalId"));
		username.sendKeys("11511511");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Testing@123");
//		
//
//		//Thread.sleep(50);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the captcha");
		String value = scan.next();
		driver.findElement(By.name("captcha")).sendKeys(value);
		driver.findElement(By.xpath("//button[text()= ' Submit ']")).click();
		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

//		WebElement dd = driver.findElement(By.tagName("mat-select"));
//		dd.click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("mat-option")));
//
		WebElement element = driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));
		element.click();
//	System.out.println("done");
//		Select drop = new Select(element);
//		System.out.println("done");
//		drop.selectByVisibleText("MALAWI");

//		
//
//		System.out.println("done");
	}

}
