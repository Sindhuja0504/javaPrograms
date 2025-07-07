package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store");//1.tagname.classvalue
		WebElement a =driver.findElement(By.cssSelector("input.zDPmFV"));
		a.click();
		
//		driver.get("https://accounts.google.com/");//2.tagname#idvalue
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("rsinduja@gmail.com");
		
//		driver.get("https://accounts.google.com/signin/v2/usernamerecovery?");//3.tagname#idvalue[attributes="value"]
//		WebElement b=  driver.findElement(By.cssSelector("input#recoveryIdentifierId[jsname=\"YPqjbf\"]"));
//		b.sendKeys("testing@1gmail.com");
		
//		driver.get("https://www.flipkart.com/mobile-apps?");//4.tag.classvalue[attribute="value"]
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("svg.GAbRIN[width=\"14\"]")).click();
//start		//driver.findElement(By.cssSelector("input[title^=\"Search for\"]")).sendKeys("rose" + Keys.ENTER);
//end		//driver.findElement(By.cssSelector("input[title$=\"nd more\"]")).sendKeys("rose" + Keys.ENTER);
//substring		//driver.findElement(By.cssSelector("input[title*=\"products, brands \"]")).sendKeys("rose" + Keys.ENTER);
	
//		driver.get("https://www.zeptonow.com/");
//		//WebElement c= driver.findElement(By.cssSelector("ul>li:nth-child(4)"));
//		WebElement c= driver.findElement(By.cssSelector("ul>li:nth-of-type(2)"));
//		System.out.println("text: " + c.getText());
		

		
//		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.cssSelector("input[type=\"button\"]+[type=\"reset\"]")).click();
		//input[type="button"]+[type="reset"]
		

		



	}

}
