package demo.tests;

import demo.pages.InternShopPage;
import demo.pages.MainPage;
import demo.pages.MobilPhonePage;
import demo.pages.PhonePage;
import webdriver.BaseTest;

public class FilterTest extends BaseTest {
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
        mobilPhonePage.checkFirm(getCkbFirm());
        mobilPhonePage.setDiagonal(getTxbDiagonal(), getValueDiagonal());
        mobilPhonePage.setPrice(getTxbPrice(), getValuePrice());
        mobilPhonePage.openAdvancedSearch(getBtnAdvancedSearch());
        mobilPhonePage.setCamera(getTxbCamera(), getValueCamera());
        mobilPhonePage.setFilter(getBtnShow());
        getBrowser().waitForPageToLoad();
        getBrowser().getDriver().navigate().refresh();

        logStep();
        int size = mobilPhonePage.numberResults(getNumberResultsPhone());
        size++;
        for(int i = 1; i< size; i++){
            mobilPhonePage.openPhonePage("//article[position()="+i+"]//a");
            PhonePage phonePage = new PhonePage(getPhonePage());
            phonePage.testFirm(getValueFirm(), getTxbFirmPhone());
            phonePage.testPrice(getValuePrice(), getTxbPricePhone());
            phonePage.testDiagonal(getValueDiagonal(), getTxbDiagonalPhone());
            phonePage.testCamera(getValueCamera(), getTxbCameraPhone());
            getBrowser().getDriver().navigate().back();
            info(getLoc("-------------------------------"));
        }

    }
}
