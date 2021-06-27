package Popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://www.naukri.com");
		
		Set<String> a=driver.getWindowHandles();
		System.out.println(a.size());
		
		ArrayList<String> a1=new ArrayList<>(a);
		System.out.println(a1.size());
		
		driver.switchTo().window(a1.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(10000);
		driver.switchTo().window(a1.get(0));
		driver.close();
		

	}

}
