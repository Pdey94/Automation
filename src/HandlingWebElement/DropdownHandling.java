package HandlingWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		Thread.sleep(5000);
		
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[text()='selenium']"));
		System.out.println(suggestions.size());
		
		/*for(int i=0;i<suggestions.size();i++)
			
		{
			System.out.println(suggestions.get(i).getText());
		}
		
		suggestions.get(2).click();*/
		
		
for(int i=0;i<suggestions.size();i++)
			
		{
	if(suggestions.get(i).getText().equals("selenium interview questions"))
	{
			System.out.println(suggestions.get(i).getText());
			suggestions.get(i).click();
			break;
		}
		
		}

	}

}
