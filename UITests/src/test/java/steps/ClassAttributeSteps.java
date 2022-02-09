package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.*;
import java.io.IOException;

public class ClassAttributeSteps {

    public ClassAttributeSteps() throws IOException {
    }

    ClassAttributePage classAttributePage = new ClassAttributePage();

    //  ----------- Class Attribute Steps -----------
    @Given("I'm on Class Attribute page")
    public void iMOnClassAttributePage() {
//        ClassAttributePage classAttributePage = new ClassAttributePage();
        classAttributePage.accessPage();
    }

    @When("I Click primary button")
    public void iClickPrimaryButton(){
//        ClassAttributePage classAttributePage = new ClassAttributePage();
        classAttributePage.clickPrimaryButton();
    }

    @Then("an alert popup is displayed")
    public void anAlertPopupIsDisplayed() {
//        ClassAttributePage classAttributePage = new ClassAttributePage();
        classAttributePage.acceptAlert();
    }

}
