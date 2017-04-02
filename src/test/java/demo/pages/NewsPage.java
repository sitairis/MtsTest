package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.BaseForm;

import java.util.List;

public class NewsPage extends BaseForm {

    public NewsPage(String path) {
        super(By.className(path), "News page");
    }

    /*Поиск заданного текста на странице*/
    public void searchText(String text){
        List <WebElement> list = getBrowser().getDriver().findElementsByTagName("p");
        boolean flag = false;
        for (WebElement aList : list) {
            if (aList.getText().contains(text))
                flag = true;
        }
        if(flag)
            info(getLoc("Text found"));
        else
            info(getLoc("Text not found"));
    }
}
