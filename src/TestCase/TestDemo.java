package TestCase;

import Base.BaseSetup;
import Page.DasboardPage;
import Page.SignInPage;
public class TestDemo extends BaseSetup {
    static DasboardPage dasboardPage;
    public static void main(String[] args) throws Exception {
        Setup();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.checkHeaderPage();
        signInPage.checkBoxEmail();
        signInPage.checkBoxPassword();
        signInPage.checkButtonLogin();
        dasboardPage = signInPage.loginCRM("admin@example.com", "123456");

        dasboardPage.verifyCustomers();
        dasboardPage.clickCustomer();
        dasboardPage.verifyNewCustomer();
        dasboardPage.NewCustomer();
        dasboardPage.verifyCustomerDetails();
        dasboardPage.verifyCompany();
        dasboardPage.verifyVATNumber();
        dasboardPage.verifyPhone();
        dasboardPage.verifyWebsite();
        dasboardPage.verifyGroups();
        dasboardPage.verifyButtonAddNewGroup();
        dasboardPage.verifyCurrency();
        dasboardPage.verifyDefaultLanguage();
        dasboardPage.verifyAddress();
        dasboardPage.verifyCity();
        dasboardPage.verifyState();
        dasboardPage.verifyZipCode();
        dasboardPage.verifyCountry();
        dasboardPage.verifySave();
        dasboardPage.verifySaveAndContact();
        dasboardPage.fillCustomer("ATH","1065623","03125536","https://nhadat.com","Thu Duc",
                "Ho Chi Minh City","Độc thân", "125656");

        dasboardPage.checkfillGroups();
        dasboardPage.verifySearchGroups();
        dasboardPage.verifySelectAll();
        dasboardPage.verifyDeselectAll();

        dasboardPage.addGroup("Automation2");
        dasboardPage.verifyTitleAddNewGroup();
        dasboardPage.verifyFillNameAddNewGroup();
        dasboardPage.verifySaveNameAddNewGroup();
        dasboardPage.verifyCloseNameAddNewGroup();

        dasboardPage.selectAndCurrency();
        //dasboardPage.verifySearchCurrency();
//        dasboardPage.selectAndDefaultLanguage();

        dasboardPage.selectFillCountry();


        dasboardPage.setSave();

        TearDown();
    }
}
