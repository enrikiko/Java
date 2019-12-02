package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class Cortijo {
    public static WebDriver driver;

    @Given("a cortijo web app running")
    public void a_cortijo_web_app_running() {
        System.setProperty("webdriver.chrome.driver","./chromedriver");
        this.driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            String ip = CortijoIp.getCortijoIp();
            this.driver.get(ip);
        } catch (Exception e) {
            this.driver.quit();
            throw new cucumber.api.PendingException();
        }
    }

    @When("I click switch on mock {double} minutos")
    public void i_click_switch_on_mock(Double min) throws InterruptedException {
        this.driver.findElement(By.name("lapse_time")).clear();
        this.driver.findElement(By.name("lapse_time")).sendKeys(min.toString());
        this.driver.findElement(By.id("mock")).click();
        TimeUnit.SECONDS.sleep(4);
    }

    @When("I refresh the page")
    public void i_refresh_the_page()  throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        try {
            String ip = CortijoIp.getCortijoIp();
            this.driver.get(ip);
        } catch (Exception e) {
            this.driver.quit();
            throw new cucumber.api.PendingException();
        }
    }

    @Then("the mock button is off")
    public void the_mock_button_is_off() throws Exception{
        TimeUnit.SECONDS.sleep(1);
        assertTrue(this.driver.findElement(By.id("mock")).getAttribute("class").contains("bg-secondary"));
        TimeUnit.SECONDS.sleep(1);
        this.driver.quit();
    }

    @Then("the mock button is on")
    public void the_mock_button_is_on() throws Exception{
        assertTrue(this.driver.findElement(By.id("mock")).getAttribute("class").contains("bg-success"));
        TimeUnit.SECONDS.sleep(1);
        this.driver.quit();
    }

}
