package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleComparation {
    private int firstNumber;
    private int secondNumber;
    private boolean areEquals;

    @Given("two number {int} {int}")
    public void two_number(Integer int1, Integer int2) {
        System.out.println("two number " + int1.toString() + " " + int2.toString());
        this.firstNumber=int1;
        this.secondNumber=int2;
    }

    @When("compare these numbers")
    public void compare_these_numbers() {
        System.out.println("compare " + this.firstNumber + " and " + this.secondNumber);
        this.areEquals = this.firstNumber == this.secondNumber;
    }

    @Then("assert these numbers are not equals")
    public void assert_these_numbers_are_not_equals() {
        System.out.println("assert these numbers are not equals");
        assertFalse(this.areEquals);
    }

    @Then("assert these numbers are equals")
    public void assert_these_numbers_are_equals() {
        System.out.println("assert these numbers are equals");
        assertTrue(this.areEquals);
    }
}
