package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By customerLogin= By.xpath("//button[@ng-click='customer()']");
    By harry=By.id("userSelect");
    By login=By.xpath("//button[@type='submit']");
    By deposit=By.xpath("//button[@ng-click='deposit()']");
    By amount=By.xpath("//input[@ng-model='amount']");
    By deposit1=By.xpath("//button[@type='submit']");
    By text = By.xpath("//span[@class='error ng-binding']");

    public void clickCustomerLogin(){
        clickOnElement(customerLogin);
    }
    public void selectHarry(){
        selectByValueFromDropDown((harry),"2");
    }
    public void clickLogin(){
        clickOnElement(login);
    }
    public void clickDeposit(){
        clickOnElement(deposit);
    }
    public void typeAmount(){
        sendTextToElement((amount),"100");
    }
    public void clickDeposit1(){
        clickOnElement(deposit1);
    }
    public String getText(){return getTextFromElement(text);

    }
}
