package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import study.qa.automation.pages.*;

import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static study.qa.automation.utils.TestContext.getData;

public class def_3_15 {
    @Then("^I login as a \"([^\"]*)\"$")
    public void iLoginAsA(String role) throws Throwable {
        Map<String, String> user = getData(role);
        new LogIn().loginForm(user).clickSignIn();
    }

    @And("^I click on Quizzes obj_page$")
    public void iClickOnQuizzesObj_page() throws Throwable {
        new HomePage().clickQuizes();
    }

    @And("^I create new quiz$")
    public void iCreateNewQuiz() throws Throwable {
        Map<String, String> quiz = getData("3.15_quiz");
        new Quizzes().clickNewQuiz().createQuiz(quiz);

    }

    @And("^I verify new quiz is created$")
    public void iVerifyNewQuizIsCreated() throws Throwable {
        new Quizzes().getNewQuiz();
    }

    @And("^I assign question to single student$")
    public void iAssignQuestionToSingleStudent() throws Throwable {
        new Quizzes().clickAssignment().clickbuttonNewAssigment().createNewAssign();

    }

    @Then("^I logout$")
    public void iLogout() throws Throwable {
        new AssignQuiz().clickLogOut();
    }

    @And("^I complete Quiz as a student$")
    public void iCompleteQuizAsAStudent() throws Throwable {
        new HomePage().clickAssingments().clickGoAssign().submitAnswer();
    }

    @And("^I verify a student submit assignments$")
    public void iVerifyAStudentSubmitAssignments() throws Throwable {
        Boolean isSubmission = new HomePage().clickSubmission().verifySubmission();
        assertThat(isSubmission).isTrue();
    }

}
