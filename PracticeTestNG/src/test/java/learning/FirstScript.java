package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {
	@Test
 public void openGoogle() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("selenium" ,Keys.ENTER);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.quit();
}
	@Test
	public void facebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/v2/login");
		Thread.sleep(1000);
		driver.findElement(By.id("accountIdentifier")).sendKeys("sindhuja", Keys.ENTER);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
	}

}
