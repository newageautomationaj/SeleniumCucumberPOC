package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class LoginPageSteps {

    public WebDriver driver;
    public LoginPage lp;

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
}
