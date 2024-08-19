package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By customers = By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span");
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public void verifyDashboard(){
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("admin")){
            System.out.println("Đang ở trang Dashboard");
        } else {
            System.out.println("Không ở trang Dashboard");
        }
    }
    private void clickCustomers(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(customers));
        driver.findElement(customers).click();
    }
    public void verifyCustomers(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(customers));
        if (driver.findElement(customers).isDisplayed() && driver.findElement(customers).getText().trim().equals("Customers")){
            System.out.println("Có Customers");
        }else {
            System.out.println("Không có Customer");
        }
    }
    public CustomersPage CustomerPage(){
        clickCustomers();
        return new CustomersPage(driver);
    }
}
