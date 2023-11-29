package org.example;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    WebDriver driver;

    @BeforeTest
    public void Check() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


    }

    //Login
    @Test(priority = 1)
    public  void login() throws InterruptedException
    {
        Login  L1 = new Login(driver);
        L1.Login_Click("standard_user", "secret_sauce");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void Order() throws InterruptedException {
        Order O = new Order(driver);
        O.Order_Click();
        Thread.sleep(2000);

    }
    @Test(priority = 3)
    public void ShoppingCart() throws InterruptedException{
        ShoppingCart S = new ShoppingCart(driver);
        S.ShoppingCart_Click();
        Thread.sleep(2000);

    }
    @Test(priority = 4)
    public void ConfirmOrder() throws InterruptedException{
        ConfirmOrder C = new ConfirmOrder(driver);
        C.ConfirmOrder_Click("Beauty","Akter","1207");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void Finish() throws InterruptedException{
        Finish F = new Finish(driver);
        F.Finish_Click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void BackHome() throws InterruptedException{

        BackHome BH = new BackHome(driver);
        BH.BackHome_Click();
        Thread.sleep(2000);

    }
    @Test(priority = 7)
    public void MainMenu() throws InterruptedException
    {
        MainMenu M = new MainMenu(driver);
        M.MainMenu_Click();
        Thread.sleep(3000);

    }

    @Test(priority = 8)
    public void LogOut()
    {
        LogOut L = new LogOut(driver);
        L.LogOut_Click();

    }



}