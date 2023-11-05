package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;
import pages.Register;
import pages.securePage;

public class Login_stepDef {
    Login lp = new Login();
    securePage sa = new securePage() ;

    @Given("User go to Home Page")
    public void userNavigatesToLoginPage() {
        lp.navigatesToPage();
    }
    @When("user clicks on login tab")
    public void userClicksOnLoginTab() {
        lp.navigatesToLoginPage();
    }


    @And("user login with {string} and {string}")
    public void userLoginWithAnd(String email, String password) {
        lp.enterEmail(email);
        lp.enterPassword(password);

    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        lp.loginButton();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        sa.loginSuccess();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String message= "Login was unsuccessful." ;
        sa.errorMessage(message);
    }

}
