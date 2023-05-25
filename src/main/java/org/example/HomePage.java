package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils{
    private By _registerButton = By.className("ico-register");
    public String expectedAfterHoverColor="rgba(74, 178, 241, 1)";
    public String getExpectedBeforeHoverColor="rgba(85, 85, 85, 1)";

    public void clickOnRegisterButton() {
        clickOnElement((_registerButton));
    }
    public void hoverOverCategory(String category){
        WebElement element = driver.findElement(By.linkText(category));
        Assert.assertEquals(element.getCssValue("color"),getExpectedBeforeHoverColor);

        //creating object of an action class
        Actions action = new Actions(driver);

        //performing the mouse hover action the target element
        action.moveToElement(element).perform();
        Assert.assertEquals(element.getCssValue("color"),expectedAfterHoverColor);

    }
    public void toVerifySubCategory(String subCategory){
        clickOnElement(By.linkText(subCategory));
    }
    public void toVerifySubCategoryNavigateSuccessfully(String subCategoryPage){
        Assert.assertTrue(getCurrentURL().contains(subCategoryPage));

    }
}

