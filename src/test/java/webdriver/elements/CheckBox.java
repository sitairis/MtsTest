package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Created by user on 01.04.2017.
 */
public class CheckBox extends BaseElement {

    /**
     * @param locator
     * @param name
     */
    public CheckBox(final By locator, final String name) {
        super(locator, name);
    }

    public CheckBox(String string, String name) {
        super(string, name);
    }

    public CheckBox(By locator) {
        super(locator);
    }

    public void check(){
        waitForIsElementPresent();
        browser.getDriver().executeScript("arguments[0].style.border='3px solid red'", element);
        element.click();
        info(getLoc("check"));
    }
    protected String getElementType() {
        return getLoc("Checkbox");
    }

}
