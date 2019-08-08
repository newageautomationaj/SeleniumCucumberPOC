package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

    public WebDriver adriver;

    public AddCustomerPage(WebDriver rdriver) {
        adriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By lnkCustomers_Menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
    By lnkCustomers_Menu_Item = By.xpath(".//li[1]/a[@class='menu-item-link']//span[@class='menu-item-title'][contains(text(),'Customers')]");

    By btn_AddNew = By.xpath("//a[@class='btn bg-blue']");
    By btn_Save = By.xpath("//button[@name='save']");

    By txt_Email = By.xpath("//input[@id='Email']");
    By txt_Password = By.xpath("//input[@id='Password']");
    By txt_FirstName = By.xpath("//input[@id='FirstName']");
    By txt_LastName = By.xpath("//input[@id='LastName']");
    By txt_CompanyName = By.xpath("//input[@id='Company']");
    By txt_DOB = By.xpath("//input[@id='DateOfBirth']");

    By txt_AdminComment = By.xpath("//textarea[@id='AdminComment']");

    By txt_CustomerRole = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");

    By listItem_Administrators = By.xpath("//li[contains(text(),'Administrators')]");
    By listItem_Registered = By.xpath("//li[contains(text(),'Registered')]");
    By listItem_Guests = By.xpath("//li[contains(text(),'Guests')]");
    By listItem_Vendors = By.xpath("//li[contains(text(),'Vendors')]");

    By drp_MagOfVendor = By.xpath("//select[@id='VendorId']");

    By rd_MaleGender = By.id("Gender_Male");
    By rd_FemaleGender = By.id("Gender_Female");

    //Action Methods
    public String getPageTitle(){
        return adriver.getTitle();
    }

    public void clickOnAddNew(){
        adriver.findElement(btn_AddNew).click();
    }

    public void clickOnACustomerMenu(){
        adriver.findElement(lnkCustomers_Menu).click();
    }

    public void clickOnACustomerMenuItem(){
        adriver.findElement(lnkCustomers_Menu_Item).click();
    }

    public void setEmail(String email){
        adriver.findElement(txt_Email).sendKeys(email);
    }

    public void setPassword(String password){
        adriver.findElement(txt_Password).sendKeys(password);
    }

    public void setCustomerRole(String role) throws InterruptedException {
        if (!role.equals("Vendors")){
            adriver.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_taglist']/li//span[@class='k-icon k-delete']")).click();
        }

        adriver.findElement(txt_CustomerRole).click();

        WebElement listItems;

        Thread.sleep(2000);

        if (role.equals("Administrators")){
            listItems = adriver.findElement(listItem_Administrators);
        }else if (role.equals("Guests")){
            listItems = adriver.findElement(listItem_Guests);
        }else if (role.equals("Registered")){
            listItems = adriver.findElement(listItem_Registered);
        }else if (role.equals("Vendors")){
            listItems = adriver.findElement(listItem_Vendors);
        }else {
            listItems = adriver.findElement(listItem_Guests);
        }

        listItems.click();
        Thread.sleep(2000);

        /*JavascriptExecutor js = (JavascriptExecutor)adriver;
        js.executeScript("arguments[0].click()", listItems);*/
    }

    public void setManagerOfVendor(String value){
        Select drp = new Select(adriver.findElement(drp_MagOfVendor));
        drp.selectByVisibleText(value);
    }

    public void setGender(String gender){
        if (gender.equalsIgnoreCase("Male")){
            adriver.findElement(rd_MaleGender).click();
        }else if (gender.equalsIgnoreCase("Female")){
            adriver.findElement(rd_FemaleGender).click();
        }else{
            adriver.findElement(rd_MaleGender).click();
        }
    }

    public void setFirstName(String fName){
        adriver.findElement(txt_FirstName).sendKeys(fName);
    }

    public void setLastName(String lName){
        adriver.findElement(txt_LastName).sendKeys(lName);
    }

    public void setCompanyName(String cName){
        adriver.findElement(txt_CompanyName).sendKeys(cName);
    }

    public void setDOB(String dob){
        adriver.findElement(txt_DOB).sendKeys(dob);
    }

    public void setAdminComment(String adminComment){
        adriver.findElement(txt_AdminComment).sendKeys(adminComment);
    }

    public void clickOnSave(){
        adriver.findElement(btn_Save).click();
    }


}
