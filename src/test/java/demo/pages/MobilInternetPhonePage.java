package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;


public class MobilInternetPhonePage extends BaseForm {
    private Button btnSmartBox;

    public MobilInternetPhonePage(String path) {
        super(By.linkText(path), "Mobil Internet Phone Page");
    }

    /*Перейти на страницу "Смарт-box"*/
    public void openSmartBoxPage(String path){
        btnSmartBox = new Button(By.xpath(path), "Open smart-box page");
        btnSmartBox.click();
    }
}
