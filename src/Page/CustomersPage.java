package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomersPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By customers = By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span");
    private By newCustomer = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[1]/a[1]/i");
    public CustomersPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public void verifyCustomerPage(){
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("clients")){
            System.out.println("Đang ở trang Customers");
        } else {
            System.out.println("Không ở trang Customers");
        }
    }
    public void verifyCustomersIsEnable(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(customers));
        if (driver.findElement(customers).isEnabled()){
            System.out.println("Nút Customers đang được chọn");
        }else {
            System.out.println("Nút Customers đang không được chọn");
        }
    }
    private void clickNewCustomer(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCustomer));
        driver.findElement(newCustomer).click();
    }
    public void verifyNewCustomer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCustomer));
        if (driver.findElement(newCustomer).isEnabled()) {
            System.out.println("Có nút New Customer");
        } else {
            System.out.println("Không có nút New Customer");
        }
    }
    public CustomerDetails NewCustomer(){
        clickNewCustomer();
        return new CustomerDetails(driver);
    }
}
