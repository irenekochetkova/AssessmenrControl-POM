package study.qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
import java.util.Map;

import static study.qa.automation.utils.TestContext.getData;
import static study.qa.automation.utils.TestContext.getDriver;

public class MyAssignments extends Page {

    public MyAssignment clickGoAssign() throws FileNotFoundException {
        Map<String, String> quiz = getData("3.15_quiz");
        WebElement elQuiz = getDriver().findElement(By.xpath("//tr//td[contains(text(),'" + quiz.get("title") + "')]/../td/a"));
        click(elQuiz);
        return new MyAssignment();
    }
}
