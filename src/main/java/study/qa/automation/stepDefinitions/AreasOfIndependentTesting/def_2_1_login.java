package study.qa.automation.stepDefinitions.AreasOfIndependentTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import study.qa.automation.pages.HomePage;
import study.qa.automation.pages.LogIn;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class def_2_1_login {
    @Given("^I navigate to \"([^\"]*)\" obj_page$")
    public void iNavigateToObj_page(String page) throws Throwable {
        new LogIn().open();
    }


    @Then("^I fill out \"([^\"]*)\" and \"([^\"]*)\" form the login page$")
    public void iFillOutAndFormTheLoginPage(String valueEmail, String valuePassword) throws Throwable {
        new LogIn().fillForm(valueEmail, valuePassword);
    }

    @And("^I verify the \"([^\"]*)\" is invisible$")
    public void iVerifyTheIsInvisible(String passwordValue) throws Throwable {
        String actualResult = new LogIn().verifyInvisiblePassword();
        assertThat(actualResult).doesNotContain(passwordValue);
    }

    @And("^I verify homePage is opened$")
    public void iVerifyHomePageIsOpened() throws Throwable {
        String actualUrl = new HomePage().getNewUrl();
        System.out.println("link" + actualUrl);
        assertThat(actualUrl).contains("home");
    }


    @And("^I verify error massage \"([^\"]*)\"$")
    public void iVerifyErrorMassage(String error) throws Throwable {
        // 1 method
//        new LogIn().verifyError();

        // 2 method
        String actualMessage = new LogIn().verifyMessage();
        assertThat(actualMessage).contains(error);
    }

    @And("^I verify type attribute for password$")
    public void iVerifyTypeAttributeForPassword() throws Throwable {
        String actualType = new LogIn().verifyTypeOfElement();
        assertThat(actualType).isEqualTo("password");
    }
}
