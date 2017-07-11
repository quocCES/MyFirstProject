package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchChrome3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://vnexpress.net/");
		//System.out.println(driver.getTitle());	
		
		//System.out.println(driver.getPageSource());
		
		//System.out.println(driver.getCurrentUrl());
		
		//driver.navigate().to("https://www.google.com.vn/");
		//driver.navigate().refresh();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		
		Select dropDown = new Select(driver.findElement(By.name("country")));
		dropDown.selectByVisibleText("ALBANIA");
		dropDown.selectByVisibleText("ALGERIA");
		dropDown.selectByIndex(6);
	}

}
