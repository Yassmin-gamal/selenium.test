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
	public WebDriver driver ; 
	@BeforeTest
   public void openURL () {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Resourses\\chromedriver.exe");
		
		 
		
		driver = new ChromeDriver(); 
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
   }
   
  
 
   
   @Test
   public void searchForItem() {
	   
		// Get All the links displayed on Page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//Verify there are 41 Links displayed on the page
		Assert.assertEquals(41, links.size());
		
		// Print each link value
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
   }
   
   
   
   @AfterTest
   
   public void closeWebsite() {
	   
	   driver.quit();
   }
   
   
   
   
   
   
   
   
   
   
}
