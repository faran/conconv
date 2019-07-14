package com.xe.cc;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage{
    BasePage basePage = new BasePage();

    @Step("Checkin if GDPR notification is present first time only")
    public void gdprCheck(){
        if (basePage.size(By.xpath(Constants.btn_gdpr_ok)) !=0 ) {
            basePage.click(By.xpath(Constants.btn_gdpr_ok));
        }
    }

    @Step("Entering amount: {0} ")
    public void enterAmount(String amount){
        basePage.waitVisibility(By.id(Constants.txt_amount));
        basePage.click(By.id(Constants.txt_amount));
        basePage.writeText(By.id(Constants.txt_amount),amount);
    }

    @Step("Enter Currency: {0} in From field")
    public void enterConvertFromCurrency(String fCurr){
        basePage.click(By.xpath(Constants.txt_FromCurrencyField));
        basePage.writeText(By.xpath(Constants.txt_FromCurrency),fCurr);
        basePage.pressEnter(By.xpath(Constants.txt_FromCurrency));
    }

    @Step("Enter Currency: {0} in To field")
    public void enterConvertToCurrency(String tCurr){
        basePage.click(By.xpath(Constants.txt_ToCurrencyField));
        basePage.writeText(By.xpath(Constants.txt_ToCurrency),tCurr);
        basePage.pressEnter(By.xpath(Constants.txt_ToCurrency));
    }

    @Step("Clicking convert button")
    public void enterConvertButton(){
        basePage.click(By.xpath(Constants.btn_convert));
    }

    @Step("Verifying conversion currencies: {0}")
    public void verifyConersion(String verify){
        basePage.assertEqual(By.xpath("//*[@id=\"converterResult\"]/section/div[2]/span"),
                verify);
    }
}
