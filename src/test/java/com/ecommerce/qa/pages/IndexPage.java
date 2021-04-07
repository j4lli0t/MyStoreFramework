package com.ecommerce.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage
{
    private WebDriver driver;
    public IndexPage(WebDriver driver)
    {
        this.driver = driver;

    }

    //Locator for Sing in button
    By SingInButton = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");

    public void doClickSingInButton()
    {
        driver.findElement(SingInButton).click();
    }
}
