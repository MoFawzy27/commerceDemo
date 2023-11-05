package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class homesliders_stepDef {

    homePage homepage = new homePage();


    @When("user clicks on the first slider")
    public void userClicksOnTheFirstSlider() {
        homepage.sliderClick();
    }

    
    @Then("user is navigated to the page containing the slider component")
    public void userIsNavigatedToThePageContainingTheSliderComponent() {
        homepage.slidercheck();
    }


    @When("user clicks on the second slider")
    public void userClicksOnTheSecondSlider() throws InterruptedException {
        homepage.slider2Click();
    }
}
