package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
    WebDriver driver;

    Order(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement add_item1;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement add_item2;


    public void Order_Click()
    {
        add_item1.click();
        add_item2.click();

    }


}