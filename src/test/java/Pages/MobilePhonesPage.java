package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MobilePhonesPage extends BasePage {

    private By appleBrandButtonSelector = By.xpath("//*[@id=\"filter-manufacturer\"]/label[1]/em");
    private WebElement goldColorButtonSelector = driver.findElement(By.cssSelector("#filter-colors\\.color > label:nth-child(1) > em"));

    public MobilePhonesPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method that filters by brand Apple and color Gold
     * @return clicking on brand apple and color gold
     */
    public MobilePhonesPage findAppleIphone13ProMax256GB() throws InterruptedException {
        click(appleBrandButtonSelector);
        scroll(goldColorButtonSelector);
        click(goldColorButtonSelector);
        Thread.sleep(3000);
        return this;
    }

    /**
     * Method that choose Apple Iphone 13 Pro Max 256 GB
     * @return clicking on Apple Iphone 13 pro max 256 GB
     */
    public MobilePhonesPage chooseAppleIphone13ProMax128GB() {
        click(driver.findElement(By.xpath("//a[contains(@href, 'apple-iphone-13-pro-max-256gb')]")));
        return this;
    }

}
