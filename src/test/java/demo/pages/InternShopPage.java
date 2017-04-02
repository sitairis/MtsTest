package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class InternShopPage  extends BaseForm {
    private Button btnMobilPhone;
    private Button btnCompare;

    public InternShopPage(String path) {
        super(By.xpath(path),"Internet Shop Page");
    }

    /*Перейти на страницу "мобильтые телефоны"*/
    public void openMobilPhone(String path){
        btnMobilPhone = new Button(By.linkText(path), "Mobil phones on Internet shop");
        btnMobilPhone.click();
    }

    /*Добавить товар в сравнение*/
    public void addCompare(String path){
        Button btnComparePhone = new Button(By.xpath(path), "Select phone for comparison");
        btnComparePhone.click();
    }

    /*Перейти на страницу сравнения*/
    public void openCompare(String path){
        btnCompare = new Button(By.xpath(path), "Open compare page");
        btnCompare.click();
    }

}
