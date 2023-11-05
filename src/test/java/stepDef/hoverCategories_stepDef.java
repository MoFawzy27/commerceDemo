package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class hoverCategories_stepDef {

    homePage homepage = new homePage() ;

    @When("user select random element and hover on it")
    public void userSelectRandomElementAndHoverOnIt() throws InterruptedException {
        homepage.hoverCat();
    }

    @And("user can select any random subcategory and click on it")
    public void userCanSelectAnyRandomSubcategoryAndClickOnIt() {
        homepage.subCategory();
    }

    @Then("user checks the page title equals to the subcategory")
    public void userChecksThePageTitleEqualsToTheSubcategory() {
        homepage.checkTitle();
    }
}
