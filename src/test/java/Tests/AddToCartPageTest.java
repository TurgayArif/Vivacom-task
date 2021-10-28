package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddToCartPageTest extends BaseTest {
    @Test
    @DisplayName("Adding selected device to cart")

    public void canAddSelectedDeviceToCart() throws InterruptedException {
        web.homePage().clickDevicesHeaderButtonSelector();
        web.homePage().clickMobilePhonesExpandedButtonSelector();
        web.mobilePhonesPage().findAppleIphone13ProMax256GB();
        web.mobilePhonesPage().chooseAppleIphone13ProMax128GB();
        web.addToCartPage().canAddSelectedDeviceToShoppingCart();
    }
}
