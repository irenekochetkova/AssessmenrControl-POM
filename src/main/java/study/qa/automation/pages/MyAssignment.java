package study.qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
import java.util.Map;

import static study.qa.automation.utils.TestContext.getData;

public class MyAssignment extends Page {
    @FindBy(xpath = "//textarea[contains(@id,'mat-input')]")
    private WebElement areaAnswer;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']/..")
    private WebElement submit;

    @FindBy(xpath = "//button[@class='mat-button mat-primary']")
    private WebElement confirmSubmit;

    public MyAssignments submitAnswer() throws FileNotFoundException {
        Map<String, String> answerQuiz = getData("3.15_quiz");
        areaAnswer.sendKeys(answerQuiz.get("answer"));
        click(submit);
        click(confirmSubmit);
        return new MyAssignments();
    }
}
