package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.TextBox;

public class PhonePage extends BaseForm{

    public PhonePage(String path) {
        super(By.className(path),"Phone page");
    }

    /*Проверить название фирмы производителя на соответствие заданному*/
    public void testFirm(String firm, String path){
        TextBox txbFirm = new TextBox(By.xpath(path),"Brend phone");
        String firmPhone = txbFirm.getText();
        if(firmPhone.toLowerCase().contains(firm.toLowerCase()))
            info(getLoc("Brend coincides"));
    }

    /*Проверить цену на условие*/
    public void testPrice(String price, String path){
        TextBox txbPricePhone = new TextBox(By.xpath(path),"Price phone");
        if(txbPricePhone.isPresent()){
            String[] pricePhone = txbPricePhone.getText().split("\\D");
            if(Integer.parseInt(pricePhone[0])<=Integer.parseInt(price))
                info(getLoc("Price coincides"));
        }
        else
            info(getLoc("No search price"));

    }

    /*Проверить диагонать на условие*/
    public void testDiagonal(String diagonal, String path){
        TextBox txbDiagonalPhone = new TextBox(By.xpath(path),"Diagonal phone");
        String [] diagonalPhone = txbDiagonalPhone.getText().split("\\D");
        if(Integer.parseInt(diagonalPhone[0]) <= Integer.parseInt(diagonal))
            info(getLoc("Diagonal coincides"));
    }

    /*Проверить качество камеры на условие*/
    public void testCamera(String camera, String path){
        TextBox txbCameraPhone = new TextBox(By.xpath(path),"Camera phone");
        String [] cameraPhone = txbCameraPhone.getText().split("\\D");
        if(Integer.parseInt(cameraPhone[0])<= Integer.parseInt(camera))
            info(getLoc("Camera coincides"));
    }

}
