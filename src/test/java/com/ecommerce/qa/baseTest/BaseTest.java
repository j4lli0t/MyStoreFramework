package com.ecommerce.qa.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
    public WebDriver driver;
    public BaseTest()
    {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @BeforeTest
    public void setUp()
    {
        this.driver.get("http://automationpractice.com/index.php");
        this.driver.manage().window().maximize();

    }

    @AfterTest
    public void tearDown()
    {
        //this.driver.close();
    }

}
