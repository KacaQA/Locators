import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {

     public static void main (String[] args) throws InterruptedException {
         String name = "rahul";
         System.setProperty("webdriver.chrome.driver", "/Users/User/Documents/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting for objects to show on the page
         String password = getPassword(driver);


         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys(name);
         driver.findElement(By.name("inputPassword")).sendKeys(password);
         driver.findElement(By.className("signInBtn")).click();
         Thread.sleep(1000);
         System.out.println(driver.findElement(By.tagName("p")).getText());
         Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
         Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
         driver.findElement(By.xpath("//*[text()='Log Out']")).click();
         driver.close();

     }

     public static String getPassword(WebDriver driver) throws InterruptedException {
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.linkText("Forgot your password?")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
         String passwordText = driver.findElement(By.cssSelector("form p")).getText();
         // Please use temporary password 'rahulshettyacademy' to Login
         String[] passwordArray = passwordText.split("'");
         //["Please use temporary password ", "rahulshettyacademy", " to Login"]
         //String[] passwordArray2 = passwordArray[1].split("'");
         //passwordArray2[0];
         // Zatim uzimamo drugi element iz niza, a to je rahulshettyacademy
         String passsword = passwordArray[1].split("'")[0]; //last two lines are the same as this
         // odje dobijamo password rahulshettyacademy
         return passsword;

         //oth index - Please use temporary password
         //1st index - rahulshettyacademy' to Login

         //oth index - rahulshettyacademy
         //1st index - to Login.
     }
}
