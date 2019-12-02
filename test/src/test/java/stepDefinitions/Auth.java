package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Auth {
    private String PASSWORD = "cortijo1";
    private String USERNAME = "user1";
    private String USERPASSWORD = "password1";

    @When("I create a new User")
    public void i_create_a_new_User() {
        Cortijo.driver.findElement(By.xpath("//a[text()='Users']")).click();
        Cortijo.driver.findElement(By.id("password")).sendKeys(PASSWORD);
        Cortijo.driver.findElement(By.id("userName")).sendKeys(USERNAME);
        Cortijo.driver.findElement(By.id("userPassword")).sendKeys(USERPASSWORD);
        Cortijo.driver.findElement(By.id("createUser")).click();
    }

    @Then("the User is successfully created")
    public void the_User_is_successfully_created() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        assertTrue(Cortijo.driver.findElement(By.id("userHasBeenCreated")).isDisplayed());
        Cortijo.driver.quit();
    }

}
