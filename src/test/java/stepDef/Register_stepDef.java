package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Register;
import pages.securePage;

public class Register_stepDef {
    Register rs = new Register() ;
    securePage sa = new securePage() ;

    @Given("user go to register page")
    public void userNavigatesToRegisterPage(){
        TestBase.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F") ;
    }

    @When("user select gender type")
    public void userSelectAGenderType() {
        rs.selectGenderMale();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstname, String lastname) {
         rs.enterFirstLastname(firstname , lastname);
    }



    @And("User enters date of birth")
    public void userEntersValidDateOfBirth() {
        rs.enterBirthDate("27", "July" , "2001");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        rs.enterEmail(email);
    }


    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password ,String confirmPassword) {
        rs.enterPassword(password);
        rs.enterConfirmPassword(confirmPassword);
    }

    @And("User clicks on register button")
    public void userClicksOnRegisterButton() {
        rs.registerButton();
    }


    @Then("success message is displayed {string}")
    public void successMessageIsDisplayed(String message) {
        sa.successMessage(message);
    }

    /*@And("Press on continue button")
    public void pressOnContinueButton() {
          sa.continueButton();
    }*/
}
