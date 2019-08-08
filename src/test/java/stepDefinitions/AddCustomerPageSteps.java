package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.AddCustomerPage;

public class AddCustomerPageSteps extends BaseClass {

    /*@Then("User can view Dashboard")
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
    }*/
}
