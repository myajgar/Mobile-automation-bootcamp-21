package com.espn.pages;

import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
    private static final Logger logger = Logger.getLogger(HomePage.class);
    @FindBy(id = "com.espn.score_center:id/btn_login")
    private WebElement loginBtn;
    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.tdbank:id/alert_view']")
    private WebElement message;
    @FindBy(id = "BtnSubmit")
    private WebElement loginbtn;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement allow;

    public void clickOnLogin() {
        Assert.assertTrue(loginBtn.isDisplayed());
        loginBtn.click();
        ExtentTestManager.log("Login button has been dispalyed", logger);
    }

    public void clickAllow() {
        allow.click();
        ExtentTestManager.log("Allow button has been clicked", logger);
    }

}

