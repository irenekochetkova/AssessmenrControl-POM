package study.qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static study.qa.automation.utils.TestContext.getDriver;

public class QuizBuilder extends Page {

    @FindBy(xpath = "//div[@class='mat-input-flex mat-form-field-flex']")
    private WebElement titleQuiz;

    @FindBy(xpath = "//input[contains(@id,'mat-input')]")
    private WebElement title;

    @FindBy(xpath = "//div[contains(@class,'controls ng-star-inserted')]//span")
    private WebElement addQuestion;

    @FindBy(xpath = "//mat-radio-button[@id='mat-radio-2']//div[@class='mat-radio-outer-circle']")
    private WebElement questionType;

    @FindBy(xpath = "//textarea[contains(@id,'mat-input')]")
    private List<WebElement> areaInputs;

    @FindBy(xpath = "//button//span[contains(text(),'Save')]")
    private WebElement buttonSave;

    private WebElement getLastQuestion() {
        int size = areaInputs.size();
        return areaInputs.get(size - 1);
    }

    public WebElement getLastQuiz(int id) {
        return getDriver().findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-" + id + "']"));
    }

    public QuizBuilder createQuiz(Map<String, String> value) {
        click(titleQuiz);
        title.sendKeys(value.get("title"));
        click(addQuestion);
        click(questionType);
        getLastQuestion().sendKeys(value.get("question"));
        click(buttonSave);
        return new QuizBuilder();
    }



}
