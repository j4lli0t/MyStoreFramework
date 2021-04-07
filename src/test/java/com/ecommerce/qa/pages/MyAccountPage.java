package com.ecommerce.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage
{
    private WebDriver driver;
    public MyAccountPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locators for password,and loginButton
    private By UserInput = By.id("email");
    private By PasswdInput = By.id("passwd");
    private By LoginButton = By.id("SubmitLogin");
    private By Logout = By.className("logout");

    public void doLogin(String userInput,String passwdInput)
    {
        driver.findElement(UserInput).sendKeys(userInput);
        driver.findElement(PasswdInput).sendKeys(passwdInput);
        driver.findElement(LoginButton).click();
    }

    public void Logout()
    {
       driver.findElement(Logout).click();
    }

}
