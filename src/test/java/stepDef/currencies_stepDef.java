package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class currencies_stepDef {

    homePage homepage = new homePage();
    @When("user select euro currency from the dropdown list")
    public void userSelectEuroCurrencyFromTheDropdownList() {
          String currency = "Euro";
          homepage.selectEuro(currency);


    }

    @Then("user verifies Euro Symbol is shown on the products displayed in Home page")
    public void userVerifiesEuroSymbolIsShownOnTheProductsDisplayedInHomePage() throws InterruptedException {
        homepage.testEuroSymbol();
    }
}
