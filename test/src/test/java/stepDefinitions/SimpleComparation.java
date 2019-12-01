package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
        System.out.println("compare these numbers");
        this.areEquals = this.firstNumber == this.secondNumber;
    }

    @Then("assert these numbers are not equals")
    public void assert_these_numbers_are_not_equals() {
        System.out.println("assert these numbers are not equals");
        assertFalse(this.areEquals);
    }
}
