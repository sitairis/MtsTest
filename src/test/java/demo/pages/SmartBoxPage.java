package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.TextBox;

public class SmartBoxPage extends BaseForm {

    public SmartBoxPage(String path) {
        super(By.xpath(path), "Mobil Internet Phone Page");
    }

    /*Поиск текста на странице*/
    public void searchText(String text, String path){
        TextBox txbText = new TextBox(By.xpath(path));
        String sText = txbText.getText();
        if(sText.contains(text))
            info(getLoc("text found"));
        else
           info(getLoc("text not found"));
    }


}
