package study.qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
import java.util.Map;

import static study.qa.automation.utils.TestContext.getData;
import static study.qa.automation.utils.TestContext.getDriver;

public class AssignQuiz extends Page {

    @FindBy(xpath = "//mat-select[@id='mat-select-1']//div[@class='mat-select-arrow-wrapper']")
    private WebElement arrowQuiz;

    @FindBy(xpath = "//mat-select[@id='mat-select-0']//div[@class='mat-select-arrow-wrapper']")
    private WebElement arrowStudent;

    @FindBy(xpath = "//span[contains(text(),'Give Assignment')]/..")
    private WebElement buttonAssign;

    @FindBy(xpath = "//h5[contains(text(),'Log Out')]/..")
    private WebElement logOut;

    @FindBy(xpath = "//ac-modal-confirmation//span[contains(text(),'Log Out')]/..")
    private WebElement confirmLogout;


    public Assignments createNewAssign() throws FileNotFoundException {
        Map<String, String> quiz = getData("3.15_quiz");
        Map<String, String> student = getData("student");
        click(arrowQuiz);
        WebElement elQuiz = getDriver().
                findElement(By.xpath("//div[contains(@class,'mat-select-content ng-trigger')]//span[contains(text(), '"
                        + quiz.get("title") + "')]"));
        click(elQuiz);
        WebElement elStudent = getDriver().
                findElement(By.xpath("//mat-list-option//div//div[contains(string(), '"
                        + student.get("name") + "')]"));
        click(elStudent);
        click(buttonAssign);

        return new Assignments();
    }

    public LogIn clickLogOut() {
        click(logOut);
        click(confirmLogout);
        return new LogIn();
    }

}
