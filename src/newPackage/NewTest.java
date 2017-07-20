package newPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "//home//quoccao//eclipse-workspace//chromedriver");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://development.picturesplus.com/faq/");
	  
	  WebElement lnk_WhoIsPP = (WebElement) driver.findElements(By.partialLinkText("Who is Pictures Plus"));
	  
	  lnk_WhoIsPP.click();
  
  }
}