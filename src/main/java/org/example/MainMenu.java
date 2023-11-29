package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu {
    WebDriver driver;

    MainMenu(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "react-burger-menu-btn")
    WebElement UserMenu;

    public void MainMenu_Click()
    {
        UserMenu.click();
    }

}
