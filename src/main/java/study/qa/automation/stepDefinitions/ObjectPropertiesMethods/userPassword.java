package study.qa.automation.stepDefinitions.ObjectPropertiesMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class userPassword {
    @And("^I type First Name \"([^\"]*)\"$")
    public void iTypeFirstName(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Last Name \"([^\"]*)\"$")
    public void iTypeLastName(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Group Code \"([^\"]*)\"$")
    public void iTypeGroupCode(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Group Code']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

        @And("^I type Confirm Password \"([^\"]*)\"$")
    public void iTypeConfirmPassword(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Confirm Password']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^Click on Register Now button$")
    public void clickOnRegisterNowButton() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Now')]")).click();
        Thread.sleep(2000);
    }

    @Then("^an error message \"([^\"]*)\" for password field is displayed$")
    public void anErrorMessageForPasswordFieldIsDisplayed(String arg0) throws Throwable {
        assertThat(getDriver().findElement(By.xpath("//*[contains(text(),'This field is required')]")).isDisplayed()).isTrue();
        Thread.sleep(2000);
    }

    @Then("^Message \"([^\"]*)\" appears$")
    public void messageAppears(String arg0) throws Throwable {
        assertThat(getDriver().findElement(By.xpath("//*[contains(text(),'" + arg0 + "')]")).isDisplayed()).isTrue();
        Thread.sleep(2000);
    }


    @Then("^Message \"([^\"]*)\" displayed$")
    public void messageDisplayed(String arg0) throws Throwable {
        assert (getDriver().findElement(By.xpath("//*[contains(text(),'Too short. Should be at least 5 characters')]"))).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("^an error message \"([^\"]*)\" for password field displayed$")
    public void anErrorMessageForPasswordFieldDisplayed(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*[contains(text(),'Whitespaces are not allowed')]"))).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("^an error message \"([^\"]*)\" for confirm password field should displayed$")
    public void anErrorMessageForConfirmPasswordFieldShouldDisplayed(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*[contains(text(),'Entered passwords should match')]"))).isDisplayed();
        Thread.sleep(1000);

    }

    @Then("^error message \"([^\"]*)\" should appears$")
    public void errorMessageShouldAppears(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*contains(text(),'" + arg0 + "')]"))).isDisplayed();
        Thread.sleep(1000);

    }

    @And("^Print \"([^\"]*)\" of test case$")
    public void printOfTestCase(String arg0) throws Throwable {

        System.out.println(arg0);
        System.out.println();
    }


}
