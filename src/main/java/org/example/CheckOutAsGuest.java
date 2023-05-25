package org.example;

import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utils{
    private By _checkOutGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    private By _firstName =By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName =By.cssSelector("input#BillingNewAddress_LastName");
    private By _emailAddress = By.cssSelector("input#BillingNewAddress_Email");
    private By _companyName =By.cssSelector("input#BillingNewAddress_Company");
    private By _countryName =By.cssSelector("select#BillingNewAddress_CountryId");
    // private By _state =By.cssSelector("select#BillingNewAddress_StateProvinceId");
    private By _cityName =By.cssSelector("input#BillingNewAddress_City");
    private By _address1 =By.cssSelector("input#BillingNewAddress_Address1");
    private By _zip =By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _phoneNumber =By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _faxNumber =By.cssSelector("input#BillingNewAddress_FaxNumber");
    private By _continueButton = By.xpath("//button[@class='button-1 new-address-next-step-button']");
    private By _nextDayAir =By.cssSelector("input#shippingoption_1");
    private By _continueButtonAgain = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private By _creditCardButton = By.cssSelector("input#paymentmethod_1");
    private By _continueButton3 = By.cssSelector(".button-1.payment-method-next-step-button");
    private By _visaType =By.cssSelector("select#CreditCardType");
    private By _cardHolderName =By.cssSelector("input#CardholderName");
    private By _cardHolderNumber =By.cssSelector("input#CardNumber");
    private By _expireMonth =By.cssSelector("select#ExpireMonth");
    private By _expireYear = By.cssSelector("select#ExpireYear");
    private By _cardCode =By.cssSelector("input#CardCode");
    private By _continueAfterCardDetails=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By _orderConformButton =By.cssSelector("button.button-1.confirm-order-next-step-button");

    LoadProp loadProp = new LoadProp();

    public void CheckOutAsGuestSuccessfully(){
        clickOnElement(_checkOutGuest);

    }
    public void BillingAddress(){
        typeText(_firstName,loadProp.getProperty("firstName"));
        typeText(_lastName,loadProp.getProperty("lastName"));
        typeText(_emailAddress,loadProp.getProperty("emilAddress"));
        typeText(_companyName,loadProp.getProperty("companyName"));
        selectDropDownElementByText(_countryName,loadProp.getProperty("countryName"));
        typeText(_cityName,loadProp.getProperty("cityName"));
        typeText(_address1,loadProp.getProperty("addressLine1"));
        typeText(_zip,loadProp.getProperty("zipCode"));
        typeText(_phoneNumber,loadProp.getProperty("phoneNumber"));
        typeText(_faxNumber,loadProp.getProperty("faxNumber"));
        clickOnElement(_continueButton );
        clickOnRadioButtonElement( _nextDayAir);
        clickOnElement( _continueButtonAgain);
        clickOnRadioButtonElement(_creditCardButton);
        clickOnElement(_continueButton3);

    }
    public void PaymentInformation(){
        //selectDropDownElementByText(_visaType,"visa");
        clickOnElement(_visaType);
        //Type cardholder name
        typeText(_cardHolderName,loadProp.getProperty("cardHolderName"));
        //Type cardholder number
        typeText(_cardHolderNumber,loadProp.getProperty("cardHolderNumber"));
        //enter expiry month
        selectDropDownElementByValue(_expireMonth,loadProp.getProperty("expireMonth"));
        //enter expiry year
        selectDropDownElementByValue(_expireYear,loadProp.getProperty("expireYear"));
        //clickOnElement(_cardCode);
        typeText(_cardCode,loadProp.getProperty("cardCode"));
        //click on continue button
        clickOnElement(_continueAfterCardDetails);
        //click on conform order
        clickOnElement(_orderConformButton);
    }
}
