package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By FirstName= By.id("BillingNewAddress_FirstName");
    By LastName= By.id("BillingNewAddress_LastName");
    By Emailid= By.id("BillingNewAddress_Email");
    By Country= By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By State= By.id("BillingNewAddress_StateProvinceId");
    By City=By.id("BillingNewAddress_City");
    By Address=By.id("BillingNewAddress_Address1");
    By Zipcode=By.id("BillingNewAddress_ZipPostalCode");
    By PhoneNumber=By.id("BillingNewAddress_PhoneNumber");
    By ContinueButton=By.xpath("//button[@onclick='Billing.save()']");
    By Shippingtype=By.xpath("//input[@id='shippingoption_1']");
    By Continue1=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");


    public void EnterYourName(){
        sendTextToElement(FirstName,"Kishan");
    }
    public void EnterLastName(){
        sendTextToElement(LastName,"Patel");
    }
    public void EnterYourEmail(){
        sendTextToElement(Emailid,"primeQA123@gmail.com");
    }
    public void SelectYourCountry(){
        selectByValueFromDropDown(Country,"1");
    }
    public void SelectYourState(){
        selectByValueFromDropDown(State,"47");
    }
    public void EnterYourCity(){
        sendTextToElement(City,"Shrewsbury");
    }
    public void EnterYourAddress(){
        sendTextToElement(Address,"01 Near CVS");
    }
    public void EnterYourZipcode(){
        sendTextToElement(Zipcode,"01545");
    }
    public void EnterYourPhone(){
        sendTextToElement(PhoneNumber,"4383502324");
    }
    public void clickOnContinueButton(){
        clickOnElement(ContinueButton);
    }
    public void SelectShppingMethod(){
        clickOnElement(Shippingtype);
    }
    public void selectContinuetoFurther(){
        clickOnElement(Continue1);
    }



}
