package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source= driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement target= driver.findElement(By.xpath("//div[text()='Sweden']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source,target).perform();

			
		
	}

}
