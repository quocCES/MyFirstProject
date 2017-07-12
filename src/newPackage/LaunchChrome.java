package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/index.php");
		WebElement usernameTB = driver.findElement(By.id("username"));
	    WebElement pwdTB = driver.findElement(By.id("password"));
	    WebElement loginButton = driver.findElement(By.id("login"));
	    
	    usernameTB.sendKeys("hfsharingan94");
	    pwdTB.sendKeys("firenfreeze0112");
	    loginButton.click();
	    
	  //3. At Search Hotel page, make sure that user choose  "- Select Location -" in field "Location"
	    Select drpCountry = new Select(driver.findElement(By.name("location")));
		drpCountry.selectByVisibleText("- Select Location -");

		//4. Click on "Search" button.
		driver.findElement(By.id("Submit")).click();
		
	    //Verify Error Message Appears beside location combobox.
		String expectedMes = "Welcome: Mercury Tours";
	    String emessage = driver.findElement(By.id("location_span")).getText();
	    Assert.assertEquals(emessage, expectedMes);
	}

}
