package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.findElement(By.xpath("//label[text()=\"Postpaid\"]")).click();

	}

}
