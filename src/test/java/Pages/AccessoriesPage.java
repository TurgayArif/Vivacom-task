package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessoriesPage extends BasePage{

    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to click on Apple Brand Button on Accessories page
     * @return clicking on apple brand button
     */

    public AccessoriesPage clickOnAppleBrandButton() {
        WebElement appleBrandAccessoriesButtonSelector = driver.findElement(By.xpath("//*[@id=\"filter-manufacturer\"]/label[1]/em"));
        click(appleBrandAccessoriesButtonSelector);
        return this;
    }

    /**
     * Method for click on over forty BGN button on accessories page
     * @return clicking on over forty BGN button
     * @throws InterruptedException
     */
    public AccessoriesPage clickOnOverFortyBGNButton() throws InterruptedException {
        WebElement overFortyBGNButtonSelector = driver.findElement(By.xpath("//*[@id=\"filter-price\"]/label[3]/em"));
        scroll(overFortyBGNButtonSelector);
        click(overFortyBGNButtonSelector);
        Thread.sleep(3000);
        return this;
    }

    /**
     * Method for selecting the Apple Iphone Pro Max leather case
     * @return clicking the apple iphone pro max leather case
     */
    public AccessoriesPage chooseAppleIphoneProMaxLeatherCase() {
        WebElement appleIphoneProMaxLeatherCaseSelector = driver.findElement(By.xpath("//a[contains(@href,\"apple-iphone-13-pro-max-leather-dark-cherry\")]"));
        click(appleIphoneProMaxLeatherCaseSelector);
        return this;
    }

    /**
     * Method for click on submit button on selected accessory
     * @return clicking submit button on selected accessory
     * @throws InterruptedException
     */
    public AccessoriesPage clickSubmitButton() throws InterruptedException {
        WebElement submitButtonSelector = driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div[1]/button"));
        click(submitButtonSelector);
        Thread.sleep(5000);
        return this;
    }
}
