package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver =  new EdgeDriver();
		driver.get("https://www.google.com/");
		String str =driver.getTitle();
		System.out.println(str);
		String a ="Google";
		if(str.equals("Google")) {
			System.out.println("title verified: "+str);
			
		}
		//driver.close();
		
		System.out.println("t" +a.valueOf(a));

	}

}
