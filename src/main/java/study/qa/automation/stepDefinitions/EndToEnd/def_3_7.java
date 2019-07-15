package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;

import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_7 {
//    @And("^I select Single-choice type for Question \"([^\"]*)\"$")
//    public void iSelectSingleChoiceTypeForQuestion(String singleChoicequestion, String numberOfquestion) throws Throwable {
//        if (singleChoicequestion.equalsIgnoreCase("four")) {
//            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is Ad hoc Testing?");
//        } else if (numberOfquestion.equalsIgnoreCase("five")) {
//            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is Ad hoc Testing?");
//        } else if (numberOfquestion.equalsIgnoreCase("six")) {
//            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is Ad hoc Testing?");
//        } else if (numberOfquestion.equalsIgnoreCase("four")) {
//            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is Ad hoc Testing?");
//
//        } else {
//            System.out.println("Not supported ");
//        }
//        Thread.sleep(1000);
//    }


    @And("^I push button Add Question for Single choice Question \"([^\"]*)\"$")
    public void iPushButtonAddQuestionForSingleChoiceQuestion(String numberOfSingleQuestion) throws Throwable {
        if (numberOfSingleQuestion.equalsIgnoreCase("Q1")) {
            getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted']//span[1]")).click();
        } else {
            getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']//span[1]")).click();
        }

        Thread.sleep(1000);
    }

    @And("^I select Single-choice type for Question \"([^\"]*)\"$")
    public void iSelectSingleChoiceTypeForQuestion(String QuestionNumber) throws Throwable {
        if (QuestionNumber.equalsIgnoreCase("Q1")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Single-Choice')]/..")).click();
        } else if (QuestionNumber.equalsIgnoreCase("Q2")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//*[contains(text(), 'Single-Choice')]/..")).click();
        } else if (QuestionNumber.equalsIgnoreCase("Q3")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3')]/../../..//*[contains(text(), 'Single-Choice')]/..")).click();
        } else if (QuestionNumber.equalsIgnoreCase("Q4")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//*[contains(text(), 'Single-Choice')]/..")).click();
        } else if (QuestionNumber.equalsIgnoreCase("Q5")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//*[contains(text(), 'Single-Choice')]/..")).click();
        }else if (QuestionNumber.equalsIgnoreCase("Q6")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//*[contains(text(), 'Single-Choice')]/..")).click();
        }
    }

    @And("^I type text in options in Single-Choice question \"([^\"]*)\"$")
    public void iTypeTextInOptionsInSingleChoiceQuestion(String QuestionNumber) throws Throwable {
        if (QuestionNumber.equalsIgnoreCase("one")) {
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 1*']")).sendKeys("Determining the test approach");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 2*']")).sendKeys("Preparing test specifications");
        } else if (QuestionNumber.equalsIgnoreCase("two")) {
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 1*']")).sendKeys("Determining the test approach");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 2*']")).sendKeys("Preparing test specifications");
        } else if (QuestionNumber.equalsIgnoreCase("three")) {
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("textOfoption1");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("textOfoption2");
        } else if (QuestionNumber.equalsIgnoreCase("four")) {
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("textOfoption1");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("textOfoption2");
        } else if (QuestionNumber.equalsIgnoreCase("five")) {
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("textOfoption1");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("textOfoption2");
        } else if (QuestionNumber.equalsIgnoreCase("six")) {
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6') ]/../../..//*[@placeholder='Option 1*']")).sendKeys("textOfoption1");
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6') ]/../../..//*[@placeholder='Option 2*']")).sendKeys("textOfoption2");
        }
    }

    @And("^I select correct answer for Single question \"([^\"]*)\"$")
    public void iSelectCorrectAnswerForSingleQuestion(String QuestionNumber) throws Throwable {
        if (QuestionNumber.equalsIgnoreCase("one")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[@class='mat-radio-outer-circle']")).click();
        } else if (QuestionNumber.equalsIgnoreCase("two")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[@class='mat-radio-outer-circle']")).click();
        } else if (QuestionNumber.equalsIgnoreCase("three")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[@class='mat-radio-outer-circle']")).click();
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3') ]/../../..//*[contains(text(), 'Option 2*')]/../../../../../..//*[@class='mat-radio-outer-circle']")).click();
        } else if (QuestionNumber.equalsIgnoreCase("four")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[@class='mat-radio-outer-circle']")).click();
        } else if (QuestionNumber.equalsIgnoreCase("five")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[@class='mat-radio-outer-circle']")).click();
        } else if (QuestionNumber.equalsIgnoreCase("six")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q6') ]/../../..//*[contains(text(), 'Option 1*')]/../../../../../..//*[@class='mat-radio-outer-circle']")).click();
        }
    }
}