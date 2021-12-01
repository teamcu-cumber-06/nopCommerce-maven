package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By AmountVerification=By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By IagreeButton=By.xpath("//input[@id='termsofservice']");
    By Checkout=By.xpath("//button[@id='checkout']");
    By GuestPage=By.xpath("//button[normalize-space()='Checkout as Guest']");


    public String verifyAmountText(){
      return   getTextFromElement(AmountVerification);
    }
    public void clickOnIagreeCheckBox(){
        clickOnElement(IagreeButton);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(Checkout);
    }
    public void clickonCheckOutasGuest(){
        clickOnElement(GuestPage);
    }

}
