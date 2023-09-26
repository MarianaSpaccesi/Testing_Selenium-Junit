package com.FrontendTests;

import com.Pages.NewAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class NewAccountTest {
    private static WebDriver driver;
    NewAccount newAccount;

    @BeforeEach
    public void setUp() throws Exception {
        newAccount = new NewAccount(driver);
        driver = newAccount.chromeDriverConnection();
        newAccount.getLink("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }


    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testingAccount() throws InterruptedException {
        newAccount.accountCreated();
    }
}
