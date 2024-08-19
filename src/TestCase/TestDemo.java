package TestCase;

import Base.BaseSetup;
import Page.CustomerDetails;
import Page.CustomersPage;
import Page.DashboardPage;
import Page.SignInPage;

public class TestDemo extends BaseSetup {
    static DashboardPage dasboardPage;
    static CustomersPage customersPage;
    static CustomerDetails customerDetails;
    public static void main(String[] args) throws Exception {
        Setup();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.checkHeaderPage();
        signInPage.checkBoxEmail();
        signInPage.checkBoxPassword();
        signInPage.checkButtonLogin();
        dasboardPage = signInPage.loginCRM("admin@example.com", "123456");

        dasboardPage.verifyDashboard();
        dasboardPage.verifyCustomers();

        customersPage = dasboardPage.CustomerPage();
        customersPage.verifyCustomerPage();
        customersPage.verifyCustomersIsEnable();
        customersPage.verifyNewCustomer();

        customerDetails = customersPage.NewCustomer();
        customerDetails.verifyCustomerDetails();
        customerDetails.verifyCompany();
        customerDetails.verifyVATNumber();
        customerDetails.verifyPhone();
        customerDetails.verifyWebsite();
        customerDetails.verifyGroups();
        customerDetails.verifyButtonAddNewGroup();
        customerDetails.verifyCurrency();
        customerDetails.verifyDefaultLanguage();
        customerDetails.verifyAddress();
        customerDetails.verifyCity();
        customerDetails.verifyState();
        customerDetails.verifyZipCode();
        customerDetails.verifyCountry();
        customerDetails.verifySave();
        customerDetails.verifySaveAndContact();
        customerDetails.fillCustomer("ATH","1065623","03125536","https://nhadat.com","Thu Duc",
                "Ho Chi Minh City","Độc thân", "125656");
        customerDetails.nhanvaoGroups();
        customerDetails.verifySearchGroups();
        customerDetails.verifySelectAll();
        customerDetails.verifyDeselectAll();
        customerDetails.fillelement();
        customerDetails.addGroup("Automation2");
        customerDetails.verifyTitleAddNewGroup();
        customerDetails.verifyFillNameAddNewGroup();
        customerDetails.verifySaveNameAddNewGroup();
        customerDetails.verifyCloseNameAddNewGroup();
        customerDetails.selectAndCurrency();
        customerDetails.selectAndDefaultLanguage();
        customerDetails.nhanvaoCountry();
        customerDetails.verifySearchCountry();
        customerDetails.fillelementCountry();
        customerDetails.setSave();

        TearDown();
    }
}
