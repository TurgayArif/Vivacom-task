package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static final int WAIT_MILLIS = 5000;
    protected WebDriver driver;



    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    protected void click(By selector){
        waitForElementToBeClickable(selector);
        driver.findElement(selector).click();
    }

    protected void click(WebElement selector){
        waitForElementToBeClickable(selector);
        selector.click();
    }

    protected String getText(By selector) {
        waitForVisibilityOf(selector);
        String text = driver.findElement(selector).getText().trim();
        return text;
    }

    protected void waitForVisibilityOf(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_MILLIS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selector)));
    }

    protected void waitForVisibilityOf(WebElement selector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_MILLIS);
        wait.until(ExpectedConditions.visibilityOf(selector));
    }

    private void waitForElementToBeClickable(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_MILLIS);
        wait.until(ExpectedConditions.elementToBeClickable(selector));
    }

    private void waitForElementToBeClickable(WebElement selector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_MILLIS);
        wait.until(ExpectedConditions.elementToBeClickable(selector));
    }

    protected void scroll(WebElement selector) {
        waitForVisibilityOf(selector);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", selector);
    }

    protected void scrollBy1500() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1500)");
    }

}
