package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MobilePhonesPageTest extends BaseTest {

    @Test
    @DisplayName("Choosing Apple Iphone 13 Pro Max 256 GB")
    public void canClickOnMobilePhonesButton() throws InterruptedException {
        web.homePage().acceptCookies();
        web.homePage().clickDevicesHeaderButtonSelector();
        web.homePage().clickMobilePhonesExpandedButtonSelector();
        web.mobilePhonesPage().findAppleIphone13ProMax256GB();
        web.mobilePhonesPage().chooseAppleIphone13ProMax128GB();
    }

}
