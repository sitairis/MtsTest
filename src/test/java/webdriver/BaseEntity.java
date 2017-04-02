package webdriver;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static org.testng.AssertJUnit.assertTrue;


/**
 * BaseEntity
 */
public abstract class BaseEntity {

    protected static int stepNumber = 1;
    protected static Logger logger = Logger.getInstance();
    protected static Browser browser = Browser.getInstance();
    protected ITestContext context;

    private String btnMobilInter;
    private String pMainPage;
    private String mobilInternPage;
    private String btnMobInterPhone;
    private String mobilInternPhonePage;
    private String btnSmartBox;
    private String smartBoxPage;
    private String textMtsSmart;
    private String txbText;
    private String txbSerch;
    private String SearchPage;
    private String numberResults;
    private String sltWhere;
    private String valueSelect;
    private String btnSearch;
    private String linkNews;
    private String newsPage;
    private String pageThree;
    private String btnInternShop;
    private String internShopPage;
    private String btnMobilPhone;
    private String mobilPhonePage;
    private String ckbFirm;
    private String txbDiagonal;
    private String valueDiagonal;
    private String txbPrice;
    private String valuePrice;
    private String txbCamera;
    private String valueCamera;
    private String btnAdvancedSearch;
    private String btnShow;
    private String phonePage;
    private String numberResultsPhone;
    private String txbFirmPhone;
    private String valueFirm;
    private String txbPricePhone;
    private String txbDiagonalPhone;
    private String txbCameraPhone;
    private String btnAddToBasket;
    private String btnBasket;
    private String basketPage;
    private String txbSumTotal;
    private String compareFirst;
    private String compareSecond;
    private String btnCompare;
    private String comparePage;
    private String btnHide;
    private String lblComparePriceFirst;
    private String lblComparePriceSecond;
    private String lblCompareDiagonalFirst;
    private String lblCompareDiagonalSecond;

    /**
     * Get locale
     *
     * @param key key
     * @return value
     */
    protected static String getLoc(final String key) {
        return Logger.getLoc(key);
    }

    // ==============================================================================================
    // Methods for logging

    /**
     * Logging a step number.
     *
     * @param step - step number
     */
    public static void logStep(final int step) {
        logger.step(step);
    }

    /**
     * Format message.
     *
     * @param message message
     * @return null
     */
    protected abstract String formatLogMsg(String message);

    /**
     * Informative message.
     *
     * @param message Message
     */
    protected void info(final String message) {
        logger.info(formatLogMsg(message));
    }

    /**
     * Warning.
     *
     * @param message Message
     */
    protected void warn(final String message) {
        logger.warn(formatLogMsg(message));
    }

    /**
     * Error message without stopping the test.
     *
     * @param message Message
     */
    protected void error(final String message) {
        logger.error(formatLogMsg(message));
    }

    /**
     * Fatal error message.
     *
     * @param message Message
     */
    protected void fatal(final String message) {
        logger.fatal(formatLogMsg(message));
        assertTrue(formatLogMsg(message), false);
    }

    /**
     * Logging a several steps in a one action
     *
     * @param fromStep - the first step number to be logged
     * @param toStep   - the last step number to be logged
     */
    public void logStep(final int fromStep, final int toStep) {
        logger.step(fromStep, toStep);
    }

    // ==============================================================================================
    // Asserts

    /**
     * Universal method
     *
     * @param isTrue  Condition
     * @param passMsg Positive message
     * @param failMsg Negative message
     */
    public void doAssert(final Boolean isTrue, final String passMsg,
                         final String failMsg) {
        if (isTrue) {
            info(passMsg);
        } else {
            fatal(failMsg);
        }
    }

    /**
     * Assert Objects are Equal
     *
     * @param expected Expected Value
     * @param actual   Actual Value
     */
    public void assertEquals(final Object expected, final Object actual) {
        if (!expected.equals(actual)) {
            fatal("Expected value: '" + expected + "', but was: '" + actual
                    + "'");
        }
    }


    /**
     * Assert Objects are Equal
     *
     * @param message  Fail Message
     * @param expected Expected Value
     * @param actual   Actual Value
     */
    public void assertEquals(final String message, final Object expected,
                             final Object actual) {
        if (!expected.equals(actual)) {
            fatal(message);
        }
    }

