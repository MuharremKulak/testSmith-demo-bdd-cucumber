package com.academy.muharremkulak.pages;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//a[@routerlink = '/auth/register']")
    protected WebElement registerYourAccountLink;

    @FindBy(id = "email")
    protected WebElement emailInput;

    @FindBy(id = "password")
    protected WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Login']")
    protected WebElement loginLink;

    @FindBy(xpath = "//h3[text()='Login']")
    protected WebElement loginHeader;

    @FindBy(xpath = "//div[@class='container']/app-login/div/div/div/h3")
    protected WebElement loginTitle;

    @FindBy(xpath = "//h1[text()='My account']")
    protected WebElement myAccountHeader;

    @FindBy(xpath = "//div[@class='alert alert-danger']/div")
    protected WebElement errorMessage;


    public void clickOnRegisterYourAccountButton(){
        registerYourAccountLink.click();
    }

    public void verifyLoginHeader(){
        String actualHeader = loginHeader.getText();
        String expectedHeader = "Login";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    public void verifyLoginTitle(){
        String actualTitle = loginTitle.getText();
        String expectedTitle = "Login";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void enterEmail(String email){
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        loginLink.click();
    }

    public void verifyLoginSuccessful(){
        String actualHeader = myAccountHeader.getText();
        String expectedHeader = "My account";
        Assert.assertEquals("Login is not successful",expectedHeader, actualHeader);
    }

    public void enterInvalidPassword(String invalidPassword){
        passwordInput.sendKeys(invalidPassword);
    }

    public void verifyErrorMessage(){
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Invalid email or password";
        Assert.assertEquals("Error message is not the same!",expectedErrorMessage, actualErrorMessage);
    }






}
