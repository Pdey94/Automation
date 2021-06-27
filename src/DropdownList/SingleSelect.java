package DropdownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("file:///C:/Users/User/Desktop/automation.html");
			WebElement listbox=driver.findElement(By.xpath("//select[@name='Technology']"));
			//listbox.click();
		
			Select sel=new Select(listbox);
			Thread.sleep(10000);
			/*sel.selectByVisibleText("HP");
			sel.selectByIndex(6);
			sel.selectByValue("S");*/
			
			sel.selectByVisibleText("Dell");
			
			
	}

}
