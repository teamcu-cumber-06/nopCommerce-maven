package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {

    NopCommerceHomePage nopCommerceHomePage = new NopCommerceHomePage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    PaymentPage paymentPage = new PaymentPage();


    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        nopCommerceHomePage.clickOnComputerTabOnHomePage();
        desktopPage.clickOnDesktopTab();
        desktopPage.productSortedAtoZ();
        Thread.sleep(1000);
        desktopPage.clickOnAddtocartbutton();

        String expextedtext = "Build your own computer";                                      //2.5 Build your own computer text verified
        desktopPage.verifyTextInDesktoppage();
        Assert.assertEquals("Build your own computer page not found", expextedtext, desktopPage.verifyTextInDesktoppage());
        Thread.sleep(1000);

        buildYourOwnComputerPage.selectProcessor();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectRam();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectHardDsik();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectOS();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectSoftware();
        Thread.sleep(1000);

        String expectedmsg = "$1,475.00";                   //2.11    price verified
        Thread.sleep(1000);
        String actualmsg = buildYourOwnComputerPage.verifyInitialTotal();
        Assert.assertEquals("Price not verified", expectedmsg, actualmsg);
        Thread.sleep(1000);

        buildYourOwnComputerPage.clickOnAddToCartButton();  //2.12 Add to cart

        String expectedmsg1 = "The product has been added to your shopping cart";   //2.13 message varified
        String actualmsg1 = buildYourOwnComputerPage.verifyPopUpMsg();
        org.testng.Assert.assertEquals(expectedmsg1, actualmsg1, "msg not varified");
        Thread.sleep(1000);

        buildYourOwnComputerPage.clickToClosePop();
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnShoppingCartIcon();

        String expectedmsg2 = "Shopping cart";                 //verify msg
        String actualmsg2 = buildYourOwnComputerPage.verifyTextinShoppingCart();
        Assert.assertEquals("Shopping cart page not found", expectedmsg2, actualmsg2);
        Thread.sleep(1000);

        buildYourOwnComputerPage.changeQuantityinCart();   //2
        buildYourOwnComputerPage.clickOnUpdateCartButton();
        Thread.sleep(1000);

        String expectedAmount = "$2,950.00";                 //2.17 verify amount $2950.00
        String actualAmount = shoppingCartPage.verifyAmountText();
        org.testng.Assert.assertEquals(expectedAmount, actualAmount, "Amount not Matched");
        Thread.sleep(1000);
        shoppingCartPage.clickOnIagreeCheckBox();
        Thread.sleep(1000);
        shoppingCartPage.clickOnCheckOutButton();
        shoppingCartPage.clickonCheckOutasGuest();
        checkoutPage.EnterYourName();
        checkoutPage.EnterLastName();
        checkoutPage.EnterYourEmail();
        checkoutPage.SelectYourCountry();
        checkoutPage.SelectYourState();
        checkoutPage.EnterYourCity();
        checkoutPage.EnterYourAddress();
        checkoutPage.EnterYourZipcode();
        checkoutPage.EnterYourPhone();
        Thread.sleep(1000);
        checkoutPage.clickOnContinueButton();
        Thread.sleep(1000);
        checkoutPage.SelectShppingMethod();
        checkoutPage.selectContinuetoFurther();
        Thread.sleep(1000);

        paymentPage.selectPaymentMethod();
        Thread.sleep(1000);
        paymentPage.ClickonContinue();
        Thread.sleep(1000);
        paymentPage.Selectcard();
        paymentPage.EnterCardHolderName();
        paymentPage.EnterCardNumber();
        paymentPage.EnterMonthofCard();
        paymentPage.EnterYearofCard();
        paymentPage.EnterCardCVV();
        paymentPage.clickContinueforPayment();
        paymentPage.clicktoConfirm();

        String expectedThankYou = "Thank you";      //2.35 Thank you text verified
        String actualThankYou = paymentPage.verifyThankYoutext();
        org.testng.Assert.assertEquals(expectedThankYou, actualThankYou, "Text not mathched");

        String expectedOrderStatus = "Your order has been successfully processed!";   //2.36  verify text
        String actualOrderStatus = paymentPage.verifyOrderStatus();
        org.testng.Assert.assertEquals(expectedOrderStatus, actualOrderStatus, "Order not placed");

        paymentPage.clickContinuetoHome();

        String expectedWelcome = "Welcome to our store";
        String actualWelcome = paymentPage.verifyTextOnHomePage();
        org.testng.Assert.assertEquals(expectedWelcome, actualWelcome, "Page does not navigate to home page");


    }


}
