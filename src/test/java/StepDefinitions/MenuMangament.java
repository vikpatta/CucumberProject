package StepDefinitions;

import POMClasses.RestaurentItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MenuMangament {
    RestaurentItem item;


    @Given("I have a menu item {string} with price {int}")
    public void i_have_a_menu_item_with_price(String itemName, Integer price) {

        item= new RestaurentItem(itemName, "", price);

    }

    @When("I add the menu item")
    public void i_add_the_menu_item() {


    }

    @Then("Menu item should be added")
    public void menu_item_should_be_added() {

    }


}
