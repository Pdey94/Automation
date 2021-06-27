package DropdownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Desktop/automation.html");
		WebElement listbox=driver.findElement(By.xpath("//select[@name='Technology']"));
		
		Select sel=new Select(listbox);
		
		sel.selectByVisibleText("HP");
		sel.selectByIndex(6);
		sel.selectByValue("S");
		sel.selectByIndex(4);
		
		
		Thread.sleep(10000);
		sel.deselectByIndex(4);
		sel.deselectAll();

	}

}
