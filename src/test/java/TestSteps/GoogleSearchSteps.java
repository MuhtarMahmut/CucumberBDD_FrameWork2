package TestSteps;

import Pages.GoogleElemnts;
import Utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps extends TestBase {


    @When("go to website google")
    public void go_to_website_google() {
       driver.navigate().to("https://www.google.com");
    }

    @Then("webpage titile contains google")
    public void webpage_titile_contains_google() {
        String A = driver.getTitle().toLowerCase();
        Assert.assertTrue( A.contains("google") );
    }

    @Then("user enters apple products name and click Enter")
    public void user_enters_apple_products_name_and_click_Enter() {
               google.searchbox.sendKeys("MacBook" + Keys.ENTER);
             //input[@class='gLFyf gsfi']
    }

    @Then("title changes")
    public void title_changes() {
              Assert.assertTrue( driver.getTitle().toLowerCase().contains("macbook") );
    }


}
