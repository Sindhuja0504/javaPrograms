package org.basic;

import org.openqa.selenium.By;

public class LearnAlert extends Script{

	public static void main(String[] args) {
		LearnAlert learn = new LearnAlert();
		learn.driverinit();
		learn.getUrl("https://vinothqaacademy.com/alert-and-popup/");
		learn.handlePromptAlert(By.name("promptalertbox1234"), "sindhuja");
		
		
		
	}

}
