package demo.tests;

import demo.pages.MainPage;
import demo.pages.NewsPage;
import demo.pages.SearchPage;
import webdriver.BaseTest;

public class SearchTest extends BaseTest {
    @Override
    public void runTest() {
        logStep();
        MainPage mainPage = new MainPage(getpMainPage());
        mainPage.searchText(getTxbSerch(), getTextMtsSmart());

        logStep();
        getBrowser().waitForPageToLoad();
        SearchPage searchPage = new SearchPage(getSearchPage());
        searchPage.selectWhere(getSltWhere(), getValueSelect());
        searchPage.search(getBtnSearch());

        logStep();
        getBrowser().waitForPageToLoad();
        int size = searchPage.numberResults(getNumberResults());
        size++;
        for(int i = 1; i<size;i++){
            searchPage.openNewsPage("//li[position()= "+i+"]/a[@id = 'title']");
            NewsPage newsPage = new NewsPage(getNewsPage());
            newsPage.searchText(getTextMtsSmart());
            getBrowser().getDriver().navigate().back();
            info(getLoc("-------------------------------"));
        }

        logStep();
        searchPage.openPageThree(getPageThree());
        getBrowser().waitForPageToLoad();
        int size2 = searchPage.numberResults(getNumberResults());
        size2++;
        for(int i = 1; i<size2;i++){
            searchPage.openNewsPage("//li[position()= "+i+"]/a[@id = 'title']");
            NewsPage newsPage = new NewsPage(getNewsPage());
            newsPage.searchText(getTextMtsSmart());
            getBrowser().getDriver().navigate().back();
            info(getLoc("-------------------------------"));
        }

    }
}
