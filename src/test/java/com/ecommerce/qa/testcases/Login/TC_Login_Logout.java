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
    public void Login()
    {
        index.doClickSingInButton();
        accountPage.doLogin("qatest@gmail.com","test12345");
    }

    @Test
    public void Logout()
    {
        accountPage.Logout();
    }

}
