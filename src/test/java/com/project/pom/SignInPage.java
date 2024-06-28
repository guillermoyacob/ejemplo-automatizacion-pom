package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {

    By userLocator = By.name("userName");
    By passLocator = By.name("password");
    By signInBtnLocator = By.name("submit");

    By homePageLocator = By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img");


    public SignInPage (WebDriver driver) {
        super(driver);
    }

    public void signIn() {
        if(isDisplayed(userLocator)){
            type("qualityadmin", userLocator);
            type("pass1", passLocator);
            click(signInBtnLocator);
        } else {
            System.out.println("username textbox was not present.");
        }
    }

    public boolean isHomePageDisplayed(){
        return isDisplayed(homePageLocator);
    }
}
