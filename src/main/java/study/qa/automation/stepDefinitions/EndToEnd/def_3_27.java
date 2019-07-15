package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;

import static study.qa.automation.utils.TestContext.createUser;
import static study.qa.automation.utils.TestContext.getDriver;
public class def_3_27 {

    @And("^I push button create new assignment$")
    public void iPushButtonCreateNewAssignment() throws Throwable {
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary']/span[contains(text(),'Create New Assignment')]")).click();
        Thread.sleep(1000);
    }


    @And("^I click on Assignments$")
    public void iClickOnAssignments() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(1000);
    }


    @And("^I push button Give Assignment$")
    public void iPushButtonGiveAssignment() throws Throwable {
        getDriver().findElement(By.xpath("//div[@class='controls']//span[contains(text(),'Give Assignment')]")).click();
        Thread.sleep(2000);
    }

    @And("^I select student from dropdownlist$")
    public void iSelectStudentFromDropdownlist() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Give')]/../../..//*[contains(text(),'29abc')]")).click();
        Thread.sleep(2000);
    }

    @And("^I select \"([^\"]*)\" from assignment list for first quiz$")
    public void iSelectFromAssignmentListForFirstQuiz(String assignment) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Give')]/../..//*[contains(text(),'Select Quiz To Assign')]/..")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div/..//*[contains(text(),'assign1')]")).click();
        Thread.sleep(1000);

    }

    @And("^I select \"([^\"]*)\" from assignment list for second quiz$")
    public void iSelectFromAssignmentListForSecondQuiz(String assignment2) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Give')]/../..//*[contains(text(),'Select Quiz To Assign')]/..")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div/..//*[contains(text(),'assign2')]")).click();
        Thread.sleep(1000);
    }

    @And("^I push button Log Out$")
    public void iPushButtonLogOut() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);
    }

    @And("^I push button Go to Assessment for assign(\\d+)$")
    public void iPushButtonGoToAssessmentForAssign(int arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@href='/#/assessment/23465/']")).click();
        Thread.sleep(1000);
    }


    @And("^I push button Submit My Answers$")
    public void iPushButtonSubmitMyAnswers() throws Throwable {
        getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary']//span[contains(text(),'Submit My Answers')]")).click();
        Thread.sleep(1000);
    }

    @And("^I push button Go to Assessment for first quiz$")
    public void iPushButtonGoToAssessmentForFirstQuiz() throws Throwable {
        getDriver().findElement(By.xpath("//*[@href='/#/assessment/23465']//button[@class='mat-raised-button mat-primary']")).click();
        Thread.sleep(2000);

    }

    @And("^I push button Go to Assessment for second quiz$")
    public void iPushButtonGoToAssessmentForSecondQuiz() throws Throwable {
        getDriver().findElement(By.xpath("//*[@href='/#/assessment/23464']//button[@class='mat-raised-button mat-primary']")).click();
        Thread.sleep(2000);

    }

    @And("^I click on Submission$")
    public void iClickOnSubmission() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Submissions')]")).click();
        Thread.sleep(1000);
    }

    @And("^I push button Grade for first quiz$")
    public void iPushButtonGradeForFirstQuiz() throws Throwable {
        getDriver().findElement(By.xpath("//*[@href='/#/grade/23465?back=submissions/0']")).click();
        Thread.sleep(1000);
    }


    @And("^I push button Grade Save$")
    public void iPushButtonGradeSave() throws Throwable {
        getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary']//*[contains(text(),'Save')]")).click();
        Thread.sleep(2500);
    }

    @And("^I push button Grade for second quiz$")
    public void iPushButtonGradeForSecondQuiz() throws Throwable {
        getDriver().findElement(By.xpath("//*[@href='/#/grade/23464?back=submissions/0']")).click();
        Thread.sleep(2000);
    }

    @And("^I push Total Points Button \"([^\"]*)\" times$")
    public void iPushTotalPointsButtonTimes(String arg0) throws Throwable {
        if (arg0.equalsIgnoreCase("Five")) {


            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);

        } else if (arg0.equalsIgnoreCase("Four")) {


            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'+')]")).click();
            Thread.sleep(1000);

        }
    }

        @And("^I select assigned student$")
        public void iSelectAssignedStudent () throws Throwable {
            getDriver().findElement(By.xpath("//*[contains(text(),'Management')]/../../..//*[contains(text(),'29abc')]")).click();
            Thread.sleep(1010);
        }

        @And("^I push button review for first quiz$")
        public void iPushButtonReviewForFirstQuiz () throws Throwable {
            getDriver().findElement(By.xpath("//*[@href='/#/grade/23465?back=user-details%2F2957']")).click();
            Thread.sleep(1000);
        }

        @And("^I push button review for second quiz$")
        public void iPushButtonReviewForSecondQuiz ()throws Throwable {
            getDriver().findElement(By.xpath("//*[@href='/#/grade/234264?back=user-details%2F2957']")).click();
            Thread.sleep(1000);
        }

        @And("^I click on Change user's Role$")
        public void iClickOnChangeUserSRole () throws Throwable {
            getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons'][contains(text(),'school')]")).click();
            Thread.sleep(1000);
        }

        @And("^I click on Change Role$")
        public void iClickOnChangeRole () throws Throwable {
            getDriver().findElement(By.xpath("//span[contains(text(),'Change Role')]")).click();
            Thread.sleep(1000);
        }


    @And("^I push button Log Out submit$")
    public void iPushButtonLogOutSubmit()throws Throwable {
        getDriver().findElement(By.xpath("//button[@class='mat-button mat-warn']//span[contains(text(),'Log Out')]")).click();
        Thread.sleep(2000);

    }

    @And("^I type text \"([^\"]*)\" for Question first quiz$")
    public void iTypeTextForQuestionFirstQuiz(String answer) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Question 1 / 1')]/..//textarea[@placeholder='Enter your answer']")).sendKeys("abcde edfg");
        Thread.sleep(1000);
    }

    @And("^I type text \"([^\"]*)\" for Question for second quiz$")
    public void iTypeTextForQuestionForSecondQuiz(String answer) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Question 1 / 1')]/..//textarea[@placeholder='Enter your answer']")).sendKeys("abcde edfg");
        Thread.sleep(1000);
    }

    @And("^I push button go for submit$")
    public void iPushButtonGoForSubmit() throws Throwable {
        getDriver().findElement(By.xpath("//*[@aria-label='Close dialog']")).click();
        Thread.sleep(2000);
    }


    @And("^I click on Home$")
    public void iClickOnHome() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Home')]")).click();
        Thread.sleep(2500);
    }

    @And("^I reselect assigned student$")
    public void iReselectAssignedStudent() throws  Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Management')]/../../..//*[contains(text(),'Teachers')]")).click();
        Thread.sleep(1500);
        getDriver().findElement(By.xpath("//h4[contains(text(),'Vladimir Vladimirov')]")).click();
        Thread.sleep(1200);
    }
}
