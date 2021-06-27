package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.americanairlines.in/");
		
		
		driver.findElement(By.xpath("(//input[@class=\"aaDatePicker hasDatepicker\"])[1]")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		driver.findElement(By.xpath("(//input[@class=\"aaDatePicker hasDatepicker\"])[2]")).click();
		//driver.findElement(By.xpath("//a[text()='10']")).click();
		
		for(int i=0;i<=3;i++)
		{
			driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
		}

		
	}

}
