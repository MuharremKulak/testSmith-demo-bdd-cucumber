package com.academy.muharremkulak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//div[@id='navbarSupportedContent']/ul/li[4]/a")
    protected WebElement singInLink;


    public void clickSignInButton(){
        singInLink.click();
    }


}
