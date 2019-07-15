package study.qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static study.qa.automation.utils.TestContext.getWait;

public class Assignments extends Page{

   @FindBy(xpath = "//span[contains(text(),'Create New Assignment')]")
   private WebElement buttonNewAssigment;

   private By el = By.xpath("//span[contains(text(),'Create New Assignment')]");



   public AssignQuiz clickbuttonNewAssigment() throws InterruptedException {
       click(buttonNewAssigment);
       return new AssignQuiz(); }
}
