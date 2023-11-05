package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import stepDef.TestBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class homePage {
    SoftAssert softAssert = new SoftAssert();


    public void selectEuro(String currency){

        Select currencyDropDown = new Select(TestBase.driver.findElement(By.id("customerCurrency")));
        currencyDropDown.selectByVisibleText(currency);
    }
    public void testEuroSymbol() throws InterruptedException {
        List<WebElement> products = TestBase.driver.findElements(By.className("actual-price"));
        List<String> productTextList = productText(products);

        WebElement elementScroll = TestBase.driver.findElement(By.className("product-item"));
        js.executeScript("arguments[0].scrollIntoView();", elementScroll);
        Thread.sleep(500);

        for (String productText : productTextList) {
            Assert.assertTrue(productText.contains("€"), "Euro symbol (€) is not found in product text: " + productText);
        }
    }

    public List<String> productText (List<WebElement> products){
        List<String> productTextList = new ArrayList<>();
        for(WebElement product : products){
            productTextList.add(product.getText());
        }
        return productTextList ;

    }



    public void searchProduct(String product){
        TestBase.driver.findElement(By.id("small-searchterms")).sendKeys(product);
    }

    public void searchButton(){
        TestBase.driver.findElement(By.className("search-box-button")).click();
    }

    public void searchedItem(int number){

        Select numberDropDown = new Select(TestBase.driver.findElement(By.id("products-pagesize")));
        numberDropDown.selectByVisibleText("18");


        List<WebElement> items = TestBase.driver.findElements(By.className("product-item"));

        int count = items.size() ;

        softAssert.assertEquals(count , number , "Number of elements is not equal to expected number");


        softAssert.assertAll();

    }
    public void itemWord (String product){

        List<WebElement> items = TestBase.driver.findElements(By.className("product-title"));
        List<String> textlist = productText(items);
        for(String itemtext : textlist){
            String s = itemtext.toLowerCase();
            Assert.assertTrue(s.contains(product),"Product item doesn't contain the word" + product);

        }
    }
    public void skuProduct(){
        TestBase.driver.findElement(By.cssSelector("h2 > a[href=\"/apple-macbook-pro-13-inch\"]")).click();
    }
    public void checkSku(String sku){
        WebElement skuName = TestBase.driver.findElement(By.cssSelector("div[class='sku'] > span[class='value']"));

        String sk_name = skuName.getText() ;

        Assert.assertTrue(sk_name.contains(sku) , "Product item doesn't contain the sku name : " + sku);

    }


    List<WebElement> mainCategories = TestBase.driver.findElements(By.cssSelector(".top-menu.notmobile > li"));
    Random random = new Random();
    int randomMainIndex = random.nextInt(mainCategories.size()-4);
    WebElement randomMainCategory = mainCategories.get(randomMainIndex);
    public void hoverCat() throws InterruptedException {

        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(randomMainCategory).perform();

        Thread.sleep(2000);

    }
    List<WebElement> subCategories = randomMainCategory.findElements(By.cssSelector(".sublist.first-level > li"));
    int randomSubIndex = random.nextInt(subCategories.size());
    WebElement randomSubCategory = subCategories.get(randomSubIndex);
    String randomSubCategoryText = randomSubCategory.getText();
    public void subCategory(){

        randomSubCategory.click();
    }
    public void checkTitle(){
        randomSubCategoryText.toLowerCase();
        WebElement subCategory = TestBase.driver.findElement(By.cssSelector("div[class='page-title'] > h1"));
        String headerText = subCategory.getText();
        headerText.toLowerCase();

        Assert.assertEquals(randomSubCategoryText,headerText , "Words do not match");
    }

    public void sliderClick() {


        WebElement firstSlider = TestBase.driver.findElement(By.className("nivo-imageLink"));
        firstSlider.click();
    }
    public void slider2Click() throws InterruptedException {
        Thread.sleep(6000);
        WebElement firstSlider = TestBase.driver.findElement(By.className("nivo-imageLink"));
        firstSlider.click();
    }
    public void slidercheck(){

        String expectedUrl = " https://demo.nopcommerce.com/nokia-lumia-1020" ;

        String currentUrl = TestBase.driver.getCurrentUrl() ;

        Assert.assertTrue(currentUrl.contains(expectedUrl) , "URL does not contain the expected string");
    }
    JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
    public void openSocialMedialink(String social) throws InterruptedException {

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        TestBase.driver.findElement(By.cssSelector("li[class='"+ social + "'] > a")).click();
    }
    public void checkSocialMediaLink(String link) throws InterruptedException {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(TestBase.driver.getWindowHandles());

        TestBase.driver.switchTo().window(tabs.get(1));

        System.out.println(TestBase.driver.getCurrentUrl());
        System.out.println(TestBase.driver.getTitle());

        Assert.assertEquals(TestBase.driver.getCurrentUrl(),link);
        softAssert.assertAll();

        Thread.sleep(4000);
        TestBase.driver.close();
        TestBase.driver.switchTo().window(tabs.get(0));

    }
    public void whishlist() throws InterruptedException {

        WebElement elementScroll = TestBase.driver.findElement(By.className("product-item"));
        WebElement whishlistButton = TestBase.driver.findElement(By.xpath("//div[@data-productid='18']//button[@title='Add to wishlist']")) ;
        js.executeScript("arguments[0].scrollIntoView();", elementScroll);
        Thread.sleep(2000);

        whishlistButton.click();

        Thread.sleep(4000);
    }
    public void whishlistButton() throws InterruptedException {
        WebElement elementScroll = TestBase.driver.findElement(By.className("product-item"));

        WebElement whishlistButton = TestBase.driver.findElement(By.xpath("//div[@data-productid='18']//button[@title='Add to wishlist']")) ;
        js.executeScript("arguments[0].scrollIntoView();", elementScroll);
        Thread.sleep(2000);

        whishlistButton.click();
        Thread.sleep(5000);



    }
    public void whishButtonBesideRegister(){
        TestBase.driver.findElement(By.className("ico-wishlist")).click();
    }

    public void whishlistcheck(){

        WebElement quantityElement = TestBase.driver.findElement(By.className("qty-input"));
        String quantityText = quantityElement.getAttribute("value");
        int number = Integer.parseInt(quantityText);
        System.out.println(number);

        Assert.assertTrue(number > 0 ,"Quantity is not greater than 0: " + quantityText);
    }

}
