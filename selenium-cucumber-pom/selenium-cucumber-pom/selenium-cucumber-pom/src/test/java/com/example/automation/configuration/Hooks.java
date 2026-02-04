package com.example.automation.configuration;

//import org.junit.After;
//import org.junit.Before;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {

        DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
      //  DriverFactory.quitDriver();
    }
}
