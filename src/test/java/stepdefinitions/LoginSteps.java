package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DriverFactory;
import utils.ConfigReader;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    ConfigReader config = new ConfigReader();

    @Given("user is on login page")
    public void openLoginPage() {
        loginPage.open(config.getBaseUrl());
    }

    @When("user enters valid credentials")
    public void enterCredentials() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @Then("user should land on dashboard")
    public void validateLogin() {
        String url = DriverFactory.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("inventory"));
    }
}