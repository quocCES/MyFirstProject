package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://vnexpress.net/");
		//System.out.println(driver.getTitle());	
		
		//System.out.println(driver.getPageSource());
		
		//System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.google.com.vn/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
