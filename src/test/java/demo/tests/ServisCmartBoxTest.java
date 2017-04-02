package demo.tests;

import demo.pages.MainPage;
import demo.pages.MobilInternetPage;
import demo.pages.MobilInternetPhonePage;
import demo.pages.SmartBoxPage;
import webdriver.BaseTest;

public class ServisCmartBoxTest extends BaseTest {

    @Override
    public void runTest() {
        logStep();
        MainPage mainPage = new MainPage(getpMainPage());
        mainPage.openMobilInternet(getBtnMobilInter());

        logStep();
        MobilInternetPage mobilInternetPage = new MobilInternetPage(getMobilInternPage());
        mobilInternetPage.openMobilInternPhone(getBtnMobInterPhone());

        logStep();
        MobilInternetPhonePage mobilInternetPhonePage = new MobilInternetPhonePage(getMobilInternPhonePage());
        mobilInternetPhonePage.openSmartBoxPage(getBtnSmartBox());

        logStep();
        SmartBoxPage smartBoxPage = new SmartBoxPage(getSmartBoxPage());
        smartBoxPage.searchText(getTextMtsSmart(), getTxbText());
    }
}
