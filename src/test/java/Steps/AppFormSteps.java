package Steps;

import Pages.AppFormPage;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

public class AppFormSteps extends Container {

    private Container container;
    private final AppFormPage appFormPage;

    public AppFormSteps(Container container) {
        this.container = container;
        appFormPage = new AppFormPage(this.container.driver);
    }

    @Given("I am on appForm page")
    public void iAmOnAppFormPage() {
        appFormPage.Open();
    }

    @When("I register a new user")
    public void iRegisterANewUser() {
        appFormPage.PopulateForm();
    }

    @Then("I see Thank you page")
    public void iSeeThankYouPage() {
        System.out.println("Third step: I register a new user");
    //    assertEquals(1,2);
    }
}