    /**
     * Before Class method
     */
    @Parameters({"pMainPage", "btnMobilInter", "mobilInternPage", "btnMobInterPhone", "mobilInternPhonePage", "btnSmartBox"
    , "smartBoxPage", "textMtsSmart", "txbText", "txbSerch", "SearchPage", "numberResults", "sltWhere", "valueSelect"
    , "btnSearch", "linkNews", "newsPage", "pageThree", "btnInternShop", "internShopPage", "btnMobilPhone"
    , "mobilPhonePage", "ckbFirm", "txbDiagonal", "valueDiagonal", "txbPrice", "valuePrice", "txbCamera", "valueCamera"
    , "btnAdvancedSearch", "btnShow", "phonePage", "numberResultsPhone", "txbFirmPhone", "valueFirm", "txbPricePhone"
    , "txbDiagonalPhone", "txbCameraPhone", "btnAddToBasket", "btnBasket", "basketPage", "txbSumTotal", "compareFirst"
    , "compareSecond", "btnCompare", "comparePage", "btnHide", "lblComparePriceFirst", "lblComparePriceSecond"
    , "lblCompareDiagonalFirst", "lblCompareDiagonalSecond"})
    @BeforeClass
    public void before(ITestContext context, String pMainPage, String btnMobilInter, String mobilInternPage
    , String btnMobInterPhone, String mobilInternPhonePage, String btnSmartBox, String smartBoxPage
    , String textMtsSmart, String txbText, String txbSerch, String SearchPage, String numberResults
    , String sltWhere, String valueSelect, String btnSearch, String linkNews, String newsPage
    , String pageThree, String btnInternShop, String internShopPage, String btnMobilPhone
    , String mobilPhonePage, String ckbFirm, String txbDiagonal, String valueDiagonal, String txbPrice
    , String valuePrice, String txbCamera, String valueCamera, String btnAdvancedSearch, String btnShow
    , String phonePage, String numberResultsPhone, String txbFirmPhone, String valueFirm, String txbPricePhone
    , String txbDiagonalPhone, String txbCameraPhone, String btnAddToBasket, String btnBasket
    , String basketPage, String txbSumTotal, String compareFirst, String compareSecond, String btnCompare
    , String comparePage, String btnHide, String lblComparePriceFirst, String lblComparePriceSecond
    , String lblCompareDiagonalFirst, String lblCompareDiagonalSecond) {
        this.context = context;
        browser = Browser.getInstance();
        browser.windowMaximise();
        stepNumber = 1;
        this.pMainPage = pMainPage;
        this.btnMobilInter = btnMobilInter;
        this.mobilInternPage = mobilInternPage;
        this.btnMobInterPhone = btnMobInterPhone;
        this.mobilInternPhonePage = mobilInternPhonePage;
        this.btnSmartBox = btnSmartBox;
        this.smartBoxPage =smartBoxPage;
        this.textMtsSmart = textMtsSmart;
        this.txbText = txbText;
        this.txbSerch = txbSerch;
        this.SearchPage = SearchPage;
        this.numberResults =numberResults;
        this.sltWhere = sltWhere;
        this.valueSelect = valueSelect;
        this.btnSearch = btnSearch;
        this.linkNews = linkNews;
        this.newsPage = newsPage;
        this.pageThree = pageThree;
        this.btnInternShop = btnInternShop;
        this.internShopPage = internShopPage;
        this.btnMobilPhone = btnMobilPhone;
        this.mobilPhonePage = mobilPhonePage;
        this.ckbFirm = ckbFirm;
        this.txbDiagonal = txbDiagonal;
        this.valueDiagonal = valueDiagonal;
        this.txbPrice = txbPrice;
        this.valuePrice = valuePrice;
        this.txbCamera = txbCamera;
        this.valueCamera = valueCamera;
        this.btnAdvancedSearch = btnAdvancedSearch;
        this.btnShow = btnShow;
        this.phonePage = phonePage;
        this.numberResultsPhone = numberResultsPhone;
        this.txbFirmPhone = txbFirmPhone;
        this.valueFirm = valueFirm;
        this.txbPricePhone = txbPricePhone;
        this.txbDiagonalPhone = txbDiagonalPhone;
        this.txbCameraPhone = txbCameraPhone;
        this.btnAddToBasket = btnAddToBasket;
        this.btnBasket = btnBasket;
        this.basketPage = basketPage;
        this.txbSumTotal = txbSumTotal;
        this.compareFirst = compareFirst;
        this.compareSecond = compareSecond;
        this.btnCompare = btnCompare;
        this.comparePage = comparePage;
        this.btnHide =btnHide;
        this.lblComparePriceFirst = lblComparePriceFirst;
        this.lblComparePriceSecond = lblComparePriceSecond;
        this.lblCompareDiagonalFirst = lblCompareDiagonalFirst;
        this.lblCompareDiagonalSecond = lblCompareDiagonalSecond;
    }

