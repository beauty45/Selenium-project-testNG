package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
    WebDriver driver;

    ShoppingCart(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(className = "shopping_cart_link")
    WebElement cart_list;
    @FindBy(id = "checkout")
    WebElement checkout;

    public void ShoppingCart_Click()
    {
        cart_list.click();
        checkout.click();
    }
}
