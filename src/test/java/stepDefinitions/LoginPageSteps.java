package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class LoginPageSteps extends BaseClass {

    @Given("User Launch the Chrome Browser")
    public void user_Launch_the_Chrome_Browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
    }

    @When("User Open URL {string}")
    public void user_Open_URL(String url) {
        driver.get(url);
    }

    @And("User enter email as {string} and password as {string}")
    public void user_enter_email_as_and_password_as(String uName, String pwd) {
        lp.setUserName(uName);
        lp.setPassword(pwd);
    }

    @And("Click on Login Button")
    public void click_on_Login_Button() {
        lp.clickLogin();
    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String pageTitle) throws InterruptedException {
        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);
        }else {
            Assert.assertEquals(pageTitle, driver.getTitle());
        }
        Thread.sleep(2000);
    }

    @When("User click on Logout Link")
    public void user_click_on_Logout_Link() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(1000);
    }

    @And("Close Browser")
    public void close_Browser() {
        driver.close();
    }

    //Steps for Add Customer Page ................
    @Then("User can view Dashboard")
    public void user_can_view_Dashboard() throws InterruptedException {
        addCust = new AddCustomerPage(driver);
        Thread.sleep(3000);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
    }

    @When("User click on Customers Menu")
    public void user_click_on_Customers_Menu() throws InterruptedException {
        Thread.sleep(2000);
        addCust.clickOnACustomerMenu();
    }

    @And("Click on Customers Menu Item")
    public void click_on_Customers_Menu_Item() throws InterruptedException {
        Thread.sleep(2000);
        addCust.clickOnACustomerMenuItem();
    }

    @And("Click on Add New Button")
    public void click_on_Add_New_Button() throws InterruptedException {
        Thread.sleep(2000);
        addCust.clickOnAddNew();
    }

    @Then("User can view Add New Customer Page")
    public void user_can_view_Add_New_Customer_Page() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
    }

    @When("User enter Customer Info")
    public void user_enter_Customer_Info() throws InterruptedException {
        String email = randomString(6)+"@test.com";
        addCust.setEmail(email);
        addCust.setPassword("test123");
        //Registered is default
        //The customer can not be in both 'Guest' and 'Registered' customer role
        //Add the customer to 'Guest' or 'Registered' customer role
        addCust.setCustomerRole("Guest");
        Thread.sleep(2000);
        addCust.setManagerOfVendor("Vendor 2");
        addCust.setGender("Male");
        addCust.setFirstName("Arun");
        addCust.setLastName("Jain");
        addCust.setDOB("8/4/1988"); //format: dd/MM/YYYY
        addCust.setCompanyName("busyQA");
        addCust.setAdminComment("This is for testing................");
    }

    @And("Click on Save Button")
    public void click_on_Save_Button() throws InterruptedException {
        addCust.clickOnSave();
        Thread.sleep(2000);
    }

    @Then("User can view Confirmation Message {string}")
    public void user_can_view_Confirmation_Message(String string) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
    }

    //Steps for searching an employee using EmailID........
    @When("Enter Customer EmailID")
    public void enter_Customer_EmailID() {
        searchCust = new SearchCustomerPage(driver);
        searchCust.setEmail("victoria_victoria@nopCommerce.com");
    }

    @When("Click on Search Button")
    public void click_on_Search_Button() throws InterruptedException {
        searchCust.clickSearch();
        Thread.sleep(2000);
    }

    @Then("User should found Email in the Search Table")
    public void user_should_found_Email_in_the_Search_Table() {
        boolean status = searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
        Assert.assertEquals(true, status);
    }

    //Steps for searching an employee using Name........
    @When("Enter Customer FirstName")
    public void enter_Customer_FirstName() {
        searchCust = new SearchCustomerPage(driver);
        searchCust.setFirstName("Victoria");
    }

    @When("Enter Customer LastName")
    public void enter_Customer_LastName() {
        searchCust.setLastName("Terces");
    }

    @Then("User should found Name in the Search Table")
    public void user_should_found_Name_in_the_Search_Table() {
        boolean status = searchCust.searchCustomerByName("Victoria Terces");
        Assert.assertEquals(true, status);
    }
}
