package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMHomePageSteps {

    WebDriver driver;

    @Given("I launch the Chrome browser")
    public void i_launch_the_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akjain.TEEMWURK\\IdeaProjects\\SeleniumCucumberPOC\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open OrangeHRM Home Page")
    public void i_open_OrangeHRM_Home_Page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        boolean status = driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @And("Close browser")
    public void close_browser() {
        driver.close();
    }

}
