package com.espn.tests;

import com.core.TestBase;
import com.espn.pages.HomePage;
import com.espn.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeMethod
    private void pages() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);

    }

    @Test
    public void validateUsercannotLoginWithInvalidData() {

        homePage.clickAllow();
        homePage.clickOnLogin();
        loginPage.typeInFields("ajgar", "abc123");
        loginPage.clickLogin();
        loginPage.loginValidation();

    }
}

