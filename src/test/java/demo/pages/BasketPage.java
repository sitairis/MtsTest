package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.TextBox;

public class BasketPage extends BaseForm {
    private TextBox txbSumTotal;

    public BasketPage(String path) {
        super(By.xpath(path),"Basket page");
    }

    /*Проверка наличия содержимого в карзине*/
    public void testBasketIsAmpty(String path){
        txbSumTotal = new TextBox(By.xpath(path), "Total summ on basket page");
        txbSumTotal.isPresent();
    }

}
