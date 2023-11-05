package pages;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import stepDef.TestBase;

public class Login extends Register{
    public void navigatesToPage(){
        TestBase.driver.get("https://demo.nopcommerce.com/");
        SoftAssert softAssert = new SoftAssert();

        String currentURL = TestBase.driver.getCurrentUrl();
        softAssert.assertEquals(currentURL, "https://demo.nopcommerce.com/");
        softAssert.assertAll();


    }

    public void navigatesToLoginPage(){
        TestBase.driver.findElement(By.className("ico-login")).click();
    }

    public void loginButton(){
        TestBase.driver.findElement(By.className("login-button")).click();
    }

}
