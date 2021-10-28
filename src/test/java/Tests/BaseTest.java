package Tests;

import Core.Browser;
import Core.Web;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;

public class BaseTest {

    private Browser browser;
    protected Web web;


    @BeforeAll

    private static void beforeAll(){
        Browser.downloadBrowser();
    }

    @BeforeEach

    private void beforeEachTest(){
        browser = new Browser();
        web = new Web(browser.startBrowser());
    }

    @AfterEach
    private void afterTest() {
        browser.quit();
    }

}
