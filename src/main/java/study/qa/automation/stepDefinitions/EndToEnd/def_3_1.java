package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.createUser;
import static study.qa.automation.utils.TestContext.getDriver;
public class def_3_1 {


    @Given("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String page) {
        if (page.equalsIgnoreCase("login")) {
            getDriver().get("http://local.school.portnov.com:4520/#/login");
        }
        else if (page.equalsIgnoreCase("registration")) {
            getDriver().get("http://local.school.portnov.com:4520/#/registration");
        }
        else {
            System.out.println("Not supported url");
        }
    }

    @Then("^I push Register now button$")
    public void iPushRegisterNowButton() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Now')]")).click();
        Thread.sleep(1000);
    }

    @And("^I push button Register me$")
    public void iPushButtonRegisterMe() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Me')]")).click();
        Thread.sleep(2000);
    }

    @Then("^I receive message You've been registered$")
    public void iReceiveMessageYouVeBeenRegistered() throws Throwable {
        assertThat(getDriver().findElement(By.xpath("//h4[contains(text(),'Registered')]")).isDisplayed()).isTrue();
    }

    @And("^I fill out Registration form$")
    public void iFillOutRegistrationForm() throws FileNotFoundException, InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(createUser().get("lName"));
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(createUser().get("fName"));
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(createUser().get("email"));
        getDriver().findElement(By.xpath("//input[@placeholder='Group Code']")).sendKeys(createUser().get("groupCode"));
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(createUser().get("psw"));
        getDriver().findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(createUser().get("confirmPsw"));

    }

    //    Get name from Yaml file.
    @And("^select Student from Students List$")
    public void selectStudentFromStudentsList() throws Throwable {
//        String nameStudent = createUser().get("fName" + "lName");
        String fullName = createUser().get("wholeName");
        System.out.println(fullName);
        getDriver().findElement(By.xpath("//*[contains(text(), '" +fullName+ "')]")).click();
        Thread.sleep(1000);
    }


    @And("^I delete student$")
    public void iDeleteStudent() throws Throwable {
        getDriver().findElement(By.xpath("//button//*[contains(text(), 'settings')]/../..")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@role='menuitem'][4]")).click();
        Thread.sleep(1000);
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[contains(text(), 'Delete')]")).isDisplayed());
        getDriver().findElement(By.xpath("//*[contains(text(), 'Delete')]")).click();
        Thread.sleep(1000);
    }
//    @And("^I push on \"([^\"]*)\" button$")
//    public void iPushOnButton(String arg0) throws Throwable {
//        getDriver().findElement(By.xpath("//*[contains(text(), 'Back to')]")).click();
//    }
//
//    @And("^click on User's Management on the left navigational panel$")
//    public void clickOnUserSManagementOnTheLeftNavigationalPanel() throws Throwable {
//        getDriver().findElement(By.xpath("//*[contains(text(),'Management')]")).click();
//        Thread.sleep(2000);
//    }

}


