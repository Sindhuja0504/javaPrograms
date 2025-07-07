package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement element = driver.findElement(By.id("customers"));
		List<WebElement> rows = element.findElements(By.tagName("tr"));
		List<WebElement> columns = element.findElements(By.tagName("th"));
		List<WebElement> datas = element.findElements(By.tagName("td"));
		System.out.println("rows: " +rows.size());
		System.out.println("columns: " +columns.size());
		System.out.println("datas: " +datas.size());
		
		for (WebElement webElement : datas) {
			System.out.println(webElement.getText());
			
			if(webElement.getText().equals("Amazon")) {
				//System.out.println(webElement.getText());
				System.out.println("amazon is avaliable");
				
			}
			
		}

	}

}
