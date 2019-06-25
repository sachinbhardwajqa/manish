package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo1 {
    @Given("^preconditions$")
    public void preconditions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String nameofCurrMethod = new Exception()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(nameofCurrMethod);
    }

    @When("^action performed$")
    public void action_performed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String nameofCurrMethod = new Exception()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(nameofCurrMethod);
    }

    @Then("^expected outcomes$")
    public void expected_outcomes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String nameofCurrMethod = new Exception()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(nameofCurrMethod);
    }
}
