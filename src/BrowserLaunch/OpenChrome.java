package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation Project\\Automation2\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\Automation Project\\Automation2\\driver\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.myntra.com/");
		//driver.navigate().back();
		//driver.navigate().refresh();
		driver.navigate().forward();
		//driver.close();
		//driver.quit();
		//String title=driver.getTitle();
		//System.out.print(title);
		
		//System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		
	}

}