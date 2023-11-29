
package org.example;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder {
    WebDriver driver;
    ConfirmOrder(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "first-name")
    WebElement First_name;
    @FindBy(id = "last-name")
    WebElement Last_name;
    @FindBy(id = "postal-code")
    WebElement Postal_code;

    @FindBy(id = "continue")
    WebElement Continue;

    public void ConfirmOrder_Click(String fname, String lname, String code)
    {
        First_name.sendKeys(fname);
        Last_name.sendKeys(lname);
        Postal_code.sendKeys(code);
        Continue.click();
    }

}
