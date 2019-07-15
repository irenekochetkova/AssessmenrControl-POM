package study.qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static study.qa.automation.utils.TestContext.getWait;

public class HomePage extends Page {

    @FindBy(xpath = "//a[contains(@href,'quizzes')]")
    private WebElement quiz;

    @FindBy(xpath = "//h5[contains(text(),'My Assignments')]")
    private WebElement assignments;

    @FindBy(xpath = "//h5[contains(text(),'Submissions')]/..")
    private WebElement submissions;

    private String newUrl = "http://local.school.portnov.com:4520/#/home";

    public String getNewUrl() {
        waitForUrl(newUrl);
        return currentUrl();
    }

    public Quizzes clickQuizes() {
        click(quiz);
        return new Quizzes();
    }

    public MyAssignments clickAssingments() {
        click(assignments);
        return new MyAssignments();
    }

    public SubmissionQuiz clickSubmission() {
        click(submissions);
        return new SubmissionQuiz();
    }

}
