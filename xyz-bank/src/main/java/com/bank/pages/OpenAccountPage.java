package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By openAccount=By.xpath("//button[@ng-click='openAccount()']");
    By shylan=By.name("userSelect");
    By currency=By.id("currency");
    By process=By.xpath("//button[@type='submit']");

    public void clickOpenAccount(){
        clickOnElement(openAccount);
    }
    public void selectShylan(){
        selectByVisibleTextFromDropDown((shylan),"Shylan Birunn");
    }
    public void selectCurrency(){
        selectByValueFromDropDown((currency),"Pound");
    }
    public void clickProcess(){
        clickOnElement(process);
    }

}
