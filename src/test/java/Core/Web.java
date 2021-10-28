package Core;

import Pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Web {

    private WebDriver driver;

    private HomePage homePage;
    private MobilePhonesPage mobilePhonesPage;
    private ShoppingCartPage shoppingCartPage;
    private AccessoriesPage accessoriesPage;
    private AddToCartPage addToCartPage;

    public Web (WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {

        if(homePage == null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public MobilePhonesPage mobilePhonesPage() {
        if(mobilePhonesPage  == null) {
            mobilePhonesPage = new MobilePhonesPage(driver);
        }
        return mobilePhonesPage;
    }

    public ShoppingCartPage shoppingCartPage() {
        if(shoppingCartPage == null) {
            shoppingCartPage = new ShoppingCartPage(driver);
        }
        return shoppingCartPage;
    }

    public AccessoriesPage accessoriesPage() {
        if(accessoriesPage == null){
            accessoriesPage = new AccessoriesPage(driver);
        }
        return accessoriesPage;
    }

    public AddToCartPage addToCartPage() {
        if(addToCartPage == null){
            addToCartPage = new AddToCartPage(driver);
        }
        return addToCartPage;
    }


}
