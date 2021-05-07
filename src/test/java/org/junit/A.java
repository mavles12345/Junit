package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static WebDriver driver;

	@BeforeClass
	public static void tc1() {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-workspace\\POMFramework\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@Before
	public void tc2() {
		Date d = new Date();
		System.out.println("Start time for this project " + d);

	}

	@AfterClass
	public static void tc3() {

		driver.quit();

	}

	@After
	public void tc4() {
		Date d = new Date();
		System.out.println("End time for this project " + d);

	}

	@Test
	public void AZTC1() {

		driver.findElement(By.id("email")).sendKeys("jackmavles@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selvamidiotismine");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();

		Assert.assertTrue("Check title of page", title.contains("Facebook"));

	}

	@Test
	public void AZTC01() {
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("jackmavles@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selvamidiotismine");
		driver.findElement(By.name("login")).click();

		String attribute = userName.getAttribute("value");
		Assert.assertEquals("CheckUsername of login page", "jack", attribute);

	}
}
