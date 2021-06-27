package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchValue {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://beta.leadr.dev/");
		Thread.sleep(10000);
		WebElement emailid= driver.findElement(By.cssSelector("input[name='email']"));
		emailid.sendKeys("neha");
		
		//emailid.sendKeys(Keys.CONTROL,"a");
		System.out.println(emailid.getAttribute("type")); 
		
		
	}

}
