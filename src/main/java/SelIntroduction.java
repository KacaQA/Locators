import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {
    public static void main(String[] args) {
        // Invoking Browser
        // Chrome - ChromeDriver -> Methods close get
        // Firefox - FirefoxDriver -> Methods close get
        // Safari - SafariDriver -> Methods close get
        // WebDriver Interface
        // WebDriver methods + class methods
        // chromedriver.exe file invokes Chrome browser
        // Step to invoke Chrome Driver // If don't write any step, then Selenium Manager
        // can talk to browser and invoke Chrome browser

        // Chrome browser
        // chromedriver.exe -> Chrome browser
        //System.setProperty("webdriver.chrome.driver", "/Users/User/Documents/chromedriver.exe");

        // webdriver.chrome.driver -> value of path
        //WebDriver driver = new ChromeDriver();

        //Firefox browser
        //geckodriver
        //webdirver.gecko.driver
        //System.setProperty("webdriver.gecko.driver", "/Users/User/Documents/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        //Microsoft Edge browser
        System.setProperty("webdriver.edge.driver", "/Users/User/Documents/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close(); // will close only the browser that is originally opened, closing the current window
       // driver.quit(); // closing every associated window








    }
}