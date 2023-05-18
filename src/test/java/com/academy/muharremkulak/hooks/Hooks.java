package com.academy.muharremkulak.hooks;

import com.academy.muharremkulak.driver.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver();
    }

    @After
    public void tearDown(){
        if(Driver.getDriver() != null){
            Driver.getDriver().quit();
        }
    }
}
