package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumFireFoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());	

	}
}
