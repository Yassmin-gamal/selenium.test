package com.google.selenium.test;
 

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Test4 {
	FirefoxDriver driver;

	@BeforeTest
	public void openURL () {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://egyptlaptop.com/");

	}

	@Test
	public void searchForItem() throws InterruptedException {

		driver.findElement(By.id("search_input")).sendKeys("Laptop");
		driver.findElement(By.className("ty-search-magnifier")).click();
		TimeUnit.SECONDS.sleep(1);


		JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("scroll(0, 200);");
		TimeUnit.SECONDS.sleep(1);
		js.executeScript("scroll(200, 600);");
		TimeUnit.SECONDS.sleep(1);
		js.executeScript("scroll(600, 1000);");
		TimeUnit.SECONDS.sleep(1);

	}

	@AfterTest
	public void closeWebsite() {

		driver.quit();
	}
}
