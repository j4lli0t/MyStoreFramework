package com.ecommerce.qa.testcases.Login;

import com.ecommerce.qa.baseTest.BaseTest;
import com.ecommerce.qa.pages.IndexPage;
import com.ecommerce.qa.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login_Validation_Messages extends BaseTest
{
    IndexPage index = new IndexPage(driver);
    MyAccountPage accountPage = new MyAccountPage(driver);


    @Test
    public void emailIsRequired()
    {
        index.doClickSingInButton();
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"An email address required.");
    }

    @Test
    public void passwdIsRequired()
    {
        accountPage.fillUserInput("qatest@gmail.com");
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"Password is required.");
    }

    @Test
    public void invalidEmailWarn()
    {
        accountPage.fillUserPasswd("qatest");
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"Invalid email address.");
    }

    public void authenticationFailed()
    {
        accountPage.fillUserInput("qatest@gmail.com");
        accountPage.fillUserPasswd("somepasswd");
        accountPage.clickSingButton();
        Assert.assertEquals(accountPage.getTextAlertMessage(),"Authentication failed.");
    }
}

