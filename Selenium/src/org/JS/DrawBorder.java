package org.JS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class DrawBorder {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1001\\Downloads\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://omayo.blogspot.com/");
		String s= "document.getElementById('drop1').style.border='5px solid blue'";
		//String s= "document.getElementById('drop1').style.padding='5px solid blue'";
		JavascriptExecutor  js =(JavascriptExecutor )d;
		js.executeScript(s);
		System.out.println("done");
		
		
		

	}

}
