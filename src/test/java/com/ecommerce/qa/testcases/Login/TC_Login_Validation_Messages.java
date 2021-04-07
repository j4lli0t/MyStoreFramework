package com.ecommerce.qa.testcases.Login;
import com.ecommerce.qa.baseTest.BaseTest                 ;
import com.ecommerce.qa.pages.IndexPage;
import com.ecommerce.qa.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login_Validation_Messages extends BaseTest
{
    IndexPage index = new IndexPage(driver);
    MyAccountPage accountPage = new MyAccountPage(driver);


    @Test(priority = 1)
    public void emailIsRequired()
    {
        index.doClickSingInButton();
        accountPage.clearInput();
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"An email address required.");
    }

    @Test(priority = 2)
    public void passwdIsRequired()
    {
        accountPage.clearInput();
        accountPage.fillUserInput("qatest@gmail.com");
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"Password is required.");
    }

    @Test(priority = 3)
    public void invalidEmailWarn()
    {
        accountPage.clearInput();
        accountPage.fillUserInput("qatest");
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"Invalid email address.");
    }

    @Test(priority = 4)
    public void authenticationFailed()
    {
        accountPage.clearInput();
        accountPage.fillUserInput("qatest@gmail.com");
        accountPage.fillUserPasswd("somepasswd");
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"Authentication failed.");
    }
}

