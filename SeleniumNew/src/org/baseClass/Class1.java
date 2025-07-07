package org.baseClass;

import org.openqa.selenium.By;

public class Class1 extends TestScript{

	public static void main(String[] args) {
		Class1 base = new Class1();
		base.driverInit();
		base.getUrl("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		base.textBox(By.id("fullname"), "sindhuja");
		base.textBox(By.id("email"), "sindhuja@gmail.com");
		
		

	}

}
