package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSetup {
    protected static WebDriver driver;
    public static void Setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://crm.anhtester.com/admin/authentication");
    }

    public static void TearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
