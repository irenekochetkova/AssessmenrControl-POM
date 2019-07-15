package study.qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
import java.util.Map;

import static study.qa.automation.utils.TestContext.getData;
import static study.qa.automation.utils.TestContext.getDriver;

public class SubmissionQuiz extends Page {

    public boolean verifySubmission() throws FileNotFoundException {
        Map<String, String> quiz = getData("3.15_quiz");
        Map<String, String> user = getData("student");
        WebElement titleQuiz = getDriver().findElement(By.xpath("//tr//td[contains(text(),'"+ quiz.get("title") +"')]/.."));
        WebElement nameStudent = getDriver().findElement(By.xpath("//tr//td[contains(text(),'"+ user.get("name") +"')]/.."));
        if (titleQuiz.isDisplayed() && nameStudent.isDisplayed()) {
            return true;
        } else {
            return false;
        }

    }
}
