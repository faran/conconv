package com.ex.cc;

import com.xe.cc.BaseTest;
import org.testng.annotations.Test;

public class CurrencyConversionTest extends BaseTest {

    @Test(priority = 1, description = "Necessary for testing to press OK on GDPR notification")
    public void testgdprNotification(){
        homePage.gdprCheck();
    }

    @Test(priority = 2, description = "Currency conversion from Euro to British pounds")
    public void testEurToGbpConversion(){
        homePage.enterAmount("200");
        homePage.enterConvertFromCurrency("Euro");
        homePage.enterConvertToCurrency("Gbp");
        homePage.enterConvertButton();
        homePage.verifyConersion("Euro to British Pound Conversion");
    }

    @Test(priority = 2, description = "Currency conversion from Euro to Us dollars")
    public void testEurToUsdConversion() {
        homePage.enterAmount("200");
        homePage.enterConvertFromCurrency("Euro");
        homePage.enterConvertToCurrency("Usd");
        homePage.enterConvertButton();
        homePage.verifyConersion("Euro to US Dollar Conversion");
    }

    @Test(priority = 2, description = "Currency conversion from Euro to Turkish Lira")
    public void testEurToTryConversion() {
        homePage.enterAmount("200");
        homePage.enterConvertFromCurrency("Euro");
        homePage.enterConvertToCurrency("Try");
        homePage.enterConvertButton();
        homePage.verifyConersion("Euro to Turkish Lira Conversion");
    }

    @Test(priority = 2, description = "Currency conversion from Euro to Indian Rupee")
    public void testEurToInrConversion() {
        homePage.enterAmount("200");
        homePage.enterConvertFromCurrency("Euro");
        homePage.enterConvertToCurrency("Inr");
        homePage.enterConvertButton();
        homePage.verifyConersion("Euro to Indian Rupee Conversion");
    }

    @Test(priority = 2, description = "Currency conversion from Euro to Canadian Dollar")
    public void testEurToCadConversion() {
        homePage.enterAmount("200");
        homePage.enterConvertFromCurrency("Euro");
        homePage.enterConvertToCurrency("Cad");
        homePage.enterConvertButton();
        homePage.verifyConersion("Euro to Canadian Dollar Conversion");
    }
}