package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedEnabledSelected {

	public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(10000);
			WebElement button= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
			button.click();
			Thread.sleep(10000);
			WebElement malecheckbox= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			malecheckbox.click();
			
			Thread.sleep(10000);
			
			System.out.println(malecheckbox.isDisplayed());
			System.out.println(malecheckbox.isEnabled());
			System.out.println(malecheckbox.isSelected());
			

	}

}
