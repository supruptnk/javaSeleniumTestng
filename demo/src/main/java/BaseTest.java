import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
    public WebDriver driver;
     @BeforeMethod
     public void setup(){
        driverManager.setDriver("chrome");
        this.driver = driverManager.getDriver();
        driver.get("https://www.google.com");
     }
}