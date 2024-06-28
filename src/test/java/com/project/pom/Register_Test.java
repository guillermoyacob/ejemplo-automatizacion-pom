package com.project.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Register_Test {

    private WebDriver driver;
    RegisterPage registerPage;

    @BeforeEach
    public void setUp() throws Exception {
        registerPage = new RegisterPage(driver);
        driver = registerPage.chromeDriverConnection();
        registerPage.visit("https://demo.guru99.com/test/newtours/index.php");
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        registerPage.registerUser();
        assertEquals("Note: Your user name is qualityadmin.", registerPage.registerMessage());
    }
}
