package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utilities.WaitHelper;

import java.util.List;

public class SearchCustomerPage {

    public WebDriver sdriver;
    WaitHelper waitHelper;

    public SearchCustomerPage(WebDriver rdriver) {
        sdriver = rdriver;
        PageFactory.initElements(rdriver,this);
        waitHelper = new WaitHelper(sdriver);
    }

    @FindBy(how = How.ID, using = "SearchEmail")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(how = How.ID, using = "SearchFirstName")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(how = How.ID, using = "SearchLastName")
    @CacheLookup
    WebElement txtLastName;

    @FindBy(how = How.ID, using = "search-customers")
    @CacheLookup
    WebElement btnSearch;

    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
    @CacheLookup
    WebElement table;

    @FindBy(how = How.XPATH, using = "//table[@role='grid']")
    @CacheLookup
    WebElement tblSearchResult;

    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody//tr")
    List<WebElement> tblRows;

    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody//tr/td")
    List<WebElement> tblColumns;

    //Action Methods
    public void setEmail(String email){
        waitHelper.waitForElement(txtEmail,20);
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void setFirstName(String fName){
        waitHelper.waitForElement(txtFirstName,20);
        txtFirstName.clear();
        txtFirstName.sendKeys(fName);
    }

    public void setLastName(String lName){
        waitHelper.waitForElement(txtLastName,20);
        txtLastName.clear();
        txtLastName.sendKeys(lName);
    }

    public void clickSearch(){
        btnSearch.click();
    }

    public int getNoOfRows(){
        return tblRows.size();
    }

    public int getNoOfColumn(){
        return tblColumns.size();
    }

    public boolean searchCustomerByEmail(String email){
        boolean flag = false;
        for(int i=1; i<=getNoOfRows(); i++){
            String emailId = table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[2]")).getText().trim();
            System.out.println(emailId); //"victoria_victoria@nopCommerce.com"
            if (emailId.equalsIgnoreCase(email)){
                flag = true;
            }
        }
        return flag;
    }

    public boolean searchCustomerByName(String name){
        boolean flag = false;
        for(int i=1; i<=getNoOfRows(); i++){
            String nameOf = table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[3]")).getText().trim();
            System.out.println(nameOf); //"Victoria Terces"
            String names[] = nameOf.split(" ");
            if ((names[0].equals(name.split(" ")[0])) && (names[1].equals(name.split(" ")[1]))){
                flag = true;
            }
        }
        return flag;
    }


}
