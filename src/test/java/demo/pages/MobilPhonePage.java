package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.CheckBox;
import webdriver.elements.TextBox;

public class MobilPhonePage  extends BaseForm {
    private Button btnAdvancedSearch;
    private CheckBox ckbFirm;
    private TextBox txbDiagonal;
    private TextBox txbPrice;
    private TextBox txbCamera;
    private Button btnShow;
    private Button btnPhonePage;
    private TextBox txbWait;
    private Button btnAddToBasket;
    private Button btnBasket;

    public MobilPhonePage(String path) {
        super(By.xpath(path),"Mobil phone page");
    }

    /*Выбрать фирму*/
    public void checkFirm(String path){
        ckbFirm = new CheckBox(By.xpath(path), "Chek brend");
        ckbFirm.waitForIsElementPresent();
        ckbFirm.check();
    }

    /*Выбрать диагональ экрана*/
    public void setDiagonal(String name, String value){
        txbDiagonal = new TextBox(By.name(name), "Enter diagonal");
        txbDiagonal.setText(value);
    }

    /*Установить максимальную цену*/
    public void setPrice(String name, String value){
        txbPrice = new TextBox(By.name(name), "Enter price");
        txbPrice.setText(value);
    }

    /*Открыть расширенный поиск*/
    public void openAdvancedSearch(String path){
        btnAdvancedSearch = new Button(By.linkText(path), "Advanced search");
        btnAdvancedSearch.click();
    }

    /*Установить количество Мп(мегапиксель) для фронтальной камеры*/
    public void setCamera(String name, String value){
        txbCamera = new TextBox(By.name(name), "Enter diagonal of camera");
        txbCamera.waitForIsElementPresent();
        txbCamera.setText(value);
    }

    /*Поиск результатов на основе фильтров*/
    public void setFilter(String path){
        btnShow = new Button(By.xpath(path), "Search");
        btnShow.click();
    }

    /*Открыть страницу телефона*/
    public void openPhonePage(String path){
        btnPhonePage = new Button(By.xpath(path), "Open phone page");
        btnPhonePage.isPresent(30);
        btnPhonePage.click();
    }

    /*Добавить товар в корзину*/
    public void addToBasket(String path){
        btnAddToBasket = new Button(By.xpath(path), "Add phone to basket");
        btnAddToBasket.click();
    }

    /*Открыть корзину*/
    public void openBasket(String path){
        btnBasket = new Button(By.xpath(path), "Open basket page");
        btnBasket.click();
    }
}
