package org.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class List {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bocw.bihar.gov.in/ApplicationReport.aspx");
//		WebElement element = driver.findElement(By.xpath("//select[@name=\"ddldistrict\"]"));
//		element.click();
//		Select select = new Select(element);
//		select.selectByVisibleText(" Araria");
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement elementwait =	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name=\"ddlMunispalty\"]")));
//		//WebElement element1 = driver.findElement(By.xpath("//select[@name=\"ddlMunispalty\"]"));
//		System.out.println("element find");
//		Select select1 = new Select(elementwait);
//		select1.selectByValue("8979");
		
		WebElement District = driver.findElement(By.xpath("//select[@name=\"ddldistrict\" and @id=\"ddldistrict\"]"));
		System.out.println(District.getText());
		
		Select District1 = new Select(District);
		District1.selectByVisibleText("Bhojpur");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='ddlMunispalty']//option[@value='8999']")));

		WebElement MunicipalCorporation = driver.findElement(By.xpath("//select[@name='ddlMunispalty']"));
		Select MunicipalCorporation1 = new Select(MunicipalCorporation);
		MunicipalCorporation1.selectByValue("8999");
		
		try {
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name=\"ddlWardNo\"]//option[@value=\"9628\"]")));
		
		WebElement WardNo = driver.findElement(By.xpath("//select[@name=\"ddlWardNo\"]"));
		Select WardNo1 = new Select(WardNo);
		System.out.println(WardNo.getText());
		WardNo1.selectByValue("9628");
		
		System.out.println(WardNo1.getAllSelectedOptions());
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
