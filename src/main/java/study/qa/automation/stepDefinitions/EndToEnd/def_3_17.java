package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_17 {
    @When("^I maximize window$")
    public void iMaximizeWindow() throws Throwable {
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        Dimension maxWindowSize = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
        getDriver().manage().window().setPosition(new Point(0,0));
        getDriver().manage().window().setSize(maxWindowSize);
    }

    @And("^I select Multiple-choice type for Question \"([^\"]*)\"$")
    public void iSelectMultipleChoiceTypeForQuestion(String QuestionNumber) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), '"+QuestionNumber+"')]/../../..//*[contains(text(),'Multiple-Choice')]/..")).click();
    }

    @And("^I type text in options in Multiple question \"([^\"]*)\"$")
    public void iTypeTextInOptionsInMultipleQuestion(String QuestionNumber) throws Throwable {
        if (QuestionNumber.equalsIgnoreCase("one")) {
            //Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 1*']")).sendKeys("Determining the test approach");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 2*']")).sendKeys("Preparing test specifications");
        } else if (QuestionNumber.equalsIgnoreCase("two")) {
            //Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 1*']")).sendKeys("Determining the test approach");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 2*']")).sendKeys("Preparing test specifications");
        } else if (QuestionNumber.equalsIgnoreCase("three")) {
            //Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("Should be able to understand a functional specification or requirements document");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("Is highly motivated to find faults");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[@placeholder='Option 3*']")).sendKeys("Should be able to understand the source code");
        } else if (QuestionNumber.equalsIgnoreCase("four")) {
            //Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("textOfoption1");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("textOfoption2");
        } else if (QuestionNumber.equalsIgnoreCase("five")) {
            //Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("textOfoption1");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("textOfoption2");
        } else if (QuestionNumber.equalsIgnoreCase("six")) {
            //Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("textOfoption1");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("textOfoption2");
        }
    }

    @And("^I push button Add Option for Question \"([^\"]*)\"$")
    public void iPushButtonAddOptionForQuestion(String QuestionNumber) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), '"+QuestionNumber+"') ]/../../..//*[contains(text(),'Add Option')]/..")).click();
    }

    @And("^I select correct answer for Multiple question \"([^\"]*)\"$")
    public void iSelectCorrectAnswerForMultipleQuestion(String QuestionNumber) throws Throwable {
        if (QuestionNumber.equalsIgnoreCase("one")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[contains(@class,'mat-checkbox-inner')]")).click();
        } else if (QuestionNumber.equalsIgnoreCase("two")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[contains(@class,'mat-checkbox-inner')]")).click();
        } else if (QuestionNumber.equalsIgnoreCase("three")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[contains(@class,'mat-checkbox-inner')]")).click();
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[contains(text(), 'Option 2*')]/../../../../../..//*[contains(@class,'mat-checkbox-inner')]")).click();
        } else if (QuestionNumber.equalsIgnoreCase("four")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[contains(@class,'mat-checkbox-inner')]")).click();
        } else if (QuestionNumber.equalsIgnoreCase("five")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[contains(@class,'mat-checkbox-inner')]")).click();
        } else if (QuestionNumber.equalsIgnoreCase("six")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[contains(@class,'mat-checkbox-inner')]")).click();
        }
    }

    @And("^I choose \"([^\"]*)\" points for question \"([^\"]*)\"$")
    public void iChoosePointsForQuestion(String points, String question) throws Throwable {
        WebElement element = getDriver().findElement(By.xpath("//*[contains(text(), '"+question+"') ]/../../..//*[@class='mat-slider-thumb']"));
        Actions actions = new Actions(getDriver());
        if (points.equalsIgnoreCase("1")) {
            actions.clickAndHold(element).moveByOffset(-50,0).release().perform();
        } else if (points.equalsIgnoreCase("2")) {
            actions.clickAndHold(element).moveByOffset(-45,0).release().perform();
        } else if (points.equalsIgnoreCase("3")) {
            actions.clickAndHold(element).moveByOffset(-30,0).release().perform();
        } else if (points.equalsIgnoreCase("4")) {
            actions.clickAndHold(element).moveByOffset(-20,0).release().perform();
        } else if (points.equalsIgnoreCase("6")) {
            actions.clickAndHold(element).moveByOffset(20,0).release().perform();
        } else if (points.equalsIgnoreCase("7")) {
            actions.clickAndHold(element).moveByOffset(30,0).release().perform();
        } else if (points.equalsIgnoreCase("8")) {
            actions.clickAndHold(element).moveByOffset(45,0).release().perform();
        } else if (points.equalsIgnoreCase("9")) {
            actions.clickAndHold(element).moveByOffset(70,0).release().perform();
        } else if (points.equalsIgnoreCase("10")) {
            actions.clickAndHold(element).moveByOffset(80,0).release().perform();
        }
    }

    @And("^I click on Show-Stopper question for question \"([^\"]*)\"$")
    public void iClickOnShowStopperQuestionForQuestion(String question) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'"+question+"')]/../../..//*[contains(text(),'Show-Stopper')]/..")).click();
    }

    @And("^I click on Include Other text area option for question \"([^\"]*)\"$")
    public void iClickOnIncludeOtherTextAreaOptionForQuestion(String question) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'"+question+"')]/../../..//*[contains(text(),'Other')]/..")).click();
    }

    @And("^I push button Create New Assignment$")
    public void iPushButtonCreateNewAssignment() throws Throwable {
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Assignment')]")).click();
    }

    @And("^I select student name \"([^\"]*)\" for Give Assignment$")
    public void iSelectStudentNameForGiveAssignment(String student) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'ABCD')]/..")).click();
        Thread.sleep(1000);
    }

    @And("^I click on My Assignments$")
    public void iClickOnMyAssignments() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
        Thread.sleep(1000);
    }

    @And("^assignment \"([^\"]*)\" should be displayed$")
    public void assignmentShouldBePresent(String assignment) throws Throwable {

        //assertThat(getDriver().findElements(By.xpath("//td[contains(text(),'"+assignment+"')]"))).hasSize(1);
        assertThat(getDriver().findElement(By.xpath("//td[contains(text(),'"+assignment+"')]")).isDisplayed()).isTrue();
    }

    @And("^I delete assignment name \"([^\"]*)\"$")
    public void iDeleteAssignmentName(String assignment) throws Throwable {
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'"+assignment+"')]/..//button")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Delete Assignment')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
        Thread.sleep(1000);
    }

    @And("^I delete quiz name \"([^\"]*)\"$")
    public void iDeleteQuizName(String quiz) throws Throwable {
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'"+quiz+"')]/../..")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'"+quiz+"')]/../../..//span[contains(text(),'Delete')]/..")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@class='mat-button mat-warn']")).click();
        Thread.sleep(1000);
    }
}