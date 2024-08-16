package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DasboardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public DasboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Customer
    private By customers = By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span");

    // 1. new customer
    private By newCustomer = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[1]/a[1]/i");

    // 1.1
    //private By customerDetails = By.xpath("//*[@data-toggle='tab' and @aria-controls='contact_info']");
    private By customerDetails = By.cssSelector("#wrapper > div > div > div.tw-mt-12.sm\\:tw-mt-0.col-md-8.col-md-offset-2 > div > div.panel-body > div > div > div.row > form > div.col-md-12 > div.horizontal-scrollable-tabs.panel-full-width-tabs > div.horizontal-tabs > ul > li.active > a");
    // 1.1.1 field Company
    private By inputCompany = By.xpath("//*[@id='company' ]");
    private By company = By.xpath("//*[@for='company' ]");
    private By reportFieldCompany = By.xpath("//*[@id='company-error' ]");

    // 1.1.2 field VAT Number
    private By VATNumber = By.xpath("//*[@for='vat' ]");
    private By inputVATNumber = By.xpath("//*[@id='vat' ]");

    // 1.1.3 field Phone
    private By phone = By.xpath("//*[@for='phonenumber']");
    private By inputPhone = By.xpath("//*[@id='phonenumber']");

    // 1.1.4 field Website
    private By website = By.xpath("//*[@for='website']");
    private By inputWebsite = By.xpath("//*[@id='website']");

    // 1.1.5 dropdown Groups
    private By groups = By.xpath("//*[@for='groups_in[]']");
    private By dropdownGroups = By.xpath("//*[@title='Nothing selected' and @data-id='groups_in[]']");

    // search Groups
    private By searchGroups = By.xpath("//*[@id=\"bs-select-1-0\"]");
    private By selectAll = By.xpath("//*[@id=\"contact_info\"]/div/div[2]/div[6]/div/div[1]/div/div[2]/div/button[1]");
    private By deselectAll = By.xpath("//*[@id=\"contact_info\"]/div/div[2]/div[6]/div/div[1]/div/div[2]/div/button[2]");
    // lựa chọn dùng vòng for để lấy x.path và thay đổi lựa chọn dựa vào thẻ li[] ở cuối x.path
    private By select = By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/div/div[3]/ul/li[1]");

    // thêm mới addgroups
    private By addGroups = By.xpath("//*[@class='fa fa-plus']");
    private By addGroupsTitle = By.xpath("//*[@class='add-title']");
    private By inputAddGroups = By.xpath("//input[@id='name']");
    private By textDanger = By.xpath("//*[@id='name-error']");
    private By close = By.xpath("//*[@group='button' and @class='btn btn-default']");
    private By save = By.xpath("//*[@group='submit' and @class='btn btn-primary']");

    // 1.1.6 dropdown Currency
    private By currency = By.xpath("//*[@for='default_currency']");
    private By systemDefaultCurrency = By.xpath("//*[@id=\"contact_info\"]/div/div[2]/div[7]/div[1]/div/div/button/div/div/div");
    private By searchCurrency = By.xpath("//*[@id=\"contact_info\"]/div/div[2]/div[7]/div[1]/div/div/div/div[1]/input");
    // sử dụng vòng for để lựa chọn từng phần tử dựa vào thẻ li[1]
    private By selectCurrency = By.xpath("//*[@id=\"bs-select-2-1\"]");

    // dropdown Default Language
    private By defaultLanguage = By.xpath("//*[@for='default_language']");
    private By systemDefaultLanguage = By.xpath("//*[@id=\"contact_info\"]/div/div[2]/div[7]/div[2]/div/div/button");
    // select ngôn ngữ Việt Nam
    private By selectLanguage = By.xpath("//*[@id=\"bs-select-3-21\"]");

    // 1.1.7 field Address
    private By address = By.xpath("//*[@for='address']");
    private By inputAddress = By.xpath("//*[@name='address']");

    // 1.1.8 field City
    private By city = By.xpath("//*[@for='city']");
    private By inputCity = By.xpath("//*[@name='city']");

    // 1.1.9 field State
    private By state = By.xpath("//*[@for='state']");
    private By inputState = By.xpath("//*[@name='state']");

    // 1.1.10 Zip code
    private By zipCode = By.xpath("//*[@for='zip']");
    private By inputZipCode = By.xpath("//*[@name='zip']");

    // 1.1.11 Dropdown Country
    private By country = By.xpath("//*[@for='country']");
    private By nothingSelect = By.xpath("//*[@id=\"contact_info\"]/div/div[2]/div[12]/div/button/div/div/div");
    private By searchCountry = By.xpath("//*[@id=\"bs-select-4-243\"]");
    // chọn quốc gia Việt Nam
    private By selectCountry = By.xpath("//*[@id=\"bs-select-4\"]/ul/li[244]");

    // 1.1.12 Save
    private By saveAndContact = By.xpath("//*[@id=\"profile-save-section\"]/button[1]");
    private By saveAndSave = By.xpath("//*[@id=\"profile-save-section\"]/button[2]");


    // Xử lý các hàm click
    private void clickCustomers(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(customers));
        driver.findElement(customers).click();
    }
    private void clickNewCustomer(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCustomer));
        driver.findElement(newCustomer).click();
    }
    private void Company(String Company){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputCompany));
        driver.findElement(inputCompany).sendKeys(Company);
    }
    private void VATNumber(String VAT){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputVATNumber));
        driver.findElement(inputVATNumber).sendKeys(VAT);
    }
    private void Phone(String phone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPhone));
        driver.findElement(inputPhone).sendKeys(phone);
    }
    private void Website(String web){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputWebsite));
        driver.findElement(inputWebsite).sendKeys(web);
    }
    private void clickAddGroups(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addGroups));
        driver.findElement(addGroups).click();
    }
    private void addNewGroups(String fillNewGroups){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddGroups));
        driver.findElement(inputAddGroups).sendKeys(fillNewGroups);
    }
    private void clickSaveNewGroup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(save));
        driver.findElement(save).click();
    }

    private void clickGroups(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownGroups));
        driver.findElement(dropdownGroups).click();
    }
    private void Groups(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchGroups));
        driver.findElement(searchGroups).click();
    }
    private void Currency(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(systemDefaultCurrency));
        driver.findElement(systemDefaultCurrency).click();
    }
    private void selectCurrency(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCurrency));
        driver.findElement(selectCurrency).click();
    }
    private void DefaultLanguage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(systemDefaultLanguage));
        driver.findElement(systemDefaultLanguage).click();
    }
    private void selectDefaultLanguage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectLanguage));
        driver.findElement(selectLanguage).click();
    }
    private void Address(String fillAddress){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddress));
        driver.findElement(inputAddress).sendKeys(fillAddress);
    }
    private void City(String fillCity){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputCity));
        driver.findElement(inputCity).sendKeys(fillCity);
    }
    private void State(String fillState){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputState));
        driver.findElement(inputState).sendKeys(fillState);
    }
    private void ZipCode(String fillZip){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputZipCode));
        driver.findElement(inputZipCode).sendKeys(fillZip);
    }
    private void Country(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nothingSelect));
        driver.findElement(nothingSelect).click();
    }
    private void FillCountry(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCountry));
        driver.findElement(searchCountry).click();
    }
    private void clickSave(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveAndSave));
        driver.findElement(saveAndSave).click();
    }





    // verify

    public void verifyCustomers(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(customers));
        if (driver.findElement(customers).isDisplayed() && driver.findElement(customers).getText().trim().equals("Customers")){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    public void verifyNewCustomer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCustomer));
        if (driver.findElement(newCustomer).isEnabled()) {
            System.out.println("Có nút New Customer");
        } else {
            System.out.println("Không có nút New Customer");
        }
    }
    public void verifyCustomerDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(customerDetails));
        if (driver.findElement(customerDetails).getText().trim().equals("Customer Details")){
            System.out.println("Customer Details đã được chọn");
        }else {
            System.out.println("Customer Details chưa được chọn");
        }
    }
    public void verifyCompany(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(company));
        if (driver.findElement(company).getText().contains("Company")){
            System.out.println("Có fill Company xuất hiện");
        }else {
            System.out.println("Không có fill Company xuất hiện");
        }
    }
    public void verifyVATNumber(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VATNumber));
        if (driver.findElement(VATNumber).getText().trim().equals("VAT Number")){
            System.out.println("Có fill VAT xuất hiện");
        }else {
            System.out.println("Không có fill VAT xuất hiện");
        }
    }
    public void verifyPhone(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phone));
        if (driver.findElement(phone).getText().trim().equals("Phone")){
            System.out.println("Có fill Phone xuất hiện");
        }else {
            System.out.println("Không có fill Phone xuất hiện");
        }
    }
    public void verifyWebsite(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(website));
        if (driver.findElement(website).getText().trim().equals("Website")){
            System.out.println("Có fill Website xuất hiện");
        }else {
            System.out.println("Không có fill Website xuất hiện");
        }
    }
    public void verifyGroups(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(groups));
        if (driver.findElement(groups).getText().trim().equals("Groups")){
            System.out.println("Có fill Groups xuất hiện");
        }else {
            System.out.println("Không có fill Groups xuất hiện");
        }
    }
    public void verifySearchGroups(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchGroups));
        if (driver.findElement(searchGroups).isDisplayed()){
            System.out.println("Search có xuất hiện");
        }else {
            System.out.println("Search không có xuất hiện");
        }
    }
    public void verifySelectAll(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectAll));
        if (driver.findElement(selectAll).isEnabled()){
            System.out.println("selectAll đã sẵng sàng");
        }else {
            System.out.println("selectAll chưa sẵng sàng");
        }
    }
    public void verifyDeselectAll(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(deselectAll));
        if (driver.findElement(deselectAll).isEnabled()){
            System.out.println("deselectAll đã sẵng sàng");
        }else {
            System.out.println("deselectAll chưa sẵng sàng");
        }
    }
    public void verifyButtonAddNewGroup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addGroups));
        if (driver.findElement(addGroups).isEnabled()){
            System.out.println("Button NewGroup đã sẵng sàng");
        }else {
            System.out.println("Button NewGroup chưa sẵng sàng");
        }
    }
    public void verifyTitleAddNewGroup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addGroupsTitle));
        if (driver.findElement(addGroupsTitle).getText().equals("Add New Customer Group")){
            System.out.println("Đang ở box Add New Customer Group");
        }else {
            System.out.println("Không ở box Add New Customer Group");
        }
    }
    public void verifyFillNameAddNewGroup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddGroups));
        if (driver.findElement(inputAddGroups).isDisplayed()){
            System.out.println("fill name đã sẵn sàng");
        }else {
            System.out.println("fill name chưa có");
        }
    }
    public void verifySaveNameAddNewGroup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(save));
        if (driver.findElement(save).isEnabled()){
            System.out.println("buton Save đã sẵn sàng");
        }else {
            System.out.println("button Save chưa chưa xuất hiện");
        }
    }
    public void verifyCloseNameAddNewGroup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(close));
        if (driver.findElement(close).isEnabled()){
            System.out.println("buton Close đã sẵn sàng");
        }else {
            System.out.println("button Close chưa chưa xuất hiện");
        }
    }
    public void verifyCurrency(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(systemDefaultCurrency));
        if (driver.findElement(systemDefaultCurrency).isEnabled()){
            System.out.println("Dropdown Currency đã có");
        }else {
            System.out.println("Dropdown Currency chưa có");
        }
    }
   /* public void verifySearchCurrency(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCurrency));
        if (driver.findElement(searchCurrency).isDisplayed()){
            System.out.println("Search Currency đã có");
        }else {
            System.out.println("Search Currency chưa có");
        }
    }*/
    public void verifyDefaultLanguage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(systemDefaultLanguage));
        if (driver.findElement(systemDefaultLanguage).isEnabled()){
            System.out.println("Dropdown Default Language đã có");
        }else {
            System.out.println("Dropdown Default Language chưa có");
        }
    }
    public void verifyAddress(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddress));
        if (driver.findElement(inputAddress).isDisplayed()){
            System.out.println("Fill Address đã xuất hiện");
        }else {
            System.out.println("Fill Address chưa xuất hiện");
        }
    }
    public void verifyCity(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputCity));
        if (driver.findElement(inputCity).isDisplayed()){
            System.out.println("Fill City đã xuất hiện");
        }else {
            System.out.println("Fill City chưa xuất hiện");
        }
    }
    public void verifyState(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputState));
        if (driver.findElement(inputState).isDisplayed()){
            System.out.println("Fill State đã xuất hiện");
        }else {
            System.out.println("Fill State chưa xuất hiện");
        }
    }
    public void verifyZipCode(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputZipCode));
        if (driver.findElement(inputZipCode).isDisplayed()){
            System.out.println("Fill Zip Code đã xuất hiện");
        }else {
            System.out.println("Fill Zip Code chưa xuất hiện");
        }
    }
    public void verifyCountry(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nothingSelect));
        if (driver.findElement(nothingSelect).isEnabled()){
            System.out.println("Dropdown Country đã xuất hiện");
        }else {
            System.out.println("Dropdown Country chưa xuất hiện");
        }
    }
    public void verifySearchCountry(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCountry));
        if (driver.findElement(searchCountry).isDisplayed()){
            System.out.println("Fill Search Country đã xuất hiện");
        }else {
            System.out.println("Fill Search Country chưa xuất hiện");
        }
    }
    public void verifySave(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveAndSave));
        if (driver.findElement(saveAndSave).isEnabled()){
            System.out.println("Button Save đã xuất hiện");
        }else {
            System.out.println("Button Save chưa xuất hiện");
        }
    }
    public void verifySaveAndContact(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveAndContact));
        if (driver.findElement(saveAndContact).isEnabled()){
            System.out.println("Button Save And Contact đã xuất hiện");
        }else {
            System.out.println("Button Save And Contact chưa xuất hiện");
        }
    }
    public void clickCustomer(){
        clickCustomers();
    }
    public void NewCustomer(){
        clickNewCustomer();
    }
    public void fillCustomer(String company, String VAT, String phone, String web, String fillAddress,
                             String fillCity, String fillState, String fillZipCode){
        Company(company);
        VATNumber(VAT);
        Phone(phone);
        Website(web);

        Address(fillAddress);
        City(fillCity);
        State(fillState);
        ZipCode(fillZipCode);
    }
    public void checkfillGroups(){
        clickGroups();
        Groups();
    }

    public void addGroup(String newgroup){
        clickAddGroups();
        addNewGroups(newgroup);
        clickSaveNewGroup();
    }
    public void selectAndCurrency(){
        Currency();
        selectCurrency();
    }
    public void selectAndDefaultLanguage(){
        DefaultLanguage();
        selectDefaultLanguage();
    }
    public void selectFillCountry(){
        Country();
        FillCountry();
    }
    public void setSave(){
        clickSave();
    }
}
