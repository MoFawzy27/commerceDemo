package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.securePage;

import java.sql.PseudoColumnUsage;

public class whishlist_stepDef {

    homePage homepage = new homePage();
    securePage sa = new securePage();

    @When("user clicks on whishlist button found in the product")
    public void userClicksOnWhishlistButtonFoundInTheProduct() throws InterruptedException {
        homepage.whishlist();
    }

    @Then("Success message appears to the user {string} with green color")
    public void successMessageAppearsToTheUserWithGreenColor(String message) {
        sa.checkWhishListMessage(message);
    }


    @When("user clicks on whishlist button in the product")
    public void userClicksOnWhishlistButtonInTheProduct() throws InterruptedException {
        homepage.whishlistButton();
    }

    @And("User clicks on whishlist button beside login button after the success message disappear")
    public void userClicksOnWhishlistButtonBesideLoginButton(){
        homepage.whishButtonBesideRegister();
    }

    @Then("user checks that the quantity is bigger than zero")
    public void userChecksThatTheQuantityIsBiggerThanZero() {
        homepage.whishlistcheck();
    }


}

