package Steps;

import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        System.out.println("Open login page");
    }

    @When("I submit a valid login")
    public void iSubmitAValidLogin() {
        System.out.println("Enter credentials");
    }

    @Then("I am logged")
    public void iAmLogged() {
        System.out.println("Logged in successfully");
    }

}
