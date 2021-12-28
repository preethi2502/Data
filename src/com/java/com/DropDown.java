package com.java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HARI\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		button.click();
		
		Thread.sleep(50000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		s.selectByValue("25");
		
		///
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
