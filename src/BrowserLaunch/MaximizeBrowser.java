package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation Project\\Automation2\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\Automation Project\\Automation2\\driver\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
	}

}
