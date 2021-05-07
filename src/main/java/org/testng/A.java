package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {

	WebDriver driver;

	@BeforeClass
	private void browerlaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-workspace\\POMFramework\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println("Start time for this project " + d);

	}

	@Test
	private void tc1() {
		driver.findElement(By.id("email")).sendKeys("jackmavles@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selvamidiotismine");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();

	}

	@Test
	private void tc2() {
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("jackmavles@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selvamidiotismine");
		driver.findElement(By.name("login")).click();

		String attribute = userName.getAttribute("value");

	}

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println("End time for this project " + d);

	}

	@AfterClass
	private void browserclose() {
		driver.quit();

	}

}
