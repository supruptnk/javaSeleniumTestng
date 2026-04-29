import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class driverManager {
    private static ThreadLocal<ChromeDriver> driverThread = new ThreadLocal<>();

    public void setDriver(){
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        driverThread.set(driver);
    }

    public ChromeDriver getDriver(){
        return driverThread.get();
    }
}
