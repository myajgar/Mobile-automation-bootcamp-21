package com.espn.tests;

import com.bd.base.TestBase;
import com.espn.pages.HomePage;
import com.espn.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test
    public void validateUsercannotLoginWithInvalidData() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLogin();
        homePage.clickAllow();
        loginPage.typeInFields("abcd", "efgh");
        loginPage.clickLogin();
        loginPage.loginValidation();
    }


}
