package com.java.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HARI\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// implicit
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		// explicit
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(email));

		email.sendKeys("preethi");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123qwe123");

		WebElement login = driver.findElement(By.name("login"));

		// fluent
		Wait fw = new FluentWait(login).withTimeout(15, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Exception.class);

		login.click();

	}

}
