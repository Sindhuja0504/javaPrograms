package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleA {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.findElement(By.id("alertBox")).click();
//		Alert a = driver.switchTo().alert();
//		System.out.println("text: " +a.getText());
//		a.accept();// simple alert
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
//		Alert a1 = driver.switchTo().alert();
//		System.out.println(a1.getText());// confirmation alert
//		a1.dismiss();
		String text = "Im learning automation";
		driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
		Alert a2 = driver.switchTo().alert();
		a2.sendKeys(text);
//		System.out.println("alert text: " +a2.getText());
//		System.out.println("given text: " +text);//prompt alert
		//a2.accept();
		

	}

}
