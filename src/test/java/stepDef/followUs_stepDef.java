package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class followUs_stepDef {
    homePage homepage = new homePage();

    @When("user opens facebook link {string}")
    public void userOpensFacebookLinkFacebook(String social) throws InterruptedException {
        homepage.openSocialMedialink(social);
    }

    @Then("{string} is opened in new tab")
    public void httpsWwwFacebookComNopCommerceIsOpenedInNewTab(String link) throws InterruptedException {

        homepage.checkSocialMediaLink(link);

    }


}
