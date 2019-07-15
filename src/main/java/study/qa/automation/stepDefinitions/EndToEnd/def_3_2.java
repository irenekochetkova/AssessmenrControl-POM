package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.createUser;
import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_2 {

    @And("^I push button \"([^\"]*)\"$")
    public void iPushButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Back to Login Page')]")).click();
    Thread.sleep(3000);
    }

    @And("^I click Users management$")
    public void iClickUsersManagement() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Management')]")).click();
        Thread.sleep(3000);

    }

    @And("^I change user role to teacher$")
    public void iChangeUserRoleToTeacher() throws Throwable {
        getDriver().findElement(By.xpath("//button//*[contains(text(), 'settings')]/../..")).click();
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[@role='menuitem'][2]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Change Role')]")).click();
        Thread.sleep(2000);

    }

    @Then("^I verify that user role changed to teacher$")
    public void iVerifyThatUserRoleChangedToTeacher() throws Throwable {
        String actualText = getDriver().findElement(By.xpath("//div[@class='horizontal-group user-meta']")).getText();
        assertThat(actualText).containsIgnoringCase("TEACHER");
    }

    @And("^I select list of teachers$")
    public void iSelectListOfTeachers() throws Throwable {
        getDriver().findElement(By.xpath("//div[contains(text(),'Teachers')]")).click();
        Thread.sleep(2000);
    }

    //    Get name from Yaml file.
    @And("^select Teacher from Teachers List$")
    public void selectTeacherFromTeachersList() throws Throwable {
//        String nameStudent = createUser().get("fName" + "lName");
            String fullName = createUser().get("wholeName");
            getDriver().findElement(By.xpath("//*[contains(text(), '" + fullName + "')]")).click();
            Thread.sleep(1000);
    }

    @And("^I delete Teacher$")
    public void iDeleteTeacher() throws Throwable {
        getDriver().findElements(By.xpath("//button//*[contains(text(), 'settings')]/../..")).get(0).click();
        Thread.sleep(3000);
        getDriver().findElements(By.xpath("//*[@role='menuitem'][3]")).get(0).click();
        Thread.sleep(2000);
        getDriver().findElements(By.xpath("//*[contains(text(), 'Delete')]")).get(0).click();
        Thread.sleep(2000);
    }
}
