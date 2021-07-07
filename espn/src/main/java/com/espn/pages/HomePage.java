package com.espn.pages;

import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
    private Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(id = "com.espn.score_center:id/btn_login")
    private WebElement loginButton;
    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.tdbank:id/alert_view']")
    private WebElement message;
    @FindBy(id = "BtnSubmit")
    private WebElement loginBtn;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement allow;

    public void clickOnLogin() {
        Assert.assertTrue(loginButton.isDisplayed());
        loginButton.click();
        ExtentTestManager.log("Login button has  dispalyed", LOGGER);
    }

    public void clickAllow() {
        allow.click();
        ExtentTestManager.log("Allow button has  clicked", LOGGER);
    }
}
