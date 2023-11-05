package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDef.TestBase;

public class Register {
    public void selectGenderMale(){
        TestBase.driver.findElement(By.id("gender-male")).click();
    }
    public void selectGenderFemale(){
        TestBase.driver.findElement(By.id("gender-female")).click();
    }
    public void enterFirstLastname(String firstname , String lastname){
        TestBase.driver.findElement(By.id("FirstName")).sendKeys(firstname);
        TestBase.driver.findElement(By.id("LastName")).sendKeys(lastname);
    }

    public void enterBirthDate(String day , String month , String year){


            Select dayDropdown = new Select(TestBase.driver.findElement(By.name("DateOfBirthDay"))) ;
            Select monthDropdown = new Select(TestBase.driver.findElement(By.name("DateOfBirthMonth"))) ;
            Select yearDropdown = new Select(TestBase.driver.findElement(By.name("DateOfBirthYear"))) ;

            dayDropdown.selectByVisibleText(day);
            monthDropdown.selectByVisibleText(month);
            yearDropdown.selectByVisibleText(year);

    }
    public void enterEmail(String email){
        TestBase.driver.findElement(By.id("Email")).sendKeys(email);
    }

    public void enterPassword(String password){
        TestBase.driver.findElement(By.id("Password")).sendKeys(password);
    }
    public void enterConfirmPassword(String password){
        TestBase.driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
    }
    public void registerButton(){
        TestBase.driver.findElement(By.id("register-button")).click();

    }


}
