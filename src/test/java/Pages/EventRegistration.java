package Pages;
import org.openqa.selenium.By;

 
import org.openqa.selenium.chrome.ChromeDriver;

public class EventRegistration {

	ChromeDriver driver;

	
	By firstName = By.id("litecheckout_fullname");
	By phoneNumber = By.id("litecheckout_phone");
	By city = By.id("litecheckout_city");
	By address = By.id("litecheckout_s_address");
	By zipCode = By.id("litecheckout_s_zipcode");
	By checkBox = By.name("accept_terms");
	By checkOut = By.id("litecheckout_place_order");
	
	 
	
	public EventRegistration(ChromeDriver driver1) {

		this.driver = driver1;
	}


	public void setTextInFirstName(String text) {
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(text);
	}
	
	public void setTextPhoneNumber(String Phone) {
		driver.findElement(phoneNumber).clear();
		driver.findElement(phoneNumber).sendKeys(Phone);
	}
	
	public void setTextCity(String City) {
		driver.findElement(city).clear();
		driver.findElement(city).sendKeys(City);
	}
	
	public void setTextAddress(String Address) {
		driver.findElement(address).clear();
		driver.findElement(address).sendKeys(Address);
	}
	
	public void setTextZipCode(String ZipCode) {
		driver.findElement(zipCode).clear();
		driver.findElement(zipCode).sendKeys(ZipCode);
	}
	public void accepttheTermsandConditions() {
		 
		driver.findElement(checkBox).click();
	}
	public void checkOut() {
		 
		driver.findElement(checkOut).click();
	}
	
}

 
 