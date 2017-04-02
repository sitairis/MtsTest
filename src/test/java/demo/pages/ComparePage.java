package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class ComparePage extends BaseForm {
    private Button btnHide;

    public ComparePage(String path){
        super(By.xpath(path), "Compare page");
    }

    /*Скрыть/показать одинаковые параметры*/
    public void hideParameters(String path){
        btnHide = new Button(By.linkText(path), "Hide parameters");
        btnHide.click();
    }

    /*Сравнить поля*/
    public void compare(String pathFirst, String pathSecond){
        Label lblCompareFirst = new Label(By.xpath(pathFirst), "Field first for comparison");
        Label lblCompareSecond = new Label(By.xpath(pathSecond), "Field second for comparison");
        if(lblCompareFirst.isPresent() && lblCompareSecond.isPresent())
            info(getLoc("Fields are different"));
        else
            info(getLoc("Fields are equal"));
    }

}
