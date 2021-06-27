package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadFirefoxProfile {

	public static void main(String[] args) {

		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		
		//WebDriver driver=new FirefoxDriver(profile);
		
		//driver.get("https://www.selenium.dev/downloads/");
		//driver.findElement(By.xpath("//td[.='java']/..//a[.='Download']"));
		
	}

}
