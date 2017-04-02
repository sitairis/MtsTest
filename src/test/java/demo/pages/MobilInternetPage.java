package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class MobilInternetPage extends BaseForm {
    private Button btnMobInterPhone;

    public MobilInternetPage(String path){
        super(By.linkText(path),"Mobil Internet Page");
    }

    /*Перейти на страницу "Мобильный интернет для телефона"*/
    public void openMobilInternPhone(String path){
        btnMobInterPhone = new Button(By.linkText(path), "Mobil Internet for phone");
        btnMobInterPhone.click();
    }

}
