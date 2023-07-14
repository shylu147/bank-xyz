package com.bank.testsuite;

import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.OpenAccountPage;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage=new CustomersPage();
    CustomerLoginPage customerLoginPage=new CustomerLoginPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickBankManagerLogin();
        bankManagerLoginPage.clickAddCustomer();
        bankManagerLoginPage.typeFirstName();
        bankManagerLoginPage.typeLastName();
        bankManagerLoginPage.typePostCode();
        bankManagerLoginPage.clickAddCustomer1();
        bankManagerLoginPage.clickOkAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        bankManagerLoginPage.clickBankManagerLogin();
        openAccountPage.clickOpenAccount();
        openAccountPage.selectCurrency();
        openAccountPage.clickProcess();


    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        // click on "Customer Login" Tab
        //search customer that you created.
        // click on "Login" Button
        //verify "Logout" Tab displayed.
        // click on "Logout"
        //verify "Your Name" text displayed.
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.clickCustomerLogin();
        //search customer that you created.
        customerLoginPage.selectHarry();
        //click on "Login" Button
        customerLoginPage.clickLogin();
        // click on "Deposit" Tab
        customerLoginPage.clickDeposit();
        //  Enter amount 100
        customerLoginPage.typeAmount();
        //click on "Deposit" Button
        customerLoginPage.clickDeposit1();
        //verify message "Deposit Successful"
        Assert.assertEquals(customerLoginPage.getText(),"Deposit Successful");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        //click on "Customer Login" Tab
        //  search customer that you created.
        //click on "Login" Button
        // click on "Withdrawl" Tab
        // Enter amount 50
        //click on "Deposit" Button
        //verify message "Transaction Successful"
    }

}
