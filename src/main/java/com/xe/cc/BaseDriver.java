package com.xe.cc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class BaseDriver {

    public static WebDriver driver;
    private String baseURL = "https://www.xe.com/currencyconverter/";

    public void setDriver(){

        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("mac os")){
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir")+"/src/main/resources/chromedriver");
        }else{
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
        }

        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    }

    public void tearDown(){
        driver.close();
    }
}
