package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefs {
    private String today;
    private boolean isSunday;


    @Given("today is {string}")
    public void today_is(String string) {
        System.out.println("Today is " + string);
        this.today = string;
    }

    @When("I ask whether it's {string} yet")
    public void i_ask_whether_it_s_Friday_yet(String string) {
        System.out.println("I ask whether it's " +  string + " yet");
        this.isSunday=this.today.equals(string);
    }

    @Then("Assert day")
    public void i_should_be_told() {
        System.out.println("Assert day");
        assertTrue(this.isSunday);
    }


}
