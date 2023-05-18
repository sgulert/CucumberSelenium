package pages;

import org.openqa.selenium.By;
import utils.Driver;

public class GoogleHomePage {


    By search = By.name("q");

    By searchButton = By.name("btnK");


    public void searchFor(String searchKey){
        Driver.getDriver().findElement(search).sendKeys(searchKey);
    }

    public void clickSearchButton(){
        Driver.getDriver().findElement(searchButton).click();
    }
    


}