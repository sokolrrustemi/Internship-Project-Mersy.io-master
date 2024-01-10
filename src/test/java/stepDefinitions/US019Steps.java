package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Methods;
import pages.Body;
import pages.Header;
import utilities.BaseDriver;

import java.time.Duration;

public class US019Steps extends Methods{
    Header hp = new Header();
    Body bp = new Body();
    Methods mt = new Methods();

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
    @When("the student clicks on the assignments page->discussion")
    public void theStudentClicksOnTheAssignmentsPageDiscussion() {
        mt.myClick(hp.assignmentsButton);
        mt.myClick(bp.semester);
        mt.myClick(bp.all);
      //  mt.myClick(bp.project);
        mt.wait.until(ExpectedConditions.visibilityOf(bp.discussionButton));
        mt.myClickWithoutScroll(bp.discussionButton);
    }

    @Then("the student should see and be able to click on an icon Chats")
    public void theStudentShouldSeeAndBeAbleToClickOnAnIconChats() {
        mt.myClick(bp.chatsButton);
    }

    @And("the student should be able to select the person people Contacts")
    public void theStudentShouldBeAbleToSelectThePersonPeopleContacts() {
        mt.myClick(bp.contacts);
        mt.myClick(bp.person);
    }

    @Then("the student should also be able to send file attachments")
    public void theStudentShouldAlsoBeAbleToSendFileAttachments() {
    }

    @When("the student should not receive any success notification")
    public void theStudentShouldNotReceiveAnySuccessNotification() {
      //
        //  bp.displayedAssert(bp.notSuccesInfo);

    }

    @Then("the student should be able to see the message with the date and time of sending")
    public void theStudentShouldBeAbleToSeeTheMessageWithTheDateAndTimeOfSending() {
    }
}
