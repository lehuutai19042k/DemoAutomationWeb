package TestCase;
import Base.BaseSetup;
import Page.DasboardPage;
public class DasboardTest extends BaseSetup {
    public static void main(String[] args) throws Exception {
        Setup();
        DasboardPage dasboardPage = new DasboardPage(driver);
        dasboardPage.verifyCustomers();
        dasboardPage.verifyNewCustomer();
        dasboardPage.verifyCustomerDetails();
        dasboardPage.verifyCompany();
        dasboardPage.verifyVATNumber();
        dasboardPage.verifyPhone();
        dasboardPage.verifyWebsite();
        dasboardPage.verifyGroups();
        dasboardPage.verifySearchGroups();
        dasboardPage.verifySelectAll();
        dasboardPage.verifyDeselectAll();
        dasboardPage.verifyButtonAddNewGroup();
        dasboardPage.verifyTitleAddNewGroup();
        dasboardPage.verifyFillNameAddNewGroup();
        dasboardPage.verifySaveNameAddNewGroup();
        dasboardPage.verifyCloseNameAddNewGroup();
        dasboardPage.verifyCurrency();
        //dasboardPage.verifySearchCurrency();
        dasboardPage.verifyDefaultLanguage();
        dasboardPage.verifyAddress();
        dasboardPage.verifyCity();
        dasboardPage.verifyState();
        dasboardPage.verifyZipCode();
        dasboardPage.verifyCountry();
        dasboardPage.verifySearchCountry();
        dasboardPage.verifySave();
        dasboardPage.verifySaveAndContact();
        dasboardPage.fillCustomer("ATH","1065623","03125536","https://nhadat.com", "Thu Duc",
                "Ho Chi Minh City","Độc thân", "125656");

        TearDown();











    }
}
