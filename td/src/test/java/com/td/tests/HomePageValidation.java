package com.td.tests;

import com.bd.base.TestBase;
import com.core.report.ExtentTestManager;
import com.td.pages.HomePage;
import com.td.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomePageValidation extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(HomePageValidation.class);


    @Test
    public void validateUserCanViewAndClickOnAllHeaderButtons() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.validateAndClickOnAccountButton();
        loginPage.clickOnBackButton();


        homePage.validateAndClickOnTransferButton();
        ExtentTestManager.log("Transfer button has  clicked from homepage", LOGGER);
        loginPage.clickOnBackButton();
        ExtentTestManager.log("Back button has  clicked", LOGGER);

        homePage.validateAndClickOnDepositButton();
        ExtentTestManager.log("Deposit button has clicked from homepage", LOGGER);
        loginPage.clickOnBackButton();
        ExtentTestManager.log("Back button clicked", LOGGER);

        homePage.validateAndClickOnSendMoneyButton();
        ExtentTestManager.log("Send Money clicked from homepage", LOGGER);
        loginPage.clickOnBackButton();
        ExtentTestManager.log("Back button clicked", LOGGER);

        homePage.validateAndClickOnPayABillButton();
        ExtentTestManager.log("Pay a bill clicked from homepage", LOGGER);
        loginPage.clickOnBackButton();
        ExtentTestManager.log("Back button clicked", LOGGER);
    }
}

