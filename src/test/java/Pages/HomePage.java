package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By devicesHeaderButtonSelector = By.xpath("//*[@id=\"main-big-menu\"]/li[2]/a");
    private By mobilePhonesExpandedButtonSelector = By.xpath("//*[@id=\"main-big-menu\"]/li[2]/ul/li[1]/div/div[2]/a");
    private By accessoriesExpandedButtonSelector = By.xpath("//*[@id=\"main-big-menu\"]/li[2]/ul/li[6]/div/div[2]/a");


    public HomePage(WebDriver driver){
        super(driver);
    }

    /**
     * Method for accepting the cookies
     * @return accepting the cookies
     * @throws InterruptedException
     */
    public HomePage acceptCookies() throws InterruptedException {
        Thread.sleep(5000);
        WebElement cookiesAlert = driver.findElement(By.id("cookiebanner"));
        waitForVisibilityOf(cookiesAlert);
        WebElement cookiesAccept = driver.findElement(By.id("accept"));
        click(cookiesAccept);
        return this;
    }

    /**
     * Method to click on Devices header button
     * @return clicking on devices header button
     */
    public HomePage clickDevicesHeaderButtonSelector() {
        click(devicesHeaderButtonSelector);
        return this;
    }

    /**
     * Method to click on mobile phones expanded button
     * @return clicking on mobile phones expanded button
     */
    public HomePage clickMobilePhonesExpandedButtonSelector() {
        click(mobilePhonesExpandedButtonSelector);
        return this;
    }

    /**
     * Method to click on accessories expanded button
     * @return clicking on accessories expanded button
     */
    public HomePage clickAccessoriesExpandedButtonSelector () {
        click(accessoriesExpandedButtonSelector);
        return this;
    }

    /**
     * Method that navigates to home page
     * @return navigating to home page
     */
    public HomePage getToHomePage() {
        driver.get("https://www.vivacom.bg/bg");
        return this;
    }
}
