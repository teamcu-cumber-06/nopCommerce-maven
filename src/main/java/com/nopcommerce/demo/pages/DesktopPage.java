package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By Desktoptab=By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    By AtoZOrder=By.xpath("//select[@id='products-orderby']");
    By AddToCartButton=By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By ExpectedtextinDesktop=By.xpath("//h1[contains(text(),'Build your own computer')]");








    public void clickOnDesktopTab(){
        clickOnElement(Desktoptab);
    }
    public void productSortedAtoZ(){
        selectByValueFromDropDown(AtoZOrder,"5");
    }
    public void clickOnAddtocartbutton(){
        clickOnElement(AddToCartButton);
    }
    public String verifyTextInDesktoppage(){
        return getTextFromElement(ExpectedtextinDesktop);
    }




}
