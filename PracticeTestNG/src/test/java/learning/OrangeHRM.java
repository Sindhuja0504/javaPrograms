package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	@Test
	public void LaunchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
	 	driver.findElement(By.id("password")).sendKeys("Password123");
	 	driver.findElement(By.id("submit")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[text()='Contact'] [1]")).click();
	 driver.findElement(By.id("wpforms-161-field_0")).sendKeys("sindhuja");
	 driver.findElement(By.id("wpforms-161-field_1")).sendKeys("rsindhuja0405@gmail.com");
	 driver.findElement(By.id("wpforms-161-field_2")).sendKeys("good");
	 driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
	 
	 
	 
		
	}
	@Test
	public void EnterLoginDetails() {
 	
 		
	}


}
