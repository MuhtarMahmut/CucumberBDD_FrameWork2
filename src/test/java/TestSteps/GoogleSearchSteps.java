package TestSteps;

import Utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps extends TestBase {

    @Given("chrome browser")
    public void chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("go to website google")
    public void go_to_website_google() {
       
    }

    @Then("webpage titile contains google")
    public void webpage_titile_contains_google() {

    }

    @Then("user enters apple products name and click Enter")
    public void user_enters_apple_products_name_and_click_Enter() {

    }

    @Then("title changes")
    public void title_changes() {

    }

    @Then("print Hello")
    public void print_Hello() {

    }
}
