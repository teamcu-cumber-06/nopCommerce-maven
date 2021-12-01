package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {
    By Creditcard = By.xpath("//input[@id='paymentmethod_1']");
    By Continue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By Mastercard = By.xpath("//select[@id='CreditCardType']");
    By CardHolderName = By.xpath("//input[@id='CardholderName']");
    By CardNumber = By.xpath("//input[@id='CardNumber']");
    By ExpiredMonth = By.xpath("//select[@id='ExpireMonth']");
    By ExpiredYear = By.xpath("//select[@id='ExpireYear']");
    By CVV = By.xpath("//input[@id='CardCode']");
    By PaymentContinue=By.xpath("//button[@onclick='PaymentInfo.save()']");
    By ConfirmButton=By.xpath("//button[normalize-space()='Confirm']");
    By ThankyouMsg=By.xpath("//h1[contains(text(),'Thank you')]");
    By OrderStatus=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By clickContinueToHomePage=By.xpath("//button[contains(text(),'Continue')]");
    By WelcomeStoreText=By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void selectPaymentMethod() {
        clickOnElement(Creditcard);
    }

    public void ClickonContinue() {
        clickOnElement(Continue);
    }

    public void Selectcard() {
        selectByValueFromDropDown(Mastercard, "MasterCard");
    }

    public void EnterCardHolderName() {
        sendTextToElement(CardHolderName,"Kishan");
    }
    public void EnterCardNumber() {
        sendTextToElement(CardNumber,"5105105105105100");
    }
    public void EnterMonthofCard() {
        selectByValueFromDropDown(ExpiredMonth, "12");
    }
    public void EnterYearofCard() {
        selectByValueFromDropDown(ExpiredYear, "2023");
    }
    public void EnterCardCVV() {
        sendTextToElement(CVV,"555");
    }
    public void clickContinueforPayment(){
        clickOnElement(PaymentContinue);
    }
    public void clicktoConfirm(){
        clickOnElement(ConfirmButton);
    }
    public String verifyThankYoutext(){
        return getTextFromElement(ThankyouMsg);
    }
    public String verifyOrderStatus(){
        return  getTextFromElement(OrderStatus);
    }
    public void clickContinuetoHome(){
        clickOnElement(clickContinueToHomePage);
    }
    public String verifyTextOnHomePage(){
        return getTextFromElement(WelcomeStoreText);
    }


}
