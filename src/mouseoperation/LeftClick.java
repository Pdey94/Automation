package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement forgotpassword= driver.findElement(By.xpath("//a[text()='पासवर्ड भूल गए?']"));
		forgotpassword.click();
		Actions act=new Actions(driver);
		act.click(forgotpassword).perform();
		
		
	}

}
