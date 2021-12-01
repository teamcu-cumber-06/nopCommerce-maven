package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NopCommerceHomePage extends Utility {

    By ComputerButton= By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
    By ComputerPage=By.xpath("//h1[text()='Computers']");
    By ElectronicButton=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By actualText2= By.xpath("//h1[text()='Electronics']");
    By ApparelButton=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By ApperealText=By.xpath("//h1[text()='Apparel']");
    By DigitalDownloadButton=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']");
    By DigitalDtext=By.xpath("//h1[text()='Digital downloads']");
    By BooksButton=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']");
    By BooksText=By.xpath("//h1[text()='Books']");
    By JewelryButton=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']");
    By JewelryText=By.xpath("//h1[text()='Jewelry']");
    By GiftCardButton=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']");
    By GiftCardText=By.xpath("//h1[text()='Gift Cards']");







    public void clickOnComputerTabOnHomePage(){
        clickOnElement(ComputerButton);
    }
    public String verifyTextinComputerPage(){
        return getTextFromElement(ComputerPage);
    }
    public void clickOnElectronicTab(){
        clickOnElement(ElectronicButton);
    }
    public String verifyTextinElectronicsPage(){
        return getTextFromElement(actualText2);
    }
    public void clickOnApprarelTab(){
        clickOnElement(ApparelButton);
    }
    public void clickOnDigitalDownloadTab(){
        clickOnElement(DigitalDownloadButton);
    }
    public void clickOnBooksTab(){
        clickOnElement(BooksButton);
    }
    public void clickOnJewelryTab(){
        clickOnElement(JewelryButton);
    }
    public void clickOnGiftCardTab(){
        clickOnElement(GiftCardButton);
    }
    public String verifyTextApparelPage(){
        return getTextFromElement(ApperealText);
    }
    public String verifyTextDigitalDownload(){
        return getTextFromElement(DigitalDtext);
    }
    public String verifyTextBooks(){
        return getTextFromElement(BooksText);
    }
    public String verifyTextJewelry(){
        return getTextFromElement(JewelryText);
    }
    public String verifyTextGiftcard(){
        return getTextFromElement(GiftCardText);
    }







}
