package org.practice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;

	public class Program1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://login.coinbase.com/signin?");
			WebElement a = driver.findElement(By.xpath("//span[text()=\"Continue\"]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", a);

		}

	}
