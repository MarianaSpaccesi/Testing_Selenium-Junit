package com.FrontendTests;

import com.Pages.AccountsOverview;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AccountsOverviewTest {
    private static WebDriver driver;
    AccountsOverview accountsOverview;

    @BeforeEach
    public void setUp() throws Exception {
        accountsOverview = new AccountsOverview(driver);
        driver = accountsOverview.chromeDriverConnection();
        accountsOverview.getLink("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }


    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testingAccountOverview() throws InterruptedException {
        accountsOverview.accountsOverviewChecked();
    }
}
