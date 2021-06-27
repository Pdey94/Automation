package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		WebElement beauty= driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(beauty).perform();
		Thread.sleep(5000);
		
		WebElement facewash=driver.findElement(By.xpath("//a[text()='Face Wash']"));
		act.moveToElement(facewash).click(facewash).perform();

	}

}
