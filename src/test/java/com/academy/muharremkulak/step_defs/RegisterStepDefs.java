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

public class RegisterStepDefs {

    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;


    @Given("user am on home page")
    public void user_am_on_home_page(){
        driver = Driver.getDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        driver.get(ConfigReader.getProperty("url"));
    }

    @And("user clicks on Sign in link")
    public void userClicksOnSignInLink() {
        homePage.clickSignInButton();
    }

    @When("user clicks on Register your account link")
    public void user_clicks_on_register_your_account_link() {
        loginPage.clickOnRegisterYourAccountButton();
    }
    @Then("user should be navigated to create register page")
    public void user_should_be_navigated_to_create_register_page() {
        registerPage.verifyRegistrationPage();
    }
    @And("user enters {string} in the firstname input")
    public void user_Enters_In_The_Firstname_Input(String firstName) {
        registerPage.enterFirstName(firstName);
    }
    @And("user enters {string} in the lastname input")
    public void user_Enters_In_The_Lastname_Input(String lastName) {
        registerPage.enterLastName(lastName);
    }

    @And("user enters DOB")
    public void userEntersDOB() {
        registerPage.enterDOB();
    }

    @And("user enters {string} in the address input")
    public void user_Enters_In_The_Address_Input(String address) {
        registerPage.enterAddress(address);
    }

    @And("user enters {string} in the postCode input")
    public void user_Enters_In_The_PostCode_Input(String postCode) {
        registerPage.enterPostCode(postCode);
    }

    @And("user enters {string} in the city input")
    public void user_Enters_In_The_City_Input(String city) {
        registerPage.enterCity(city);
    }

    @And("user enters {string} in the state input")
    public void user_Enters_In_The_State_Input(String state) {
        registerPage.enterState(state);
    }

    @And("user chooses country")
    public void user_Chooses_Country() {
        registerPage.chooseCountry();
    }

    @And("user enters {string} in the phone input")
    public void user_Enters_In_The_Phone_Input(String phone) {
        registerPage.enterPhoneNumber(phone);
    }

    @And("user enters {string} in the email input")
    public void user_Enters_In_The_Email_Input(String email) {
        registerPage.enterEmail(email);
    }

    @And("user enters {string} in the password input")
    public void user_Enters_In_The_Password_Input(String password) {
        registerPage.enterPassword(password);
    }

    @When("user clicks on Register your account button")
    public void user_Clicks_On_Register_Your_Account_Button() {
        registerPage.clickRegisterButton();
    }

    @Then("user should be registered successfully")
    public void user_Should_Be_Registered_Successfully() {
        loginPage.verifyLoginHeader();
    }
}
