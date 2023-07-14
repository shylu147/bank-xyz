package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By customers=By.xpath("//button[@ng-click='showCust()']");
    public void clickCustomers(){
        clickOnElement(customers);
    }
}
