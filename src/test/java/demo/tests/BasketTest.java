package demo.tests;

import demo.pages.BasketPage;
import demo.pages.InternShopPage;
import demo.pages.MainPage;
import demo.pages.MobilPhonePage;
import webdriver.BaseTest;

public class BasketTest extends BaseTest {
    @Override
    public void runTest() {
        logStep();
        MainPage mainPage = new MainPage(getpMainPage());
        mainPage.openInternShop(getBtnInternShop());

        logStep();
        for (String handle : getBrowser().getDriver().getWindowHandles()) {
            getBrowser().getDriver().switchTo().window(handle);
        }
        InternShopPage internShopPage = new InternShopPage(getInternShopPage());
        internShopPage.openMobilPhone(getBtnMobilPhone());

        logStep();
        MobilPhonePage mobilPhonePage = new MobilPhonePage(getMobilPhonePage());
        mobilPhonePage.addToBasket(getBtnAddToBasket());
        getBrowser().getDriver().navigate().refresh();
        getBrowser().waitForPageToLoad();

        logStep();
        mobilPhonePage.openBasket(getBtnBasket());
        BasketPage basketPage = new BasketPage(getBasketPage());
        basketPage.testBasketIsAmpty(getTxbSumTotal());
    }

}
