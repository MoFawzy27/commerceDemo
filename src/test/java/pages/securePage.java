package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;
import stepDef.TestBase;

import java.lang.ref.SoftReference;

public class securePage {
    SoftAssert softAssert = new SoftAssert();
    public void successMessage(String message) {

        Assert.assertTrue(TestBase.driver.findElement(By.className("result")).isDisplayed());
        Assert.assertTrue(TestBase.driver.findElement(By.className("result")).getText().contains(message));

        WebElement messageElement = TestBase.driver.findElement(By.className("result"));

        // Get the CSS color value of the element
        String cssColorValue = messageElement.getCssValue("color");

        // Verify that the color matches the expected color (green)
        softAssert.assertEquals(cssColorValue, "rgb(76, 177, 124)", "Color doesn't match expected value.");

        softAssert.assertAll();


    }
    public void continueButton(){
        TestBase.driver.findElement(By.className("register-continue-button")).click();

    }

    public void errorMessage(String message) {
        WebElement messageElement = TestBase.driver.findElement(By.className("validation-summary-errors"));

        Assert.assertTrue(messageElement.isDisplayed());
        Assert.assertTrue(TestBase.driver.findElement(By.className("validation-summary-errors")).getText().contains(message));
        String cssColorValue = messageElement.getCssValue("color");

        String expectedColor = "#e4434b";
        String expectedRGBColor = hexToRgb(expectedColor);

        softAssert.assertEquals(cssColorValue, expectedRGBColor, "Color doesn't match expected value.");


        softAssert.assertAll();


    }
    public void loginSuccess(){
        Assert.assertTrue(TestBase.driver.findElement(By.className("ico-account")).isDisplayed());


    }
    public static String hexToRgb(String hexColor) {
        int r = Integer.parseInt(hexColor.substring(1, 3), 16);
        int g = Integer.parseInt(hexColor.substring(3, 5), 16);
        int b = Integer.parseInt(hexColor.substring(5, 7), 16);
        return "rgb(" + r + ", " + g + ", " + b + ")";
    }

    public void checkWhishListMessage(String message){
        WebElement whishmessage = TestBase.driver.findElement(By.className("bar-notification")) ;
        Assert.assertTrue(whishmessage.isDisplayed());
        String mes = TestBase.driver.findElement(By.className("content")).getText() ;
        System.out.println(mes);
        Assert.assertTrue(mes.contains(message));
        String background_color = whishmessage.getCssValue("background-color") ;

        String expectedColor = "#4bb07a";
        String expectedRGBColor = hexToRgb(expectedColor);

        softAssert.assertEquals(background_color, expectedRGBColor, "Color doesn't match expected value.");
        softAssert.assertAll();

    }
}
