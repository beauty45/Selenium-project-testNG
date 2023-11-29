package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;
    Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //Get locator

    //@FindBy(id = "user-name")
    @FindBy(xpath = "//input[@name=\"user-name\"]")
    WebElement username;

    // @FindBy(id = "password")

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement userPassword;


    //@FindBy(id = "login-button")
    @FindBy(id = "login-button")
    WebElement userLogin;
    //implement method
    public void Login_Click(String name,String pass)

    {
        username.sendKeys(name);
        userPassword.sendKeys(pass);
        userLogin.click();


    }
}

