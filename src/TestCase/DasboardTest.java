package TestCase;
import Base.BaseSetup;
import Page.CustomerDetails;
import Page.SignInPage;

public class DasboardTest extends BaseSetup {

    public static void main(String[] args) throws Exception {
        Setup();
       /* SignInPage signInPage = new SignInPage(driver);
        signInPage.checkHeaderPage();
        signInPage.checkBoxEmail();
        signInPage.checkBoxPassword();
        signInPage.checkButtonLogin();
        CustomerDetails dasboardPage = signInPage.loginCRM("admin@example.com", "123456");
        dasboardPage.clickCustomer();
        dasboardPage.NewCustomer();
        dasboardPage.nhanvaoGroups();
        dasboardPage.fillelement();
        dasboardPage.selectAndCurrency();
        dasboardPage.selectAndDefaultLanguage();
        dasboardPage.nhanvaoCountry();
        dasboardPage.fillelementCountry();
        Thread.sleep(4000);*/

        TearDown();











    }
}
