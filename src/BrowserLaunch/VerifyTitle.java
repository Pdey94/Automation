package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\Automation Project\\Automation2\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\Automation Project\\Automation2\\driver\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Google"))
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}

	}

}
