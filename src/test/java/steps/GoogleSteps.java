package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;
import utilites.Driver;

public class GoogleSteps {

    WebDriver driver;
    GoogleSearchPage googleSearchPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        googleSearchPage = new GoogleSearchPage();
    }

    @When("user searches for {string} on Google")
    public void userSearchesForOnGoogle(String key) {
        googleSearchPage.searchInputBox.sendKeys(key + Keys.ENTER);
    }

    @Then("user should see more than {int} results")
    public void userShouldSeeMoreThanResults(long result) {
        Assert.assertTrue(Long.parseLong(googleSearchPage.resultBar.getText().split(" ")[1].replace(",", "")) > result);
    }
}
