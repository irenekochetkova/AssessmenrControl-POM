package study.qa.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

import static study.qa.automation.utils.TestContext.getData;

public class LogIn extends Page {
    public LogIn() {
        setUrl("http://local.school.portnov.com:4520/#/login");
    }

    @FindBy(xpath = "//input[contains(@id,'mat-input')][@placeholder='Email *']")
    private WebElement email;

    @FindBy(xpath = "//input[contains(@id,'mat-input')][@placeholder='Password *']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(@class,'mat-raised')]")
    private WebElement signIn;

    @FindBy(xpath = "//simple-snack-bar")
    private WebElement message;

    @FindBy(xpath = "//simple-snack-bar[contains(text(),'Authentication failed')]")
    private WebElement textMessage;

    public HomePage fillForm(String valueEmail, String valuePassword) {
        email.sendKeys(valueEmail);
        password.sendKeys(valuePassword);
        click(signIn);
        return new HomePage();
    }

    public String verifyInvisiblePassword() {
        return password.getText();
    }

    // 1 method
    public void verifyError() {
        waitForElement(message);
        message.isDisplayed();
    }

    // 2 method
    public String verifyMessage() {
        waitForElement(textMessage);
        return textMessage.getText();
    }

    public String verifyTypeOfElement() {
        return password.getAttribute("type");
    }

    public LogIn loginForm(Map<String, String> valueLogIn) {
        email.sendKeys(valueLogIn.get("email"));
        password.sendKeys(valueLogIn.get("password"));
        return this;
    }

    public HomePage clickSignIn() {
        signIn.click();
        return new HomePage();
    }



}
