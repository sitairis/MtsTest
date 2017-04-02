package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Select;

public class SearchPage extends BaseForm {
    private Select sltWhere;
    private Button btnSearch;

    public SearchPage(String path) {
        super(By.xpath(path), "Search results page");
    }

    /*Выбрать категорию поиска*/
    public void selectWhere(String name, String value){
        sltWhere = new Select(By.name(name), "Select where search");
        sltWhere.selectItem(value);
    }

    /*Поиск*/
    public void search(String id){
        btnSearch = new Button(By.id(id), "Button search");
        btnSearch.click();
    }

    /*Перейти на страницу ссылки*/
    public void openNewsPage(String path){
        Button linkNews = new Button(By.xpath(path), "Link news");
        linkNews.click();
    }

    /*Перейти на другую(третью) страницу*/
    public void openPageThree(String path){
        Button btnPage = new Button(By.xpath(path), "Page three of search results");
        btnPage.click();
    }

}
