package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://beta.leadr.dev/");
		Thread.sleep(10000);
		//driver.findElement(By.name("email")).sendKeys("leadrttest@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Updoer.17");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("leadrttest@gmail.com"); //Attribute  (//tagname[@attribute='attribute value'])
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Forgot Password?']")).click();  //  tag[text()='text value']
	
		// FORWARD TRAVERSING
		
	//	/html//div(2)//input[2]
		//body//div(3)/input(1)		
	
		
		
	
	}

}
