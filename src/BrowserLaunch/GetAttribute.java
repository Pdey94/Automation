package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://beta.leadr.dev/");
		Thread.sleep(10000);
		WebElement emailid= driver.findElement(By.cssSelector("input[name='email']"));
		String Attributevalue=emailid.getAttribute("Email");
		System.out.println(Attributevalue);
        		
		
	}

}
