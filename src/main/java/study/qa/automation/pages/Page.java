package study.qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static study.qa.automation.utils.TestContext.getDriver;
import static study.qa.automation.utils.TestContext.getExecutor;
import static study.qa.automation.utils.TestContext.getWait;


public class Page {

    private String url;

    public Page() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void open() {
        getDriver().get(url);
    }

    public String currentUrl(){ return getDriver().getCurrentUrl();}

    protected void clickWithJS(WebElement element) {
        getExecutor().executeScript("arguments[0].click();", element);
    }

    protected void click(WebElement element) {
        waitForClickable(element);
        try {
            element.click();
        } catch (WebDriverException e) {
            clickWithJS(element);
        }
    }

    private void waitForClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForUrl(String url) {
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.urlToBe(url));
    }

    public void waitForElement(WebElement element) {
        new WebDriverWait(getDriver(), 10).until(driver -> element.getText().length() > 0);
    }


}
