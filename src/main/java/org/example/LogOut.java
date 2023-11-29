package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
    WebDriver driver;
    LogOut(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //@FindBy(id = "add-to-cart-sauce-labs-backpack")
   @FindBy(id = "logout_sidebar_link")
   //@FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
   //@FindBy(className = "bm-item menu-item")
    WebElement UserLogOut;

    public void LogOut_Click()

    {
        UserLogOut.click();
    }
}
