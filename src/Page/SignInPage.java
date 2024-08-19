package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By headerPage = By.xpath("//h1[normalize-space()='Login']");
    private By inputEmail = By.xpath("//input[@id='email']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");


    public SignInPage(WebDriver driver) {
        this.driver = driver;
        //driver = _driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    private void setEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
        driver.findElement(inputEmail).sendKeys(email);
    }

    private void setPassword (String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassword));
        driver.findElement(inputPassword).sendKeys(password);
    }

    private void clickLoginButton (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLogin));
        driver.findElement(buttonLogin).click();
    }

    public void checkHeaderPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage));
        WebElement checkText = driver.findElement(headerPage);
        if (checkText.isDisplayed() == true && checkText.getText().contains("Login")){
            System.out.println("True");
        }else
            System.out.println("False");
    }

    public void checkBoxEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
        WebElement checkBox = driver.findElement(inputEmail);
        if (checkBox.isDisplayed()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public void checkBoxPassword(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassword));
        WebElement checkBox = driver.findElement(inputPassword);
        if (checkBox.isDisplayed()){
            System.out.println("True");
        }else
            System.out.println("False");
    }

    public void checkButtonLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLogin));
        WebElement checkButton = driver.findElement(buttonLogin);
        if (checkButton.isDisplayed()){
            System.out.println("True");
        }else
            System.out.println("False");
    }

    public DashboardPage loginCRM(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickLoginButton();
        return new DashboardPage(driver);
    }
}

