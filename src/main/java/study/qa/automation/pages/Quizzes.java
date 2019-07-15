package study.qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import static study.qa.automation.utils.TestContext.getData;
import static study.qa.automation.utils.TestContext.getWait;

public class Quizzes extends Page {

    @FindBy(xpath = "//span[contains(text(),'Create New Quiz')]")
    private WebElement quizzes;

    @FindBy(xpath = "//textarea[contains(@id,'mat-input')]")
    private List<WebElement> quizTitles;

    @FindBy(xpath = "//h5[contains(text(),'Assignments')]")
    private WebElement assignments;

    public Boolean getNewQuiz() throws FileNotFoundException {
        Map<String, String> quiz = getData("3.15_quiz");

        for (WebElement quizTitle : quizTitles) {
            if (quizTitle.getText().equals(quiz.get("title"))) {
                return true;
            }
        }
        return false;
    }

    public QuizBuilder clickNewQuiz() {
        click(quizzes);
        return new QuizBuilder();
    }

    private String oldUrl = "http://local.school.portnov.com:4520/#/quizzes";

    public Assignments clickAssignment() throws InterruptedException {
        waitForUrl(oldUrl);
        click(assignments);
        return new Assignments();
    }
}
