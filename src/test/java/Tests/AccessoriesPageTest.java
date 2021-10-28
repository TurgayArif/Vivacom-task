package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccessoriesPageTest extends BaseTest {
    @Test
    @DisplayName("Adding accessories to shopping cart")

    public void canAddAccessoriesToShoppingPage() throws InterruptedException {
        web.homePage().clickDevicesHeaderButtonSelector()
                .clickAccessoriesExpandedButtonSelector();
        web.accessoriesPage()
                .clickOnAppleBrandButton()
                .clickOnOverFortyBGNButton()
                .chooseAppleIphoneProMaxLeatherCase()
                .clickSubmitButton();
    }
}
