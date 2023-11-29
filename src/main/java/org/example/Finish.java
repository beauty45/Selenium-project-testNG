package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finish {

    WebDriver driver;
    Finish(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "finish")
    WebElement Finish;

    public void Finish_Click()
    {
        Finish.click();
    }
}
