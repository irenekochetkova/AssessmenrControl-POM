package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_3 {
    @Then("^I type Email \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void iTypeEmailOnPage(String email, String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
            getDriver().findElement(By.xpath("//*[@placeholder='Email *']")).sendKeys(email);
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
        }
        Thread.sleep(1000);
    }

        @And("^I type Password \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void iTypePasswordOnPage(String password, String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
//            String st = "Array.from(document.querySelectorAll('#mat-input-0'))[0].click()";
//            executeJavascript(st);
            getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys(password);
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        }
    }

    @And("^I push button Sign in$")
    public void iPushButtonSignIn() throws Throwable {
        getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary']")).click();
        Thread.sleep(1000);
    }

    @And("^I click on Quizzes$")
    public void iClickOnQuizzes() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);
    }

    @And("^I push button Create New Quiz$")
    public void iPushButtonCreateNewQuiz() throws Throwable {
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div[@class='controls']//button[@class='mat-raised-button mat-primary']")).click();
        Thread.sleep(1000);
    }

    @And("^I type Quiz title \"([^\"]*)\"$")
    public void iTypeQuizTitle(String tittle) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys(tittle);
    }


    @And("^I push button Add Question for Question \"([^\"]*)\"$")
    public void iPushButtonAddQuestionForQuestion(String numberOfQuestion) throws Throwable {
        if (numberOfQuestion.equalsIgnoreCase("one")) {
            getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted']//span[1]")).click();
        } else {
            getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']//span[1]")).click();
        }
        Thread.sleep(1000);
    }

    @And("^I select Textual type for Question \"([^\"]*)\"$")
    public void iSelectTextualTypeForQuestion(String questionType) throws Throwable {
        if (questionType.equalsIgnoreCase("Q1")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//div[contains(text(),'Textual')]")).click();
        } else if (questionType.equalsIgnoreCase("Q2")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//div[contains(text(),'Textual')]/../div[@class='mat-radio-container']")).click();
        } else if (questionType.equalsIgnoreCase("Q3")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3')]/../../..//div[contains(text(),'Textual')]/../div[@class='mat-radio-container']")).click();
        } else if (questionType.equalsIgnoreCase("Q4")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//div[contains(text(),'Textual')]/../div[@class='mat-radio-container']")).click();
        } else if (questionType.equalsIgnoreCase("Q5")) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//div[contains(text(),'Textual')]/../div[@class='mat-radio-container']")).click();
        } else {
            System.out.println("Not supported ");
        }
        Thread.sleep(1000);
    }



    @And("^I push button Save$")
    public void iPushButtonSave() throws Throwable {
        getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary ng-star-inserted']/span[@class='mat-button-wrapper'][contains(text(),'Save')]")).click();
        Thread.sleep(1000);
    }

    @Then("^Quiz \"([^\"]*)\" saved in List of Quizzes$")
    public void quizSavedInListOfQuizzes() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();

    }

    @And("^I select Quiz title \"([^\"]*)\"$")
    public void iSelectQuizTitle(String name) throws Throwable {
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Select Quiz To Assign')]/../..")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'"+name+"')]/..")).click();
        Thread.sleep(1000);
    }

    @And("^I select Quiz \"([^\"]*)\" from List of Quizzes$")
    public void iSelectQuizFromListOfQuizzes(String NameOfQuiz) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'"+NameOfQuiz+"')]/..")).click();
        Thread.sleep(1000);
    }



    @And("^I type text \"([^\"]*)\" of Question \"([^\"]*)\"$")
    public void iTypeTextOfQuestion(String textOfquestion, String numberOfquestion) throws Throwable {
    if (numberOfquestion.equalsIgnoreCase("one")) {
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).sendKeys(textOfquestion);
    } else if (numberOfquestion.equalsIgnoreCase("two")) {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']")).sendKeys(textOfquestion);
    } else if (numberOfquestion.equalsIgnoreCase("three")) {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3')]/../../..//textarea[@placeholder='Question *']")).sendKeys(textOfquestion);
    } else if (numberOfquestion.equalsIgnoreCase("four")) {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']")).sendKeys(textOfquestion);
    } else if (numberOfquestion.equalsIgnoreCase("five")) {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']")).sendKeys(textOfquestion);
    } else if (numberOfquestion.equalsIgnoreCase("six")) {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Question *']")).sendKeys(textOfquestion);
    }
    else {
        System.out.println("Not supported ");
    }
        Thread.sleep(1000);
    }


}




