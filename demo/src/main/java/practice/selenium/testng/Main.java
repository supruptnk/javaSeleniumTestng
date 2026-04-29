package practice.selenium.testng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {

     private static ThreadLocal<ChromeDriver> driverThread = new ThreadLocal<>();
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless=new");
        ChromeDriver driver = new ChromeDriver(options);
        driverThread.set(driver);
        driverThread.get().get("https://www.google.com");
        
    }
}