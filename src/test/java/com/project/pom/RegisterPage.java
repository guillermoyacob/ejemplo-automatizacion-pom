package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage extends Base {

    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");

    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(15) > td:nth-child(2) > input[type=password]");

    By registerBtnLocator = By.name("submit");

    By registerMessage = By.tagName("font");

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void registerUser() throws InterruptedException {

        click(registerLinkLocator);
        Thread.sleep(2000);

        if(isDisplayed(registerPageLocator)){
            type("qualityadmin", usernameLocator);
            type("pass1", passwordLocator);
            type("pass1", confirmPasswordLocator);

            click(registerBtnLocator);
        } else {
            System.out.println("Register page wan not found.");
        }
    }

    public String registerMessage(){

        List<WebElement> fonts = findElements(registerMessage);
        return getText(fonts.get(5));
    }
}
