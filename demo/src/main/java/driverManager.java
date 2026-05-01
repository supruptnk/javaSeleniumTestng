import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class driverManager {
    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static void setDriver(String Browser){
        WebDriver driver;
        if(Browser.toUpperCase().equals("EDGE"))
            {
            driver = new EdgeDriver();
            }
        else if(Browser.toUpperCase().equals("FIREFOX"))
        {
            driver = new FirefoxDriver();
        }
        else
            {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        }

        driverThread.set(driver);
        
    }

    public static WebDriver getDriver(){
        return driverThread.get();
    }
}
