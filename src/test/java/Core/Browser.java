package Core;

import Utils.Defaults;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser extends Defaults {

    private WebDriver driver;

    public WebDriver startBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void quit(){
        driver.quit();

    }

    public static void downloadBrowser() {
        WebDriverManager.chromedriver().setup();
    }

}
