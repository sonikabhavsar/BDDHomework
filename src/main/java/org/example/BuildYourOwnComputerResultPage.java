package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuildYourOwnComputerResultPage extends Utils{
    private By _productInShoppingCart =By.cssSelector("td[class='product']");
    private By _termOfService =By.cssSelector("input#termsofservice");

    private By _checkoutButton =By.xpath("//Button[@id='checkout']");
    public void productInShoppingCart(){
        List<WebElement> productList =driver.findElements(_productInShoppingCart);
        for (WebElement e:productList){
            System.out.println(e.getText());
        }
    }
    public void checkOut(){
        // click on team of service key
        clickOnElement(_termOfService);
        //click on checkout button as a guest
        clickOnElement(_checkoutButton);
    }
}
