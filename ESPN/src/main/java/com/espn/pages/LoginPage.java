package com.espn.pages;

import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
    private final Logger logger = Logger.getLogger(LoginPage.class);
    @FindBy(xpath = "//android.widget.EditText[@bounds='[42,167][679,244]']")
    private WebElement userName;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='InputPassword']")
    private WebElement passwordtxt;
    @FindBy(xpath = "//android.widget.Button[@text='Log In']")
    private WebElement loginbtn;
    @FindBy(xpath = "//android.view.View[@bounds='[77,201][645,272]']")
    private WebElement loginError;

    public void typeInFields(String name, String password) {
        Assert.assertTrue(userName.isDisplayed() && userName.isEnabled());
        userName.sendKeys(name);
        ExtentTestManager.log("User Name Typed In", logger);
        Assert.assertTrue(passwordtxt.isDisplayed() && passwordtxt.isEnabled());
        passwordtxt.sendKeys(password);
        ExtentTestManager.log("Password typed in", logger);

    }

    public void clickLogin() {
        Assert.assertTrue(loginbtn.isDisplayed());
        loginbtn.click();
        ExtentTestManager.log("Login button has been clicked", logger);
    }

    public void loginValidation() {
        Assert.assertTrue(loginError.isDisplayed());
        ExtentTestManager.log("User cannot Login in With invalid Credentiels", logger);
    }
}
