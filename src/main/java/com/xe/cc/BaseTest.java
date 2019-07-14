package com.xe.cc;

import org.testng.annotations.*;

public class BaseTest {
    BaseDriver baseDriver = new BaseDriver();
    public BasePage basePage;
    public HomePage homePage;

    @BeforeSuite
    public void beforeSuite(){
        baseDriver.setDriver();
       basePage = new BasePage();
       homePage = new HomePage();
    }

    @AfterClass
    public void afterTest(){
        baseDriver.tearDown();
    }
}
