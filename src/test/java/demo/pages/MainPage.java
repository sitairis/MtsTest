package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class MainPage extends BaseForm {
    private Button btnMobilInter;
    private TextBox txbSearch;
    private Button btnInternShop;

    public MainPage(String path) {
        super(By.linkText(path),"Main Page");
    }

    /*Перейти на страницу мобильный интернет и ТВ*/
    public void openMobilInternet(String path){
        btnMobilInter = new Button(By.linkText(path), "Mobil internet and TV");
        btnMobilInter.click();
    }

    /*Работа со строкой поиска*/
    public void searchText(String name, String text){
        txbSearch = new TextBox(By.name(name), "Search line");
        txbSearch.setText(text);
        txbSearch.getElement().submit();
    }

    /*Перейти на страницу инткрнет-магазина*/
    public void openInternShop(String path){
        btnInternShop = new Button(By.linkText(path), "Internet shop");
        btnInternShop.click();
    }

}
