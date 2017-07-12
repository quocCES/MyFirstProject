package newPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SH_001_RedErrorMessageAppearsInSearchHotel {

	public String baseUrl = "http://www.adactin.com/HotelApp/index.php";
    String driverPath = "C:\\seleniumFireFoxDriver\\geckodriver.exe";
    public WebDriver driver ;
    
	@BeforeTest
	public void beforeTest() {
		//1. Go to page http://www.adactin.com/HotelApp/
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\seleniumChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
	    driver.get(baseUrl);
	    
	    //2. Login this page using username "hfsharingan94" and password "firenfreeze0112"
	    WebElement usernameTB = driver.findElement(By.id("username"));
	    WebElement pwdTB = driver.findElement(By.id("password"));
	    WebElement loginButton = driver.findElement(By.id("login"));
	    
	    usernameTB.sendKeys("hfsharingan94");
	    pwdTB.sendKeys("firenfreeze0112");
	    loginButton.click();
	}
	
	@Test
	public void VerifyRedErrorMessageAppearsInSearchHotel() {

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
  

	@AfterTest
	public void afterTest() {
		//Closed App
		driver.close();
	}

}


