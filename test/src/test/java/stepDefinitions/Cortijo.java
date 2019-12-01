package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Cortijo {
    private WebDriver driver;

    @Given("a cortijo web app running")
    public void a_cortijo_web_app_running() {

        System.setProperty("webdriver.chrome.driver","./chromedriver");
        this.driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        this.driver.get("http://88.18.59.212:8300/");


    }

    @When("I click switch on mock")
    public void i_click_switch_on_mock() {

        this.driver.findElement(By.name("lapse_time")).clear();
        this.driver.findElement(By.name("lapse_time")).sendKeys("0.2");
        this.driver.findElement(By.xpath("//*[text() = 'mock']")).click();

    }

    @Then("the mock button is on")
    public void the_mock_button_is_on() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        assertTrue(this.driver.findElement(By.xpath("//h2[text() = 'true']")).isDisplayed());
        this.driver.quit();
    }
}
