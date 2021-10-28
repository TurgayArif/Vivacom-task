package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage extends BasePage {

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method for choosing Unlimited 50 mobile plan and submits the purchase
     * @return clicking on Unlimited 50 mobile plan and clicking on submit button
     * @throws InterruptedException
     */
    public AddToCartPage canAddSelectedDeviceToShoppingCart() throws InterruptedException {
        scrollBy1500();
        WebElement unlimited50RadioButtonSelector = driver.findElement(By.xpath("//*[@id=\"relatedOfferDiv-epc_dpo210924124743053112_so_krc210929142302083428\"]/div[3]/div[2]/div[1]/label"));
        click(unlimited50RadioButtonSelector);
        WebElement submitButtonSelector = driver.findElement(By.xpath("//*[@class=\"btn btn-success js-add-to-cart-btn js-prevent-dblclick\"]"));
        click(submitButtonSelector);
        Thread.sleep(10000);
        return this;
    }
}
