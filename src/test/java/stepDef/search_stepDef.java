package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class search_stepDef {
    homePage homepage = new homePage() ;

    @When("user could search using product name {string}")
    public void userCouldSearchUsingProductName(String product) {
        homepage.searchProduct(product);
    }

    @Then("user clicks on search button")
    public void userClicksOnSearchButton() {
        homepage.searchButton();
    }

    @And("user checks the number of the items {int}")
    public void userChecksTheNumberOfTheItemsNumber(int num) {
        homepage.searchedItem(num);
    }

    @Then("user checks product word {string} in the items")
    public void userChecksProductWordInTheItems(String product) {
        homepage.itemWord(product);
    }

    @When("user could search using product sku {string}")
    public void userCouldSearchUsingProductSku(String sku) {
        homepage.searchProduct(sku);
    }

    @And("user clicks on the showed product")
    public void userClicksOnTheShowedProduct() {
        homepage.skuProduct();
    }


    @Then("user checks the product contains the sku {string}")
    public void userChecksTheProductContainsTheSku(String sku) {
        homepage.checkSku(sku);
    }


}
