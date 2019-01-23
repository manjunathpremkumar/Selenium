package info.cukes.cucumber_jvm;

 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class cucumberTest {
 private static WebDriver driver = null;
 public static void main(String[] args) throws InterruptedException {
 // Create a new instance of the Firefox driver
	 
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 
	 driver = new ChromeDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://www.store.demoqa.com");
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        Thread.sleep(3000);
        // Find the element that's ID attribute is 'account'(My Account) 
 
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        Thread.sleep(3000);
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
        Thread.sleep(3000);
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
        Thread.sleep(3000);
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.id("login")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
 
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();
 
 }
 
}