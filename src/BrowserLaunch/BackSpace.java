package BrowserLaunch;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackSpace {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://beta.leadr.dev/");
		Thread.sleep(10000);
		WebElement firstname= driver.findElement(By.cssSelector("input[name='email']"));
				firstname.sendKeys("updoer1tech@yopmail.com");
				firstname.sendKeys(Keys.CONTROL,"a");
				firstname.sendKeys(Keys.BACK_SPACE);
				//firstname.sendKeys(Keys.DELETE);
	}

}
