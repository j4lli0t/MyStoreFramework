package com.ecommerce.qa.testcases.Login;
import com.ecommerce.qa.baseTest.BaseTest;
import com.ecommerce.qa.pages.IndexPage;
import com.ecommerce.qa.pages.MyAccountPage;
import org.testng.annotations.Test;

public class TC_Login_Logout extends BaseTest
{
    IndexPage index = new IndexPage(driver);
    MyAccountPage accountPage = new MyAccountPage(driver);

    @Test
    public void Login() /*Method for login in the MyStore page*/
    {
        index.doClickSingInButton();
        accountPage.fillUserInput("qatest@gmail.com");
        accountPage.fillUserPasswd("test12345");
        accountPage.clickSingButton();
    }

    @Test
    public void Logout() /*Method for logout in the MyStore page*/
    {
        accountPage.Logout();
    }

}
