package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.NopCommerceHomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    NopCommerceHomePage nopCommerceHomePage = new NopCommerceHomePage();


    public void selectMenu(String menu) {
        if (menu == "Computers") {
            nopCommerceHomePage.clickOnComputerTabOnHomePage();
            String expectedPageTitle = "Computers";
            String actualPageTitle = nopCommerceHomePage.verifyTextinComputerPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed ");

        } else if (menu == "Electronics") {
           nopCommerceHomePage.clickOnElectronicTab();
            String expectedPageTitle = "Electronics";
            String actualPageTitle = nopCommerceHomePage.verifyTextinElectronicsPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");

        } else if (menu == "Apparel") {
            nopCommerceHomePage.clickOnApprarelTab();
            String expectedPageTitle = "Apparel";
            String actualPageTitle = nopCommerceHomePage.verifyTextApparelPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        } else if (menu == "Digital downloads") {
            nopCommerceHomePage.clickOnDigitalDownloadTab();
            String expectedPageTitle = "Digital downloads";
            String actualPageTitle = nopCommerceHomePage.verifyTextDigitalDownload();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");

        } else if (menu == "Books") {
            nopCommerceHomePage.clickOnBooksTab();
            String expectedPageTitle = "Books";
            String actualPageTitle = nopCommerceHomePage.verifyTextBooks();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        } else if (menu == "Jewelry") {
            nopCommerceHomePage.clickOnJewelryTab();
            String expectedPageTitle = "Jewelry";
            String actualPageTitle = nopCommerceHomePage.verifyTextJewelry();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        } else if (menu == "Gift Cards") {
            nopCommerceHomePage.clickOnGiftCardTab();
            String expectedPageTitle = "Gift cards";
            String actualPageTitle = nopCommerceHomePage.verifyTextGiftcard();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        }
    }

    @Test
    public void verifyNavigation() {
        selectMenu("Computers");
        selectMenu("Electronics");
        selectMenu("Apparel");
        selectMenu("Digital downloads");
        selectMenu("Books");
        selectMenu("Jewelry");

    }


}
