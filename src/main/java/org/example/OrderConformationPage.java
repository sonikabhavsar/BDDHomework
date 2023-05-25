package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConformationPage extends Utils{
    static String expectedMessage1 ="Billing Address";
    private By _getMessage=By.xpath("(//div[@class='title'])[1]");
    private By _orderNumber =By.xpath("//div[@class='order-number']/strong");
    private By _continueButton =By.xpath("//button[@class='button-1 order-completed-continue-button']");
    LoadProp loadProp = new LoadProp();
    public void verityUserShouldSeeOrderConformation(){

        Assert.assertEquals(getTextFromElement(_getMessage),loadProp.getProperty("expectedMessage1"));
        String actualMessage1=getTextFromElement(_orderNumber);
      //  System.out.println("confirm:"+actualMessage1);
        //click the continue button
        clickOnElement( _continueButton);
    }
}
