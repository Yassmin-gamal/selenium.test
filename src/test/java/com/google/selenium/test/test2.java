package com.google.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.EventRegistration;

public class test2 {
	ChromeDriver driver;

	@BeforeTest
	public void openURL () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://egyptlaptop.com/");

	}

 

	@Test(priority=0)
	public void searchForItem() throws InterruptedException {

		driver.findElement(By.id("search_input")).sendKeys("Laptop");
		driver.findElement(By.className("ty-search-magnifier")).click();
		TimeUnit.SECONDS.sleep(1);


	}
	@Test(priority=1)

	public void addItem() throws InterruptedException {
		driver.findElement(By.className("ut2-gl__image")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[contains(@class,'ty-btn__add-to-cart')]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.linkText("Checkout")).click();
		 
	}
	@Test(priority=2)

	public void checkOut() throws InterruptedException {
		EventRegistration searchPageObj1 = new EventRegistration(driver);
		TimeUnit.SECONDS.sleep(1);
		searchPageObj1.setTextInFirstName("YassminGamal");
		TimeUnit.SECONDS.sleep(1);
		searchPageObj1.setTextPhoneNumber("01208258843");
		TimeUnit.SECONDS.sleep(1);
		searchPageObj1.setTextCity("Cairo");
		TimeUnit.SECONDS.sleep(1);
		searchPageObj1.setTextAddress("Cairo");
		TimeUnit.SECONDS.sleep(1);
		searchPageObj1.setTextZipCode("11887");
		TimeUnit.SECONDS.sleep(1);
		searchPageObj1.accepttheTermsandConditions();
		TimeUnit.SECONDS.sleep(1);
		searchPageObj1.checkOut();
		TimeUnit.SECONDS.sleep(2);
	}


	@AfterTest

	public void closeWebsite() {

		driver.quit();
	}


}
