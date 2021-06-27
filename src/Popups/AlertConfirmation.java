package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class=\"title ellipsis\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"item createNewCustomer\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@placeholder=\"Enter Customer Name\"])[2]")).sendKeys("Monika");
		
		driver.findElement(By.xpath("//div[@class=\"greyButton cancelBtn\"]")).click();
		
		Thread.sleep(5000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		//alt.accept();
		alt.dismiss();

		
		
		

		
	}

}
