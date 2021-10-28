package Tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Clicking on Mobile Phones button")
    public void canClickOnMobilePhonesButton() throws InterruptedException {
        web.homePage().acceptCookies();
        web.homePage().clickDevicesHeaderButtonSelector();
        web.homePage().clickMobilePhonesExpandedButtonSelector();
    }
}
