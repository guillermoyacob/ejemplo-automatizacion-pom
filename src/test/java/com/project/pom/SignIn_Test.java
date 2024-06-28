package com.project.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignIn_Test {

    private WebDriver driver;
    SignInPage signInPage;

    @BeforeEach
    public void setUp() throws Exception {
        signInPage = new SignInPage(driver);
        driver = signInPage.chromeDriverConnection();
        signInPage.visit("https://demo.guru99.com/test/newtours/");
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {
        signInPage.signIn();
        Thread.sleep(2000);
        assertTrue(signInPage.isHomePageDisplayed());
    }
}
