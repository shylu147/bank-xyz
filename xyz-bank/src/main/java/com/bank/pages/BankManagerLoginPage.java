package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By bankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomer1 = By.xpath("//button[@class='btn btn-default']");


    public void clickBankManagerLogin() {
        clickOnElement(bankManagerLogin);
    }

    public void clickAddCustomer() {
        clickOnElement(addCustomerTab);
    }

    public void typeFirstName() {
        sendTextToElement(firstName, "Shylan");
    }

    public void typeLastName() {
        sendTextToElement(lastName, "Birunn");
    }

    public void typePostCode() {
        sendTextToElement(postCode, "SM6 0YY");
    }

    public void clickAddCustomer1() {
        clickOnElement(addCustomer1);
    }

    public void clickOkAlert() {
        driver.switchTo().alert().accept();
    }



}
