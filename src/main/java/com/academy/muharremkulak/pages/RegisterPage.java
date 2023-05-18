package com.academy.muharremkulak.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    protected WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "first_name")
    protected WebElement firstNameInput;
    @FindBy(id = "last_name")
    protected WebElement lastNameInput;
    @FindBy(id = "dob")
    protected WebElement dobInput;
    @FindBy(id = "address")
    protected WebElement addressInput;
    @FindBy(id = "postcode")
    protected WebElement postCodeInput;
    @FindBy(id = "city")
    protected WebElement cityInput;
    @FindBy(id = "state")
    protected WebElement stateInput;
    @FindBy(id = "country")
    protected WebElement countryInput;
    @FindBy(id = "phone")
    protected WebElement phoneInput;
    @FindBy(id = "email")
    protected WebElement emailInput;
    @FindBy(id = "password")
    protected WebElement passwordInput;
    @FindBy(xpath = "//button[@data-test='register-submit']")
    protected WebElement registerButton;
    @FindBy(xpath = "//h3[text()='Customer registration']")
    protected WebElement registrationHeader;


    public void verifyRegistrationPage(){
        String actualHeader = registrationHeader.getText();
        String expectedHeader = "Customer registration";
        Assert.assertEquals("Headers not matching!",expectedHeader, actualHeader);
    }
    public void enterFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }
    public void enterDOB(){
        dobInput.sendKeys("07/17/1991");
    }
    public void enterAddress(String address){
        addressInput.sendKeys(address);
    }
    public void enterPostCode(String postCode){
        postCodeInput.sendKeys(postCode);
    }
    public void enterCity(String city){
        cityInput.sendKeys(city);
    }
    public void enterState(String state){
        stateInput.sendKeys(state);
    }
    public void chooseCountry(){
        Select select = new Select(countryInput);
        select.selectByValue("US");
    }
    public void enterPhoneNumber(String phone){
        phoneInput.sendKeys(phone);
    }
    public void enterEmail(String email){
        emailInput.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickRegisterButton(){
        registerButton.click();
    }

}
