package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver = null ;

    @Before
    public void openBrowser() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
