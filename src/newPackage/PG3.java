package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG3 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", "C:\\seleniumFireFoxDriver\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        driver.get("http://www.popuptest.com/popuptest2.html");
        driver.quit();  // using QUIT all windows will close
    }
}