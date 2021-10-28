package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartPageTest extends BaseTest {

    @Test
    @DisplayName("Can add and remove devices to shopping cart")

    public void canAddAndRemoveItemsFromShoppingCart() throws InterruptedException {
        web.homePage().acceptCookies();
        web.homePage().clickDevicesHeaderButtonSelector();
        web.homePage().clickMobilePhonesExpandedButtonSelector();
        web.mobilePhonesPage().findAppleIphone13ProMax256GB();
        web.mobilePhonesPage().chooseAppleIphone13ProMax128GB();
        web.addToCartPage().canAddSelectedDeviceToShoppingCart();
        web.shoppingCartPage().verifyShoppingCartUrl();
        web.shoppingCartPage().clickOnSeeMoreButton();
        web.homePage().getToHomePage();
        web.homePage().clickDevicesHeaderButtonSelector();
        web.homePage().clickAccessoriesExpandedButtonSelector();
        web.accessoriesPage().clickOnAppleBrandButton();
        web.accessoriesPage().clickOnOverFortyBGNButton();
        web.accessoriesPage().chooseAppleIphoneProMaxLeatherCase();
        web.accessoriesPage().clickSubmitButton();
        web.shoppingCartPage().verifyShoppingCartUrl();
        web.shoppingCartPage().compareFinalPrice();
        web.shoppingCartPage().verifyTermsButtonIsDisplayed();
        web.shoppingCartPage().verifyClientButtonAndGuestButtonAreInactive();
        web.shoppingCartPage().clickOnTermsButton();
        web.shoppingCartPage().verifyClientButtonAndGuestButtonAreActive();
        web.shoppingCartPage().removeAllItemsFromShoppingCart();
        web.shoppingCartPage().verifyEmptyShoppingCart();
    }
}
