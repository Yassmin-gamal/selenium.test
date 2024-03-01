package com.google.selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {
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
           public void chooseItem() throws InterruptedException {
		
		driver.findElement(By.className("ut2-gl__image")).click();
		System.out.println(driver.getTitle());
		TimeUnit.SECONDS.sleep(1);
		
		}
	@Test(priority=2)
           public void checkIncrementANdDecrement() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.println(driver.getTitle());
		 
		
		driver.findElement(By.xpath("//*[contains(@class,'ty-value-changer__increase')]")).click();
		TimeUnit.SECONDS.sleep(1);
		Assert.assertEquals( "2",driver.findElement(By.xpath("//*[contains(@class,'ty-value-changer__input')]")).getAttribute("value"));
		driver.findElement(By.xpath("//*[contains(@class,'ty-value-changer__decrease')]")).click();
		Assert.assertEquals( "1",driver.findElement(By.xpath("//*[contains(@class,'ty-value-changer__input')]")).getAttribute("value"));
		TimeUnit.SECONDS.sleep(1);
 
		
	}
	@Test(priority=3)
	public void addToCart() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[contains(@class,'ty-btn__add-to-cart')]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[contains(@class,'cm-notification-close')]")).click();
		Assert.assertEquals( "1",driver.findElement(By.xpath("//*[contains(@class,'ut2-icon-use_icon_cart')]")).getText());
		driver.findElement(By.xpath("//*[contains(@class,'ut2-icon-use_icon_cart')]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.linkText("Checkout")).click();
	}
	
	@AfterTest
           public void closeWebsite() {

		driver.quit();
	}
   
}
