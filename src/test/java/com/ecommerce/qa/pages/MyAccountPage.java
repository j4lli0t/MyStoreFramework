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
    private By UserPasswd = By.id("passwd");
    private By LoginButton = By.id("SubmitLogin");
    private By Logout = By.className("logout");
    private By alertMessage = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");

    public void fillUserInput(String userInput)
    {
        driver.findElement(UserInput).sendKeys(userInput);
    }

    public void fillUserPasswd(String userPasswd)
    {
        driver.findElement(UserPasswd).sendKeys(userPasswd);
    }

    public void clickSingButton()
    {
        driver.findElement(LoginButton).click();
    }

    public void Logout()
    {
       driver.findElement(Logout).click();
    }

    public String getTextAlertMessage()
    {
        return driver.findElement(alertMessage).getText();
    }

}
