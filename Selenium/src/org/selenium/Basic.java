package org.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class Basic {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "D:\\Sindhu\\chromedriver-win64\\chromedriver.exe");
//				ChromeDriver driver = new ChromeDriver();
//				driver.get("https://www.google.com/");
				
				System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
			    //EdgeDriver driver1 =  new EdgeDriver();
			    WebDriver driver = new EdgeDriver();
			    //driver1.get("https://www.google.com/");
			    String s = "https://www.google.com/";
			    driver.get(s);
			    System.out.println("Website is opened successfully");
			    driver.manage().window().maximize();
			    //driver.getCurrentUrl();
			    System.out.println(driver.getTitle());
			    //driver.close();
			    //driver.quit();
			    




	}

}
