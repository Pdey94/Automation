package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.naukri.com");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());

	}

}
