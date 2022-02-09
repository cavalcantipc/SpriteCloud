package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.objects.DynamicTablePage;

import java.io.IOException;

public class DynamicTableSteps {

    public DynamicTableSteps() throws IOException {
    }

    DynamicTablePage dynamicTablePage = new DynamicTablePage();

    //  ----------- Dynamic Table Steps -----------
    @Given("I'm on Dynamic Table page")
    public void iMOnDynamicTablePage() {
        dynamicTablePage.accessPage();
    }

    @Then("Chrome CPU information on table should be equals to information on label")
    public void chromeCPUInformationOnTableShouldBeEqualsToInformationOnLabel() {
        dynamicTablePage.compareTableAndLabel();
    }

}
