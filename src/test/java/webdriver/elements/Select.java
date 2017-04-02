package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 31.03.2017.
 */
public class Select extends BaseElement {
    /**
     * @param locator
     * @param name
     */

    public Select(final By locator, final String name) {
        super(locator, name);
    }

    public Select(String string, String name) {
        super(string, name);
    }


    public Select(By locator) {
        super(locator);
    }

    public void selectItem(String value){
        WebElement element = this.getElement();
        element.findElement(By.xpath(".//option[.= '"+value+"']")).click();
        info(getLoc("Select"));
    }

    protected String getElementType() {
        return getLoc("Select");
    }
}

