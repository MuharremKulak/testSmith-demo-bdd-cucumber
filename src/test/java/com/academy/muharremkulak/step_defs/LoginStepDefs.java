package com.academy.muharremkulak.step_defs;

import com.academy.muharremkulak.config.ConfigReader;
import com.academy.muharremkulak.driver.Driver;
import com.academy.muharremkulak.pages.HomePage;
import com.academy.muharremkulak.pages.LoginPage;
import com.academy.muharremkulak.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {

    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = Driver.getDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        driver.get(ConfigReader.getProperty("loginUrl"));
    }

    @When("user enters a valid email {string}")
    public void user_enters_a_valid_email(String email) {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail(email);
    }

    @And("user enters a valid password {string}")
    public void user_enters_a_valid_password(String password) {
        loginPage.enterPassword(password);
    }

    @And("user clicks on the login button")
    public void user_clicks_on_the_log_in_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        loginPage.verifyLoginSuccessful();
    }

    @When("user enters a valid username {string}")
    public void user_enters_a_valid_username(String email) {
        loginPage.enterEmail(email);
    }

    @And("user enters a invalid password {string}")
    public void user_enters_a_invalid_password(String invalidPassword) {
        loginPage.enterInvalidPassword(invalidPassword);
    }

    @And("user clicks on the login link")
    public void user_clicks_on_the_login_link() {
        loginPage.clickLoginButton();
    }

    @Then("user should be error message")
    public void userShouldBeErrorMessage() {
        loginPage.verifyErrorMessage();
    }
}
