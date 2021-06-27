package DropdownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Desktop/automation.html");
		WebElement listbox=driver.findElement(By.xpath("//select[@name='Technology']"));
		
		Select sel=new Select(listbox);
		
		sel.selectByVisibleText("HP");
		sel.selectByVisibleText("Dell");
		sel.selectByVisibleText("Lenovo");
		sel.selectByVisibleText("Apple");
		sel.selectByVisibleText("Lava");
		sel.selectByVisibleText("Samsung");
		
		WebElement firstSelected=sel.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		
		
	}

}
