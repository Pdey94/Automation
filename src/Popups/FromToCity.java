package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromToCity {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.americanairlines.in/");
		
		WebElement fromCity=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		fromCity.sendKeys("Las");
		
		Thread.sleep(5000);
		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);
		

	}

}
