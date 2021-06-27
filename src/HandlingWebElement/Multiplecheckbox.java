package HandlingWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Desktop/automation.html");
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		
		/*for(int i=0;i<checkbox.size();i++)
		{
			Thread.sleep(10000);
			checkbox.get(i).click();
		}*/
		
		/*for(int i=0;i<checkbox.size();i+=2)
		{
			Thread.sleep(10000);
			checkbox.get(i).click();
		}*/
		
		
		/*for(int i=1;i<checkbox.size();i+=2)
		{
			Thread.sleep(10000);
			checkbox.get(i).click();
		}*/
		
		for(int i=checkbox.size()-1;i>=0;i-=2)
		{
			Thread.sleep(10000);
			checkbox.get(i).click();
		}
		
		
		
	}

}
