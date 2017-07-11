package newPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG5_4_ImageLink {

	public static void main(String[] args) {
        String baseUrl = "https://en-gb.facebook.com/login/identify?ctx=recover";
        System.setProperty("webdriver.gecko.driver", "C:\\seleniumFireFoxDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        //click on the "Facebook" logo on the upper left portion
        driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();

        //verify that we are now back on Facebook's homepage
        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
            System.out.println("We are back at Facebook's homepage");
        } else {
            System.out.println("We are NOT in Facebook's homepage");
        }
        driver.close();
    }
}