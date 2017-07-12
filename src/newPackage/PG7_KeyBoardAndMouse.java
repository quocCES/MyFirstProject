package newPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PG7_KeyBoardAndMouse {
    
    public static void main(String[] args) {
        String baseUrl = "http://newtours.demoaut.com/";
        System.setProperty("webdriver.gecko.driver", "C:\\seleniumFireFoxDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);           
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));    
         
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
        
        System.out.println("//html/body/div"+"/table/tbody/tr/td"+"/table/tbody/tr/td"+ "/table/tbody/tr/td" + "/table/tbody/tr");
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
//                driver.close();
        }
}