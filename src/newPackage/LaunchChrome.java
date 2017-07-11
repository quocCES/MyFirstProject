package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Chao Ca Lop");
		driver.findElement(By.id("pass")).sendKeys("asdasdsd");
		driver.findElement(By.id("pass")).sendKeys("asdasdsdd");
		driver.findElement(By.id("pass")).submit();

		//driver.get("http://newtours.demoaut.com/");
		//driver.findElement(By.linkText("Register here")).click();
		//driver.findElement(By.partialLinkText("here")).click();
	}

}
