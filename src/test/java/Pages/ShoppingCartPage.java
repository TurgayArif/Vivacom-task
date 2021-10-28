package Pages;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.atomic.AtomicReference;

public class ShoppingCartPage extends BasePage {

    private By shoppingCartHeaderTextSelector = By.xpath("//*[@class=\"container\"]/div[1]/h2");
    private By finalPriceTextSelector = By.xpath("//div[@class='row final-price']/span[2]");

    public ShoppingCartPage (WebDriver driver){
        super(driver);
    }

    /**
     * Method for verify that you are on correct url
     */
    public ShoppingCartPage verifyShoppingCartUrl() {
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.vivacom.bg/online/bg/shop/shopping-cart";
        Assertions.assertEquals(expectedURL, currentURL);
        return this;
    }

    /**
     * Method that click on continue with shopping button
     */
    public ShoppingCartPage clickOnSeeMoreButton() {
        WebElement seeMoreButtonSelector = driver.findElement(By.xpath("//a[@class=\"see-more\"]"));
        scroll(seeMoreButtonSelector);
        click(seeMoreButtonSelector);
        return this;
    }

    /**
     * Method for getting the final price
     * @return final price as double
     */
    public Double getFinalPrice() {
        AtomicReference<String> finalPrice = new AtomicReference<>(getText(finalPriceTextSelector).replaceAll("[^\\d.]", ""));
        finalPrice.set(StringUtils.chop(finalPrice.get()));
        return Double.valueOf(finalPrice.get());
    }

    /**
     * Method that compares the final price with 2400
     * @throws InterruptedException
     */
    public ShoppingCartPage compareFinalPrice() throws InterruptedException {
        WebElement removeItemFromShoppingCartButton = driver.findElement(By.xpath("/html/body/span/div[1]/section/div/div[2]/div[1]/form/button"));
        int maxPrice = 2400;
        if (getFinalPrice() > maxPrice) {
            click(removeItemFromShoppingCartButton);
        }
        Thread.sleep(3000);
        return this;
    }

    /**
     * Method for verifying that the terms and conditions button are displayed
     */
    public ShoppingCartPage verifyTermsButtonIsDisplayed() {
        WebElement termsCheckboxButtonSelector = driver.findElement(By.xpath("//*[@id=\"shopping-cart-span\"]/div[1]/aside/div[1]/div/div[5]/div[1]/div/label"));
        waitForVisibilityOf(termsCheckboxButtonSelector);
        Assertions.assertTrue(termsCheckboxButtonSelector.isDisplayed());
        return this;
    }

    /**
     * Method for verifying that continue as client and continue as guest button are enabled
     */
    public ShoppingCartPage verifyClientButtonAndGuestButtonAreInactive() {
        WebElement continueAsClientButtonSelector = driver.findElement(By.xpath("//div[@data-widget=\"2876962483225389488\"]"));
        WebElement continueAsGuestButtonSelector = driver.findElement(By.xpath("//div[@data-id=\"43350735336018624\"]"));
        Assertions.assertTrue(continueAsClientButtonSelector.isEnabled());
        Assertions.assertTrue(continueAsGuestButtonSelector.isEnabled());
        return this;
    }

    /**
     * Method for clicking on terms and conditions button
     */
    public ShoppingCartPage clickOnTermsButton() {
        WebElement termsCheckboxButtonSelector = driver.findElement(By.xpath("//*[@id=\"shopping-cart-span\"]/div[1]/aside/div[1]/div/div[5]/div[1]/div/label"));
        scroll(termsCheckboxButtonSelector);
        click(termsCheckboxButtonSelector);
        return this;
    }

    /**
     * Method for verifying that continue as client and continue as guest buttons are enabled
     */
    public ShoppingCartPage verifyClientButtonAndGuestButtonAreActive() {
        WebElement continueAsClientButtonSelector = driver.findElement(By.xpath("//div[@data-widget=\"2876962483225389488\"]"));
        WebElement continueAsGuestButtonSelector = driver.findElement(By.xpath("//div[@data-id=\"43350735336018624\"]"));
        waitForVisibilityOf(continueAsClientButtonSelector);
        waitForVisibilityOf(continueAsGuestButtonSelector);
        Assertions.assertTrue(continueAsClientButtonSelector.isEnabled());
        Assertions.assertTrue(continueAsGuestButtonSelector.isEnabled());
        return this;
    }

    /**
     * Method for removing items from shopping cart
     */
    public ShoppingCartPage removeAllItemsFromShoppingCart() {
         if (getFinalPrice() > 1) {
            driver.findElement(By.xpath("//button[@type='submit']/em")).click();
        };
         return this;
    }

    /**
     * Method for verifying that shopping cart are empty
     * @throws InterruptedException
     */
    public void verifyEmptyShoppingCart() throws InterruptedException {
        Thread.sleep(3000);
        waitForVisibilityOf(driver.findElement(By.xpath("//*[@id=\"shopping-cart-span\"]/div[1]/div/div/section/div/div/h3")));
        Assertions.assertEquals("В момента кошницата ви е празна", driver.findElement(By.xpath("//*[@id=\"shopping-cart-span\"]/div[1]/div/div/section/div/div/h3")).getText());
    }
}
