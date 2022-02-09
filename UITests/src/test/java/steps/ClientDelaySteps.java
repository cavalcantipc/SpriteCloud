package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.ClientDelayPage;

import java.io.IOException;

public class ClientDelaySteps {

    public ClientDelaySteps() throws IOException {
    }

    ClientDelayPage clientDelayPage = new ClientDelayPage();

    //  ----------- Client Delay Steps -----------
    @Given("I'm on Client Delay page")
    public void iMOnClientDelayPage() {
        clientDelayPage.accessPage();
    }

    @When("I Click client trigger button")
    public void clickTriggerClient() {
        clientDelayPage.clickClientButton();
    }

    @Then("data should be presented")
    public void dataShouldBePresented() {
        clientDelayPage.verifyResponseDisplayed();
    }

}
