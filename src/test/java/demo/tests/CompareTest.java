package demo.tests;

import demo.pages.ComparePage;
import demo.pages.InternShopPage;
import demo.pages.MainPage;
import webdriver.BaseTest;

public class CompareTest extends BaseTest {
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

        internShopPage.addCompare(getCompareFirst());
        getBrowser().waitForPageToLoad();
        internShopPage.addCompare(getCompareSecond());


        logStep();
        getBrowser().waitForPageToLoad();
        internShopPage.openCompare(getBtnCompare());
        ComparePage comparePage = new ComparePage(getComparePage());
        comparePage.hideParameters(getBtnHide());

        logStep();
        comparePage.compare(getLblComparePriceFirst(), getLblComparePriceSecond());
        comparePage.compare(getLblCompareDiagonalFirst(), getLblCompareDiagonalSecond());
    }
}
