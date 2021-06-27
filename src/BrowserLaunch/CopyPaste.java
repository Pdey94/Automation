package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://beta.leadr.dev/");
		Thread.sleep(10000);
		WebElement firstname= driver.findElement(By.cssSelector("input[name='email']"));
				firstname.sendKeys("updoer1tech@yopmail.com");
				firstname.sendKeys(Keys.CONTROL,"a");
				firstname.sendKeys(Keys.CONTROL,"x");
				//firstname.sendKeys(Keys.CONTROL,"c");
		WebElement surnamename= driver.findElement(By.cssSelector("input[name='password']"));
		surnamename.sendKeys(Keys.CONTROL,"v");


	}

}
