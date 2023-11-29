package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackHome {
    WebDriver driver;

    BackHome(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "back-to-products")
    WebElement BackHome;

    public void BackHome_Click()
    {
        BackHome.click();
    }
}
