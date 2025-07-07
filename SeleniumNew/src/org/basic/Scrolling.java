package org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://en.wikipedia.org/wiki/English_Wikipedia");
		driver.navigate().to("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_menu_hor_scroll");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		//WebElement elem = driver.findElement(By.xpath("//figure[@typeof=\"mw:File/Thumb\"][7]//child::a"));

		System.out.println("done");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy(100,0)");
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
		//js.executeScript("arguments[0].scrollIntoView()", elem);

		

	}

}
