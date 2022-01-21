package StepDefinitions;

import Essentials.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SauceLabsPage {

    private Hooks hooks;
    private WebDriver driver;
    public SauceLabsPage(Hooks hooks){
        this.hooks=new Hooks();
        driver=this.hooks.getOperaDriver();
    }


    @Given("User opens opera the browser")
    public void user_opens_opera_the_browser() {

    }

    @And("User navigates to {string} URL")
    public void userNavigatesToURL(String url) {
        driver.get(url);
    }

    @Then("User verifies title as {string}")
    public void userVerifiesTitleAs(String title) {
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase(title));
        driver.quit();
    }
}