    public static Logger getLogger() {
        return logger;
    }

    public String getLblCompareDiagonalFirst() {
        return lblCompareDiagonalFirst;
    }

    public String getLblCompareDiagonalSecond() {
        return lblCompareDiagonalSecond;
    }

    public String getLblComparePriceFirst() {
        return lblComparePriceFirst;
    }

    public String getLblComparePriceSecond() {
        return lblComparePriceSecond;
    }

    public String getBtnHide() {
        return btnHide;
    }

    public String getComparePage() {
        return comparePage;
    }

    public String getBtnCompare() {
        return btnCompare;
    }

    public String getCompareSecond() {
        return compareSecond;
    }

    public String getCompareFirst() {
        return compareFirst;
    }

    public String getTxbSumTotal() {
        return txbSumTotal;
    }

    public String getBasketPage() {
        return basketPage;
    }

    public String getBtnBasket() {
        return btnBasket;
    }

    public String getBtnAddToBasket() {
        return btnAddToBasket;
    }

    public String getTxbCameraPhone() {
        return txbCameraPhone;
    }

    public String getTxbDiagonalPhone() {
        return txbDiagonalPhone;
    }

    public String getTxbPricePhone() {
        return txbPricePhone;
    }

    public String getValueFirm() {
        return valueFirm;
    }

    public String getTxbFirmPhone() {
        return txbFirmPhone;
    }

    public String getNumberResultsPhone() {
        return numberResultsPhone;
    }

    public String getPhonePage() {
        return phonePage;
    }

    public String getBtnShow() {
        return btnShow;
    }

    public String getBtnAdvancedSearch() {
        return btnAdvancedSearch;
    }

    public String getValueCamera() {
        return valueCamera;
    }

    public String getTxbCamera() {
        return txbCamera;
    }

    public String getValuePrice() {
        return valuePrice;
    }

    public String getTxbPrice() {
        return txbPrice;
    }

    public String getValueDiagonal() {
        return valueDiagonal;
    }

    public String getTxbDiagonal() {
        return txbDiagonal;
    }

    public String getCkbFirm() {
        return ckbFirm;
    }

    public String getMobilPhonePage() {
        return mobilPhonePage;
    }

    public String getBtnMobilPhone() {
        return btnMobilPhone;
    }

    public String getInternShopPage() {
        return internShopPage;
    }

    public String getBtnInternShop() {
        return btnInternShop;
    }

    public String getPageThree() {
        return pageThree;
    }

    public String getNewsPage() {
        return newsPage;
    }

    public String getLinkNews() {
        return linkNews;
    }

    public String getBtnSearch() {
        return btnSearch;
    }

    public String getValueSelect() {
        return valueSelect;
    }

    public String getSltWhere() {
        return sltWhere;
    }

    public String getNumberResults() {
        return numberResults;
    }

    public String getSearchPage() {
        return SearchPage;
    }

    public String getTxbSerch() {
        return txbSerch;
    }

    public String getTxbText() {
        return txbText;
    }

    public String getTextMtsSmart() {
        return textMtsSmart;
    }

    public static int getStepNumber() {
        return stepNumber;
    }

    public String getBtnMobilInter() {
        return btnMobilInter;
    }

    public String getpMainPage() {
        return pMainPage;
    }

    public String getMobilInternPage() {
        return mobilInternPage;
    }

    public String getBtnMobInterPhone() {
        return btnMobInterPhone;
    }

    public String getMobilInternPhonePage() {
        return mobilInternPhonePage;
    }

    public String getBtnSmartBox() {
        return btnSmartBox;
    }

    public String getSmartBoxPage() {
        return smartBoxPage;
    }

    public static Browser getBrowser() {
        return browser;
    }

    /**
     * Close browser after each test Class
     */
    @AfterClass
    public void after() {

        if (browser.isBrowserAlive()) {
            browser.exit();
        }
    }

    /**
     * Logging steps
     */
    protected void logStep() {
        logStep(stepNumber++);
    }

    /**
     * Logging steps with info
     */
    protected void logStep(final String info) {
        logStep(stepNumber++);
        logger.info(String.format("----==[ %1$s ]==----", info));
    }


}
