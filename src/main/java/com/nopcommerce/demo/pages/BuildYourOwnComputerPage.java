package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By Processor= By.xpath("//select[@id='product_attribute_1']");
    By Ram=By.xpath("//select[@id='product_attribute_2']");
    By HDD=By.xpath("//input[@value='7']");
    By OS= By.xpath("//input[@value='9']");
    By Software=By.xpath("//input[@value='12']");
    By PriceVerify=By.xpath("//span[contains(text(),'$1,475.00')]");
    By AddtoCart=By.xpath("//button[contains(text(),'Add to cart')]");
    By PopUp=By.xpath("//p[@class='content']");
    By ClosepopUp=By.xpath("//span[@title='Close']");
    By ShoppingCart=By.xpath("//span[@class='cart-label']");
    By verifyTextatShoppingCart=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By ChangeQuantity=By.xpath("//input[@class='qty-input']");
    By UpdateCartButton=By.xpath("//button[contains(text(),'Update shopping cart')]");








    public void selectProcessor(){
        selectByValueFromDropDown(Processor,"1");
    }
    public void selectRam(){
        selectByValueFromDropDown(Ram,"5");
    }
    public void selectHardDsik(){
        clickOnElement(HDD);
    }
    public void selectOS(){
        clickOnElement(OS);
    }
    public void selectSoftware(){
        clickOnElement(Software);
    }
    public String verifyInitialTotal(){
        return getTextFromElement(PriceVerify);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(AddtoCart);
    }
    public String verifyPopUpMsg(){
        return getTextFromElement(PopUp);
    }
    public void clickToClosePop(){
        clickOnElement(ClosepopUp);
    }
    public void clickOnShoppingCartIcon(){
        mouseHoverAndClickOnElement(ShoppingCart);
    }
    public String verifyTextinShoppingCart(){
        return  getTextFromElement(verifyTextatShoppingCart);
    }
    public void changeQuantityinCart(){
        clearValue(By.xpath("//input[@class='qty-input']"));
        sendTextToElement(ChangeQuantity,"2");
    }
    public void clickOnUpdateCartButton(){
        clickOnElement(UpdateCartButton);
    }

}
